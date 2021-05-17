package com.qamatters

def str = "mathpal";
def myClosure = {
    name -> println "Hello ${name} ${str}"
}

myClosure.call("Deepak");


// Closue as variable to method
def myMethod (clos) {
    clos.call("Groovy");
}
myMethod(myClosure)

//Closure with return type

def myClosure1 = {
    a,b,c -> return (a+b+c)
}

println myClosure1.call(10,20,30)

// Printing list

def myList = ["Apples", "Mango", "Grapes"]
println(myList.each {it})


//Printing map
def myMap = [
        'Subject': 'groovy',
        'Topic': 'closure'
]

println(myMap.each {it})

// Finding item
def myList1 = [1,2,3,4,5,6]
println(myList1.find(item -> item==3))
println(myList1.find(item -> item==9))
println myList1.findAll {item-> item>3}

println myList1.any({item-> item>3})
println myList1.any({item-> item>9})

println myList1.every({item-> item>3})
println myList1.every({item-> item<9})

println myList1.collect(item->item *3)