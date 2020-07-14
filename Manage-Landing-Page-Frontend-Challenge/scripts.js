/* Description: These are added animations that not in the requirements though as the latest frontend styles are available the implementation is be added for up to date code implementation. 
Author: April Randolph Date: 07/13/20 */

function myMove() {
	  var elem = document.getElementById("sectionfirst");   
	  var pos = -230;
	  var id = setInterval(frame, 10);
	  function frame() {
		if (pos == 350) {
		  clearInterval(id);
		} else {
		  pos++; 
		  elem.style.right = pos + 'px'; 
		  elem.style.left = pos + 'px'; 
		}
	}
}
	  
