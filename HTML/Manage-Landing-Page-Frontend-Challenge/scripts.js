/* Description: These are added animations that not in the requirements though as the latest frontend styles are available the implementation is be added for up to date code implementation. 
Author: April Randolph Date: 07/13/20 */

$(function() {
    var boxDraw = $(".sectionrow");
    var boxDrawTop = boxDraw.offset().top;
    var windowHeight = $(window).height();

    $(window).scroll(function() {
        var scroll = $(window).scrollTop();
        if ( scroll >= ( boxDrawTop - windowHeight )) {
            boxDraw.addClass("draw");
        } 
    });
});
 