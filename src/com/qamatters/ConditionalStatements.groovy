package com.qamatters

//to check number is even or odd
def num = 10;
if(num%2 == 0) {
    println("Number ${num} is even" )
} else {
    println("Number ${num} is odd" )
}

// Nested if else
def num1 = 0;
if(num1 >0) {
println("num is positive")
} else if (num1<0) {
    println("num is negative")
} else {
    println ("Number is 0")
}

//Switch case
def x = 10
def result = ""

switch (x) {
    case {x == 0}:
        result = "x is zero"
        break
    case {x > 0}:
        result = "x is positive"
        break
    case {x < 0}:
        result = "x is negative"
        break
    default:
        result = " invalid number"

}
println( " result from switch case is : " + result)