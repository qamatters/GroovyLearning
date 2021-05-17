package com.qamatters
/*
--------------------------
1. How to read file as string
2. How to read file as List
3. How to read file as Array
4. How to read file line by line
5. How to delete file

 */

String filepath = "C:/Users/deepak.mathpal/IdeaProjects/GroovyLearning/data1.txt"
File myfile = new File(filepath)

// How to read file as string
println "text : ${myfile.text}"

println("-----------------------------------------------------")
// Collect content to list
def list = myfile.collect{it}
println " list : ${list}"
println("-----------------------------------------------------")

// collect as array
def myArray = myfile as String[]
println " array : ${myArray}"
println("-----------------------------------------------------")

// read lines into a list of string
def lines = myfile.readLines()
println "lines : ${lines}"
println("-----------------------------------------------------")

// read line by line
myfile.eachLine {line->
    println "line : ${line}"
}

println("-----------------------------------------------------")
// read line by line with linenumber
myfile.eachLine {line , linenumber->
    println "${linenumber} : ${line}"
}

println("-----------------------------------------------------")
// store specific lines into a list

def rangeOfLines = [0..1]
def newList = []

myfile.eachLine {line, linenumber ->
if (rangeOfLines.contains(linenumber)) {
 newList.add(line)}
}

println "newList : $newList"
