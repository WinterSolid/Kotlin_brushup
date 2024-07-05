
# Returning a Single Value
```
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sum = add(5, 3)
    println("Sum: $sum") // Output: Sum: 8
}
```
# pair - If you need to return two values

```
fun getCoordinates(): Pair<Int, Int> {
    return Pair(10, 20)  // or can express as:  return 10 to 20
}

fun main() {
    val (x, y) = getCoordinates()
    println("x: $x, y: $y") // Output: x: 10, y: 20
}
```
# triple - If you need to return three values

```
fun getPersonInfo(): Triple<String, Int, String> {
    return Triple("Alice", 30, "Engineer")
}

fun main() {
    val (name, age, profession) = getPersonInfo()
    println("Name: $name, Age: $age, Profession: $profession")
    // Output: Name: Alice, Age: 30, Profession: Engineer
}
```
# Data Class
```
data class Person(val name: String, val age: Int, val profession: String)

fun getPerson(): Person {
    return Person("Bob", 25, "Doctor")
}

fun main() {
    val person = getPerson()
    println("Name: ${person.name}, Age: ${person.age}, Profession: ${person.profession}")
    // Output: Name: Bob, Age: 25, Profession: Doctor
}
```

# Returning a Array or List
```
fun getNumbers(): List<Int> {
    return listOf(1, 2, 3, 4, 5)
}

fun main() {
    val numbers = getNumbers()
    println("Numbers: $numbers")
    // Output: Numbers: [1, 2, 3, 4, 5]
}
```

# Returning a Map
```
fun getStudentScores(): Map<String, Int> {
    return mapOf("Alice" to 90, "Bob" to 85, "Charlie" to 95)
}

fun main() {
    val scores = getStudentScores()
    scores.forEach { (name, score) ->
        println("Name: $name, Score: $score")
    }
    // Output:
    // Name: Alice, Score: 90
    // Name: Bob, Score: 85
    // Name: Charlie, Score: 95
}

```
