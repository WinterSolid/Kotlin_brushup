# Singleton Object(is a class)
- Defined globally and exists throughout the application
- A singleton object is a class
- is instantiated only once in the entire application.
-  It is useful for cases where you need to maintain a single instance for:
  - global state
  - utility functions
  -  or configuration.

```
object Singleton {
    val name = "Singleton"
    var counter = 0

    fun printName() {
        println(name)
    }

    fun incrementCounter() {
        counter++
        println("Counter: $counter")
    }
}

fun main() {
    Singleton.printName() // Output: Singleton
    Singleton.incrementCounter() // Output: Counter: 1
    Singleton.incrementCounter() // Output: Counter: 2
}

```
