
var xhr = new XMLHttpRequest();
xhr.onreadystatechange = function(callback){
    console.log("State: ", this.readyState, "Status: ", this.status);
    if (this.readyState == 4 && this.status == 200){
        var url = window.URL || window.webkitURL;
        document.querySelector("#img").src = 
        url.createObjectURL(this.response);
		callback(url);
    }else if(this.readyState == 4){
        console.log(this.status);
    }else{
    	var blob = this.response;
        callback(blob);
    }
}
xhr.open('GET', 'image.png');
xhr.responseType = 'blob';	
setTimeout(function(){
	xhr.send();
},2000);