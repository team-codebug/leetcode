function getCourse() {
    return // automatic semicolon insertion happened here
    {
        course: "Javascript"
    };
}

// automatic semicolon insertion after return
// becomes return;

console.log(getCourse());

function getCourse2() {
    return {
        course: "Javascript"
    };
}

console.log(getCourse2());
