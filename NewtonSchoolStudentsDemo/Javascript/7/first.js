function a() {
    var myVar = 2;
    b();
    function b() {
        console.log(myVar);
    }    
}

var myVar = 1;
a();