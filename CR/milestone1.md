<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Fuzail Shahzad (uf7)</td></tr>
<tr><td> <em>Generated: </em> 10/23/2023 10:45:00 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-milestone1/grade/uf7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project if one doesn't exist yet</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github (yes it'll be blank for now)</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet, just have it in open status)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Fix the package references at the top of each file (these are the only edits you should do at this point)</li><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><ol><li>Note: The client commands likely are different in part 5 with the /name and /connect options instead of just connect</li></ol><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-10-24T01.51.50image.png.webp?alt=media&token=e2e77145-5487-45b5-a087-1a2d56c859b7"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the server up and running and connected to the port.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-10-24T01.49.59image.png.webp?alt=media&token=bb8101b2-1b49-4c4f-9318-88c9b3b2959a"/></td></tr>
<tr><td> <em>Caption:</em> <p>This screenshot shows two clients connected to the server with both having different<br>names and connected to the server.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>The server side of the connection begins by first running the <i>./build.sh CR<br>server </i>command line that serves as a javac command. Next we run the<br><i>./run.sh CR server</i> command. This runs the file and gets it ready for<br>potential clients who will join. The client side of the connection also begins<br>with a <i>./build.sh</i> and a <i>./run.sh</i> and after these we can name the<br>clients. We name then by typing <i>/name [inset name here]</i>. After this we<br>connect to the server by typing <i>/connect localhost:3000</i>.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-10-24T02.12.25image.png.webp?alt=media&token=5fb96c19-088c-4576-a17d-2b858cc8cb71"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows two clients connected to the server and shows how the clients<br>can send messages that are seen in the server terminal. The server also<br>sends messages to all the clients who are in the same room. The<br>messages also shows who sent the message and anyone who isn&#39;t in the<br>room can&#39;t see messages from other rooms. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted (sent to all connected clients), and received</td></tr>
<tr><td> <em>Response:</em> <p>The client perspective is sending a message and making an object that contains<br>the message inside of it. This is then sent to the ServerThread that<br>processes it and proceeds to send it to the room. The room processes<br>any commands and objects and sends it to the server. And then the<br>server processes this and sends it to the clients once more that displays<br>it in the git bash terminal.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-10-24T02.29.04image.png.webp?alt=media&token=d9c77e9a-d35d-457d-9ac4-dee35f500d45"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows a client that has disconnected and the empty room closing. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-10-24T02.33.57image.png.webp?alt=media&token=241a735e-6ec8-4927-bdcf-715f8aea9955"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the server terminating<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>The client programs and the server program are two different files and programs<br>as such they are independent of one another and do not need each<br>other to run. When the client disconnects, the server is programmed to keep<br>running and vice versa. The server does not crash as it was designed<br>to keep running after clients have disconnected.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/fuzloxp/uf7-IT114-005/pull/6">https://github.com/fuzloxp/uf7-IT114-005/pull/6</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>N/A<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-milestone1/grade/uf7" target="_blank">Grading</a></td></tr></table>