<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Fuzail Shahzad (uf7)</td></tr>
<tr><td> <em>Generated: </em> 11/14/2023 7:30:21 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/uf7" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.34.10image.png.webp?alt=media&token=bbbbe49a-75ba-48cf-bafe-3854de835628"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the explanation a few payload methods.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.42.47image.png.webp?alt=media&token=d0499cf4-9166-4379-8ace-97b2daeb9377"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the explanation a few payload methods. (continued)<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.45.00image.png.webp?alt=media&token=8568c950-e31a-4086-9502-4e3afad66942"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows my code of the roll and flip functions.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>&nbsp; &nbsp; &nbsp;The flip command is carried out with a simple if statement<br>that checks whether <i>value </i>(string variable) has a value of zero or one.<br>Before the for-loop it is given a random value from zero to one<br>using the Math.random operator. If its value is zero, value is set equal<br>to tails, and if it is equal to one, value is set equal<br>to heads.&nbsp;<div>&nbsp; &nbsp; &nbsp;The roll command is carried out with an if-statement that<br>checks if the command contains a <i>d</i>. If it does then it goes<br>through a try block that splits the message at the space and then<br>splits it again at the d. This will give us two numbers in<br>an array. The first lets us know how many dice there are and<br>the second tells us how many sides each of those dice have. Then<br>those two variables are used in a for-loop that gets two random numbers<br>within the range of the second number and adds them together. This value<br>is set equal to diceTotal which is then outputted. If there is no<br><i>d</i>, then it will simply use the number stated, and find a value<br>using the math.random operator.</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.57.48image.png.webp?alt=media&token=edc5667e-6e4d-4494-9b1b-f573892a7aa4"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for the bold processing.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.58.54image.png.webp?alt=media&token=a1486e1e-1737-4072-9c55-c45477c98602"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for italics processing.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-14T23.59.55image.png.webp?alt=media&token=b5d1af2b-921d-40ed-9e6c-d05c6c4dc4c3"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for underlining processing.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.00.49image.png.webp?alt=media&token=377d06bc-616c-4ffb-b09f-bdbad98d83ef"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code of color (red) processing.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.01.39image.png.webp?alt=media&token=f57d748b-2518-4700-8b4e-34870c985412"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for color (green) processing.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.03.16image.png.webp?alt=media&token=ace96f67-2563-438c-b99c-bbd32d41ad56"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the code for color (blue) processing.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.07.29image.png.webp?alt=media&token=a4f52e2a-3df1-4f1e-b139-9df8da4f941d"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how bold and italics is displayed.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.10.10image.png.webp?alt=media&token=fb15e05f-3fe4-452d-a591-cceebec8c569"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how the underline and the red color is displayed.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.14.51image.png.webp?alt=media&token=5a52fff3-ba66-4ab0-914c-67f7b1e2eff6"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how the green color and blue color is displayed.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://firebasestorage.googleapis.com/v0/b/learn-e1de9.appspot.com/o/assignments%2Fuf7%2F2023-11-15T00.17.15image.png.webp?alt=media&token=40c65c6f-c476-43f7-9fdc-7c4ab0635f3e"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows a combination of all options mixed together.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <p>All of the code for bold, italics, colors, and underline are the same<br>just with different html headings and different symbols. It goes through a if-statement<br>that checks if the message contains the symbol. If it goes it gets<br>passed to a for-loop that checks each index value of the message and<br>finds the number of symbols in the message. The first symbol it finds<br>will be substituted for the html heading, and the second symbol will be<br>substituted for the html ending. However, at the end of the loop there<br>is another if-loop that checks the number of symbols. If there is an<br>extra symbol then it will be left alone without being changed into an<br>html heading or ending.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/fuzloxp/uf7-IT114-005/pull/7">https://github.com/fuzloxp/uf7-IT114-005/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F23/it114-chatroom-milestone-2/grade/uf7" target="_blank">Grading</a></td></tr></table>