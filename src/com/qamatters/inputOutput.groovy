package com.qamatters

// Run it with the help of terminal :groovy inputOutput.groovy
print "Enter My Name : "
def name = System.console().readLine()
print "Hello ${name}"

print "Enter first number :"
def num1 = System.console().readLine().toInteger();
print "Enter second number :"
def num2 = System.console().readLine().toInteger();
def sum = num2 + num1
println( "sum is : ${sum}");

// Output
/*
print
println
printf
 */