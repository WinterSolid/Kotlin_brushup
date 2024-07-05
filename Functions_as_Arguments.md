# Functions as Arguments (but only the last argument)
```
// Define a higher-order function that takes another function as a parameter
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Define some basic operations
fun add(x: Int, y: Int): Int {
    return x + y
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}

fun main() {
    val a = 10
    val b = 5

    // Call the higher-order function with different operations
    // below use Function References
    val sum = operateOnNumbers(a, b, ::add)
    val difference = operateOnNumbers(a, b, ::subtract)

    println("Sum: $sum")          // Output: Sum: 15
    println("Difference: $difference")  // Output: Difference: 5

    // Alternatively, use lambda expressions
    val product = operateOnNumbers(a, b) { x, y -> x * y }
    val quotient = operateOnNumbers(a, b) { x, y -> x / y }

    println("Product: $product")       // Output: Product: 50
    println("Quotient: $quotient")     // Output: Quotient: 2
}

```
