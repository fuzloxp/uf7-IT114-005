package Part3HW;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);
                    
                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;
                    
                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}
    
    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier
        
        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }

    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);
        if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);
                    
                    break;
                }
            }
            return true;
        }
        // got help from Sajid for both implementations
        //uf7-10/10/23-IT114-005
        //the code below is an implementation of the coin assignment
        else if (message.trim().equalsIgnoreCase("flip")){
            int coin = (int)(Math.random()*2);
            String value = "";
            if (coin == 0){
                value = "tails";
            }
            else if (coin == 1){
                value = "heads";
            }   
            broadcast(String.format("user %s flipped a coin and got %s",clientId,value), clientId);
            return true;
        }   
        else if (message.startsWith("roll")){
            try{
                String diceCount = message.split(" ")[1].split("d")[0];
                String diceSides = message.split(" ")[1].split("d")[1];
                int diceTotal = 0;
                for (int i = 0; i < Integer.parseInt(diceCount); i++){
                    int roll = (int)(Math.random()*Integer.parseInt(diceSides))+1;
                    diceTotal += roll;
                }
                broadcast(String.format("user %s rolled %sd%s and got %s", clientId, diceCount, diceSides, diceTotal), clientId);
            }catch(NumberFormatException e){
                broadcast("invalid input", clientId);
            }catch(ArrayIndexOutOfBoundsException e){
                broadcast("invalid input", clientId);
            }
            return true;
        }   
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}