var person = new Object();

person["firstName"] = "Anuj";
// one way to set and access properties and methods
// computer member access operator ...[...]
// one way using a string to access this
// dynamically decide what propery name is
person["lastName"] = "Kumar";

var firstNameProperty = "firstName";
console.log(person);
console.log(person[firstNameProperty]);

// another way to access properties and methods
// member access operator ...<.>...
console.log(person.firstName);
console.log(person.lastName);

// object sitting inside an object
person.address = new Object();
person.address.houseNo = "B-506";
person.address.city = "Surat";
person.address.state = "Gujarat";
// member access operator has associativity left to right
// person.address -> first get the address object from the memory

console.log(person.address);
console.log(person.address.city);
console.log(person["address"]["city"]);