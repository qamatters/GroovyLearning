package com.qamatters

/*

Single quoted '..'
double quoted ".."
tripe single quoted '''...'''
triple double quoted """..."""
slashy /.../
dollar slashy $/.../$

 */

def name = "deepak"
println name

// double quotes for interpolation
println "My name is " + name
println "My name is ".concat(name)
println "My name is ${name}"

println("--------------------------------------")

// single quotes
println 'My name is '.concat(name)
println 'My name is ' + name
println 'My name is ${name}'

// Triple single quote for multilines
def s1 = '''This is a groovy class
 and we are learning strings '''
println(s1)
println("--------------------------------------")

// String methods
println("length of the long string is: "  + s1.length())
println("second character  in my name string is: " + name[1])
println("Second character from reverse in my name is: " + name[-2] )
println("Index of p in my name is : " + name.indexOf('p'))
println("Print char start to some index : " + name[0..2])
println("Print char back to some index : " + name[5..3])
println("Print char at different positions : " + name[2,3,4])

println("--------------------------------------")

def str = "This is a groovy session"
println(str.split(" "))
println(str - ("groovy"))

println("--------------------------------------")
println str.toList();
println("--------------------------------------")

def name1 = "test";
def s3 = /a green tree $name1/
def s4 = $/ a blue sky $name1/$

println(s3)
println(s4)
println("--------------------------------------")

def s5 = / my name is "deepak" /
print(s5)




