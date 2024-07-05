# Elvis Operator- provides a default value

```
fun main() {
    // Prompt the user for input
    println("Enter a number (or press Enter to use default):")

    // Read input from the user and convert to integer, using Elvis operator to provide default value
    val input = readLine()
    val number = input?.toIntOrNull() ?: 42

    println("The number is: $number")
}
```

