package com.qamatters

def firstName = "deepak";
def lastName = "mathpal";
println "Full name is ${firstName} ${lastName}"
println("---------------------------------------------------")

//Groovy is case sensitive
def x = 20;
println x
// println X : X is not identified
println("---------------------------------------------------")

//Groovy is dynamic typing
def name = "deepak";
name = 10
println name;
println("---------------------------------------------------")

// Multiple assignments
def (a,b,c) = ["I am string type inside multiple assignment",40,50.2]
println a
println b
println c
