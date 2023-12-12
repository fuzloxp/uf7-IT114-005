<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone4</td></tr>
<tr><td> <em>Student: </em> Fuzail Shahzad (uf7)</td></tr>
<tr><td> <em>Generated: </em> 12/11/2023 11:22:48 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/uf7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Client can export chat history of their current session (client-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot of related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-11T01.43.41image.png.webp?alt=media&token=0179110d-8ebc-4425-9e81-bd9a258eadfb"/></td></tr>
<tr><td> <em>Caption:</em> <p>This is a screenshot showing the export function.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot of exported data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-11T01.45.13image.png.webp?alt=media&token=9675e23d-5108-4dca-9b1a-94fcb749c923"/></td></tr>
<tr><td> <em>Caption:</em> <p>A snapchat of an export that includes text formatting.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>First I made a Jbutton object that allows a UI object to exist<br>on the chatroom project. This button then calls on the chatExport method. The<br>chatExport method makes a Component Array which adds each message sent into it.<br>Next a try block is executed which uses filewriter to make a file.<br>This file is run through a for loop which goes through the Component<br>Array and copies each array value into the text file.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Client's mute list will persist across sessions (server-side) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot of how the mute list is stored</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-12T02.23.44image.png.webp?alt=media&token=33dfc9b1-09dd-4e77-814d-16559a0c5305"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the mute list being stored<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the code saving/loading mute list</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-12T02.24.17image.png.webp?alt=media&token=652d7b2e-f303-4335-a84c-29a9ded6463f"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows two methods written for the saving and the loading logic.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I first made a string called mutepersistlist. This is then called to two<br>methods called updatemutelist and loadmutelist. Updatemutelist makes a printwriter object. A for-loop then<br>goes through mutedUser and adds all items into the printwriter object. There is<br>also a loadmutelist object that is called when the client connects.To use updatemumtelist<br>I simply call it in my mute and unmute cases.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Client's will receive a message when they get muted/unmuted by another user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a screenshot showing the related chat messages</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-12T02.51.02image.png.webp?alt=media&token=97cef040-fb90-4a0f-8fd8-b9d0af138930"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing mute/unmute messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add a screenshot of the related code snippets</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-12-12T02.51.38image.png.webp?alt=media&token=fd35b121-2421-4e3c-9d76-6566f41ae0ee"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows where the code for the mute and unmute messages work<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>I make a room object that is set equal to the current room.<br>This is then put through an if-statement. If the room is not equal<br>to null then the muted user gets a message that will say &quot;you<br>have been muted&quot;. The same code is present for the unmute message the<br>only difference being the message sent.<div><br></div><div><br></div><div>-&nbsp;<a href="https://github.com/fuzloxp/uf7-IT114-005/tree/Milestone4/CR">https://github.com/fuzloxp/uf7-IT114-005/tree/Milestone4/CR</a>&nbsp;</div><div><br></div><div>There is the pull request link as there<br>isn&#39;t a deliverable for it.&nbsp;</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> User list should update per the status of each user </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707795-a9c94a71-7871-4572-bfae-ad636f8f8474.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot for Muted users by the client should appear grayed out</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot for Last person to send a message gets highlighted</td></tr>
<tr><td><table><tr><td>Missing Image</td></tr>
<tr><td> <em>Caption:</em> (missing)</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain how you implemented this</td></tr>
<tr><td> <em>Response:</em> <p>(missing)</p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone4/grade/uf7" target="_blank">Grading</a></td></tr></table>