// object literal syntax
// syntax parser sees a curly brace and it thinks that you are trying
// to create an object when executing the code
var person = {};
console.log(person);
// same as doing "new Object()"
// shorthand for the above

// setting properties and methods in the object
var personNew = {
    firstName: "Anuj",
    lastName: "Kumar",
    address: {
        houseNo: "B-506",
        city: "Surat",
        state: "Gujarat"
    }
};
console.log(personNew);
// same as doing 
// personNew = new Object();
// personNew.firstName = "Anuj";
// personNew.lastName = "Kumar";
// ...
// but the above dot notation is quicker to write...
// preferred way to quickly create objects...

function greet(person) {
    console.log("Hi " + person.firstName);
}

greet(personNew);
greet({
    firstName: "Ankit",
    lastName: "Kumar"
}); // ability to create objects on the fly

personNew.addressNew = {
    houseNo: "C-001",
    city: "Bangalore",
    state: "Karnataka"
};

// creates this object in memory and properties and 
// methods in memory
