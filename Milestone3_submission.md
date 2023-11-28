<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Fuzail Shahzad (uf7)</td></tr>
<tr><td> <em>Generated: </em> 11/27/2023 9:59:07 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/uf7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-27T23.49.46image.png.webp?alt=media&token=d1635a2d-7722-4046-92c4-8664f345b618"/></td></tr>
<tr><td> <em>Caption:</em> <p>This is a screenshot showing the chat ui that contains host and port<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-27T23.50.47image.png.webp?alt=media&token=62c971da-68f9-4c05-acad-a489e8db72a1"/></td></tr>
<tr><td> <em>Caption:</em> <p>This is a screenshot showing the chat ui that contains the username<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <p>For the host and port UI elements I added the ConnectionPanel.java file. This<br>file contained a connectionpanel method that added host info, port info, add button,<br>and an add listener. For the add listener it went through a try-catch<br>block that caught any invalid port numbers. For the username UI element I<br>added the userinputpanel.java file. This file contained a userinputpanel method that gave the<br>UI buttons and also allowed for the user to input a username. I<br>also added a if-statement that ensures the username does not allow any spaces.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T00.11.07image.png.webp?alt=media&token=4369e491-cb0e-4680-be51-d03592af3b5f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the list of users in the room and the chat<br>message area with the chat history<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T00.16.50image.png.webp?alt=media&token=85b1c667-1cfd-45fa-9c05-6e1250d1b792"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows the code that lets the enter key send the message<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.02.07image.png.webp?alt=media&token=3739032d-513e-4068-918d-ae7dcf76f921"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the flip and roll functions.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.11.09image.png.webp?alt=media&token=b2deac7c-df5f-484f-98cc-cb4a0af8d5b0"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for the flip and roll functions along with their<br>text formats.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <p>For the roll #d# I used a else if block that would check<br>if the words being input start with roll. If they did it would<br>be passed to a try block that would split the command at the<br>space after roll. Then it would split the #d# at the character d.<br>This would give us an array of two values. The first value was<br>set equal to diceCount whereas the second value was set equal to diceSides.<br>Next a variable named diceTotal would be declared which would then be used<br>in a for loop that would use the math.random operator to give a<br>value based on the diceSides variable. This value was then added to diceTotal<br>and the for loop would add 1 to i to go through the<br>loop once more. A broadcast would then send each client who did what<br>and got what result. The other roll method simply checks what number the<br>second index value is, and based off this it uses the math.random value<br>to assign a random number from 0 to the determined value. This is<br>then broadcasted to the client. The flip function works by declaring a coin<br>variable and then assigning it either a zero or a one using the<br>math.random operator. Another variable is made called value. If value is equal to<br>zero, then coin is set equal to tails. And if value is equal<br>to one, then coin is set equal to heads. The flow works by<br>first going to client, then serverthread, then room, and finally returning to client.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.31.34image.png.webp?alt=media&token=3242b416-13cf-4551-a759-4f1f49955363"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows all the text features independently<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.35.48image.png.webp?alt=media&token=1e286a68-166e-43ae-ab2f-6d7f07179a72"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the input string used in the chat send area.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.36.42image.png.webp?alt=media&token=6ab8c4b1-d275-4449-9540-b8058937c47c"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows all the text features and the blue color feature in one<br>message.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>I got it to render the text by changing the&nbsp;addText method in Chatpanel<br>and making the output show &quot;text/html&quot;.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.43.42image.png.webp?alt=media&token=ac43c959-c38b-48ed-ae5c-9114df9c6551"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the whisper feature<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.48.04image.png.webp?alt=media&token=ae02eeb0-5c11-479a-81ad-35109b012d75"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for the whisper feature.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T01.48.44image.png.webp?alt=media&token=fadf2157-dfab-44e6-8f76-324288497eb7"/></td></tr>
<tr><td> <em>Caption:</em> <p>This is the code for a method I made that I used in<br>the whisper feature.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>First I made a method that would allow me to find a specific<br>clientname out of the list of clients from ServerThread. This method is called<br>findUser. An if-statement is added to the sendMessage method. This if-statement checks if<br>the message begins with an @. If it does it goes through the<br>if block. A string array is created that strips off all spaces. This<br>string array is called words. The first index value would be the name,<br>which is set equal to whispername. Whispername is then passed through findUser which<br>finds a clientname that fits. If it find a user, it then passes<br>the rest of the string array through in sendmessage statements that are passed<br>to the indended user and the user who sent the whisper.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T02.05.27image.png.webp?alt=media&token=dcd28395-1829-4c79-a076-6791e5d951d1"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the mute feature.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T02.25.09image.png.webp?alt=media&token=80471f4b-3e2d-43cd-950c-ec88cd449852"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the element in ServerThread that Room should interact with a mute<br>list<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T02.25.55image.png.webp?alt=media&token=f81db24b-84bf-4250-8731-32c908fa61c4"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how room interacts with serverthread<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T02.38.14image.png.webp?alt=media&token=16f2714b-4a4e-4af8-9237-f4c4e937d0ac"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the ServerThread<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-28T02.45.17image.png.webp?alt=media&token=b15d330f-2990-4142-bc61-c97bf1cdb9dc"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the payload side code<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>It starts with the server thread in which we make three different methods.<br>These methods are called sendMuteUser, sendUnmuteUser, and isMuted. The isMuted list is the<br>one that room communicates with. We also added Payload types. These payloads are<br>COMMAND, MUTE, and UNMUTE. This is then passed through three more methods: muteUser,<br>unmuteUser, and processMute. The processMute method splits the message caught into a string<br>array. The first index value being what the action is, and the second<br>index value being what the username is. This is then passed to a<br>switch case. If the case is MUTE, then it is passed to the<br>muteUser method. If the case is UNMUTE, then it is passed to the<br>unmuteUser method. Each of these methods create a new payload object called &quot;p&quot;.<br>The payload object is then set equal to a serverthread enum. Another method<br>in serverthread is used called isMuted. And this is the list mentioned previously.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/fuzloxp/uf7-IT114-005/pull/8">https://github.com/fuzloxp/uf7-IT114-005/pull/8</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone3/grade/uf7" target="_blank">Grading</a></td></tr></table>