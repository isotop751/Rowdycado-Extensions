fun main() {
    // Calling the greet function
    greet("John")

    // Adding two numbers and printing the result
    val sum = addNumbers(5, 7)
    println("The sum is: $sum")
}

// A function to print a greeting
fun greet(name: String) {
    println("Hello, $name! Welcome to Kotlin.")
}

// A function to add two numbers and return the result
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

