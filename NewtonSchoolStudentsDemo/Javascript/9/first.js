function waitThreeSeconds() {
    var newTime = 3000 + new Date().getTime();

    while (new Date() < newTime) {}
    console.log("Finished Long Processing Function");
}

function clickHandler() {
    console.log("Click Event");
}

document.addEventListener("click", clickHandler);

waitThreeSeconds();
console.log("Finished execution");
