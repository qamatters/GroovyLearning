package com.qamatters

int i =8;
for (i; i< 10; i++)
    println(i)

println("----------------------")

for (num in 1..5) {
    println(num)
}
println("----------------------")

10.upto(15) {println("$it")}
println("----------------------")

//iterate over a list

int x = 0;
for( e in [0,1,2,3,4])
{
    x = x+e;
}
println(x)

println("----------------------")
// print key values from map
def map = ["firstName": "deepak", "lastName": "mathpal"]
for(e in map) {
    print(e.key + ":")
    print(e.value)
    println()
}

println("----------------------")
// while loop
def b = 2;
while (b<10)
{
    println(b)
    b = b+2;
}