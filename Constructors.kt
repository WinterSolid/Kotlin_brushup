# Primary Constructor - Defined in the class header and is concise. Suitable for simple initializations.
``
class Person(val name: String, var age: Int) {
    // Initialization block
    init {
        println("Person is created: $name, $age years old")
    }
}

fun main() {
    val person = Person("Alice", 30)
    println("${person.name} is ${person.age} years old")
}
``
# Default Values with Primary Constructor
// init block is used to run additional initialization code.
```
class Person(val name: String, var age: Int = 0) {
    init {
        println("Person is created: $name, $age years old")
    }
}

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob")
    println("${person1.name} is ${person1.age} years old")
    println("${person2.name} is ${person2.age} years old")
}

```
# Secondary Constructor Defined inside the class. Useful for additional initialization logic or multiple constructors.
``
class Person {
    var name: String
    var age: Int

    // Primary constructor
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
        println("Person is created: $name, $age years old")
    }

    // Secondary constructor
    constructor(name: String) {
        this.name = name
        this.age = 0 // default value
        println("Person is created: $name, age not specified")
    }
}

fun main() {
    val person1 = Person("Alice", 30)
    val person2 = Person("Bob")
    println("${person1.name} is ${person1.age} years old")
    println("${person2.name} is ${person2.age} years old")
}

``
