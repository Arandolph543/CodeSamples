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
	  