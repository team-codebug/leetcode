function greet(firstName, lastName, language) {
    language = language || "spanish";

    if (language === "spanish") {
        console.log("Hola " + firstName + " " + lastName);
    }

    if (language === "english") {
        console.log("Hello " + firstName + " " + lastName);
    }
}
// too many things to be worried about when thinking about 
// function overloading
greet("Anuj", "Kumar");
greet("Anuj", "Kumar", "english");

function greetEnglish(firstName, lastName) {
    greet(firstName, lastName, "english");
}

function greetSpanish(firstName, lastName) {
    greet(firstName, lastName, "spanish");
}

greetEnglish("Anuj", "Kumar");
greetSpanish("Anuj", "Kumar");