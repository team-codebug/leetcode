// operator precedence
// synchronous...
// operators are functions...
// +(*(4, 5), 3)
var a = 3 + 4 * 5;
console.log(a);
// https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Operator_Precedence

var b = 2, 
    c = 3, 
    d = 4;

console.log(b, c, d);
// =(b, =(c, d)) - returns the value 
// of parameter on the right hand side

// associativity of 'assignment' operator is right to left
