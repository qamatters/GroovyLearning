package com.qamatters

/*
MAPS
Key- Value pair
Unordered collection
 */

def employee = [
'name' : 'deepak',
'age': '20'
]

println employee

println employee.name
println employee['name']
println employee.get('name')

println employee.get('age')
println employee.getAt('age')

println employee.size()


employee.put('city', 'Gurgaon')
println employee

println employee.containsKey('city')
println employee.containsValue('Gurgaon')

println employee.getClass()

def emp2 = employee.clone()
println emp2

println("-------------------------------------------------")

employee.each {

    key, value ->
        println "key : ${key}"
        println "value : ${value}"
}

println("-------------------------------------------------")

employee.eachWithIndex {

    key, value, i ->
        println "index: ${i}"
        println "key : ${key}"
        println "value : ${value}"
}

println("-------------------------------------------------")

employee.each { entry ->
    println "$entry.key : $entry.value"
}

def entries = employee.entrySet();
entries.each {entry->
    assert entry.key in ['name','age', 'city']
    assert entry.value in ['deepak', '20','Gurgaon']
}

println("-------------------------------------------------")
employee.clear()
println employee