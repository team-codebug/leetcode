var objectLiteral = {
    firstName: "Anuj",
    isAnInstructor: true
};
console.log(objectLiteral);

// Earlier, data was sent over the network in the form
// of XML
/**
 * <object>
 *  <firstName>Anuj</firstName>
 *  <isAnInstructor>true</isAnInstructor>
 * </object>
 */

// we are sending lots of data over the wire...
// too much bandwidth consumption...
// inspiring from object literal, JSON... Keys are 
// wrapped in quotes.
/**
 * {
 *     "firstName": "Anuj",
 *     "isAnInstructor": true
 * }
 */
// JSON is a subset of object literal notation
// all JSON are valid object literals. But not the other way round
// JSON is actually not part of javascript
console.log(JSON.stringify(objectLiteral));

var jsonVal = JSON.parse('{ "firstName": "Anuj", "isAnInstructor": true}');
console.log(jsonVal);