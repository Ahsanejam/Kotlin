// Lets print hello World the basic of every programming language
// -------------------------------------------------------------

//fun main() {
//    println("Hello, World!")
//    print("Hello Asad")
//    print("Hello Asad")
//
//}


// |------------------------------------------------------------------------|
// |In Kotlin:                                                              |
// |fun is used to declare a function                                       |
// |The main() function is where your program starts from                   |
// |The body of a function is written within curly braces {}                |
// |println() and print() functions print their arguments to standard output|
// |------------------------------------------------------------------------|


// Variables -> It is use to store data
// Read-only variables with val
// Mutable variables with var
// You can't change a read-only variable once you have given it a value.
// -------------------------------------------------------------------------



// val popcorn = 5 //There are 5 boxes of popcorn
// val hotdog = 7 //There are 7 hotdogs
// var customers = 10 // There are 10 customers in the queue

// fun main() {
//     // Some customers leave the queue
//     customers = 8
//     println(customers) //8

// //    popcorn = 90 -- it is an error because we cannot reassign popcorn or change value
// }
// ---------------------------------------------------------------------------------------



// Variables can be declared outside the main() function at the beginning of your program. 
// Variables declared in this way are said to be declared at top level.

// As customers is a mutable variable, its value can be reassigned after declaration.


// ---------------------|
// String templates     |
// ---------------------|


// val customers = 10

// fun main() {
//     // val customers = 10
//     println("There are $customers customers ")
//     // There are 10 customers 
//     println("There are ${customers + 1} customers ")
//     // There are 11 customers 
// }




// QUIZ
fun main() {
    val name = "Mary"
    val age = 20
    println("$name is $age years old")
}

// Output is be like Mary is 20 years old