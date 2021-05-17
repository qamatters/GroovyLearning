package com.qamatters

def myList1 = ["Apples", "Mango", "Banana"]
def myList2 = [1,2,3,4]
def myList3 = [6,7,8, ["A", "B", 'C'],9]
def myList4 = [1,2, "Groovy", "Java"]

// Access Items
println(myList1[0])
println(myList1.get(1))

println(myList3.get(3))
println(myList3[3][2])
println myList3.get(3).get(2)

println myList2 [0..3]
println myList2 [3..0]

//Print entire list
println(myList1.each {it})

// Check contains method
println(myList4.contains(2))
println(myList4.contains("Groovy"))

// Check size
println myList4.size()

//Adding an element
myList2.add(10)
println(myList2)

myList2<< 20
println myList2

myList2.add(2, 40)
println myList2

myList2 = myList2 + [50, 60]
println(myList2)

myList2 = myList2.plus([70])
println myList2

// Removing an element
myList2.remove(2)
println myList2

myList2.remove(2)
println myList2

myList2 = myList2.minus([60,70])
println(myList2)

myList2 = myList2 -([10, 20,50])
println(myList2)

myList2.pop();
println(myList2)

myList2.removeLast();
println(myList2)

myList2 = myList2 + [1,2,3,4,5,6]
println(myList2)

// reverse a list
println myList2.reverse()

//sort a list
println myList2.sort()

//desc sort a list
println myList2.sort().reverse()

// list is empty
println myList2.isEmpty()

