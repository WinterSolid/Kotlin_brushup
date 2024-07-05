# Destructuring an Array or List
## An Array
```
fun main() {
    // Create an array
    val array = arrayOf("Rick", "Morty", "Summer")

    // Convert the array to a list and destructure
    val (first, second, third) = array.toList()

    println("First: $first")   // Output: First: Rick
    println("Second: $second") // Output: Second: Morty
    println("Third: $third")   // Output: Third: Summer
}

```
## An List
```
fun main() {
    // Create a list
    val list = listOf("Rick", "Morty", "Summer")

    // Destructure the list
    val (first, second, third) = list

    println("First: $first")   // Output: First: Rick
    println("Second: $second") // Output: Second: Morty
    println("Third: $third")   // Output: Third: Summer
}

```
