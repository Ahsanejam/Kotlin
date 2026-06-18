// In the last chapter, Kotlin was able to tell in the previous example that customers has type Int. 
// Kotlin's ability to infer the type is called type inference. customers is assigned an integer value. 
// From this, Kotlin infers that customers has a numerical type Int. As a result, the compiler knows that 
// you can perform arithmetic operations with customers:


// DATA TYPES

// fun main () {
//     var customers = 10

//     // Some customers leave the queue
//     customers = 8

//     customers = customers + 3  // Example of addition: 11
//     customers += 7    // Example of addition: 18
//     customers -= 3    // Example of subtraction: 15
//     customers *= 2    // Example of multiplication: 30
//     customers /= 3    // Example of division: 10
//     println(customers);  // 10
// }


// In kotling there are following data types
// Integers , Unsigned Integers, Floating-point numbers, Booleans, Characters, Strings


// I can declare a variable and initialize them as long as variable are initialized before the first
// read

// fun main() {
//     // Variable declare without initialization
//     val d: Int
//     // Variable initialized
//     d = 3
//     // Variable explicitly typed and initialized
//     val e: String = "hello"

//     // Variables can be read because they have been initialized
//     println(d); // 3
//     println(e); // hello
// }


// If you don't initialize a variable before it is read, you see an error:
// fun main() {
//     // Variable declared without initialization
//     val d: Int

//     // Triggers an error
//     println(d)
//     // Variable 'd' must be initialized
// }


// Practice Question
// Explicitly declare the correct type for each variable:

fun main() {
    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
}