# Exit a method

```
fun main() {
    println("Result: ${checkNumber(5)}")
    println("Result: ${checkNumber(0)}")
}

fun checkNumber(number: Int): String {
    if (number <= 0) {
        return "Number is zero or negative"
    }
    return "Number is positive"
}

```
