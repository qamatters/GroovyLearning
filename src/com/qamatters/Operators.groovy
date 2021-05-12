package com.qamatters

assert 2+3 == 5
assert 4-3 == 1
assert 2*3 == 6
assert 5/2 == 2.5
assert 5%2 == 1
assert 2**3 == 8
println("-------------------------------------------")

println (2.2.plus(3.3))
println ("deepak".plus("mathpal"));

println("-------------------------------------------")
//Unary operators
assert +3 == 3
assert -3 == 0-3
assert -(-1) == 1

//Ternary operator
String a = 10;
if(a!= null && a.length()>0) {
    println(a)
} else {
    println("String not found")
}


result = (a!= null && a.length()>0) ?  "String found with value ${a}" : "String not found"
println(result)

result1 = a? "String found with value ${a}": "String not found"
println(result1)




