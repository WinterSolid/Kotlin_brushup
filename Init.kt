# Initializers - init
- init block is executed immediately after the primary constructor.
- If there are multiple init blocks, they are executed in the order they appear in the class.
  - Example

```
class Person(val name: String, var age: Int) {
    // First initialization block
    init {
        println("First init block: $name, $age years old")
    }

    // Second initialization block
    init {
        println("Second init block")
    }
}

fun main() {
    val person = Person("Bob", 25)
    println("${person.name} is ${person.age} years old")
}

```  
