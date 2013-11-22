/*var timerid = 0;
var images = new Array("1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg");
var countimages = 0;
function startTime() {
	alert(document.getElementById("section").style["background-image"]);
	
	if(timerid) {
		timerid = 0;
	}
	var tDate = new Date();

	if(countimages == images.length){
		countimages = 0;
	}

	if(tDate.getSeconds() % 2 == 0)	{
		document.getElementById("section").style["background-image"] = "images/" + images[countimages];
		document.getElementById("section").style["background-repeat"] = "no-repeat";
	}
	countimages++;

	timerid = setTimeout("startTime()", 2000);
}*/

jQuery(window).load(function(){
    var images = ["1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg", "6.jpg"];
    var i = 0;
    var timeoutVar;

    function changeBackground() {
        clearTimeout(timeoutVar); // just to be sure it will run only once at a time

        jQuery('#section').css('background-image', function() {
            if (i >= images.length) {
                i=0;
            }
            return 'url(\'images/' + images[i++] + '\')';      
        });

        // call the setTimeout every time to repeat the function
        timeoutVar = setTimeout(changeBackground, 5000);
    }

    // Call it on the first time and it will repeat
    changeBackground();        
});