/*
Author: April Randolph
Description: Interview to detect gif load or load failure using callbacks.
Date: 11/26/2017

*/

function testImage(url, callback, timeout) {
    timeout = timeout || 5000;
    var timedOut = false, timer;
    var img = new Image();
    img.onerror = img.onabort = function() {
        if(!timedOut) {
            clearTimeout(timer);
            callback(url, "error");
        }
    };
    img.onload = function() {
        if(!timedOut) {
            clearTimeout(timer);
            callback(url, "success");
        }
    };
    img.src = url;
    timer = setTimeout(function() {
        timedOut = true;
        callback(url, "timeout");
    }, timeout); 
}
    

function record(url, result) {
    document.body.innerHTML += "<span class='" + result + "'>" + 
        result + ": " + url + "</span><br>";
}   
//Call testImage with a url and using record

