# Primary Constructor and Initialization
- define a primary constructor directly in the class header and initialize properties.
```
class Person(val name: String, var age: Int) {
    init {
        println("Person created: $name, $age years old.")
    }
    
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person = Person("Bob", 25)
    person.greet()
}

```

# Secondary Constructors
```
class Person(val name: String, var age: Int) {
    constructor(name: String) : this(name, 0) {
        println("Secondary constructor called")
    }

    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

fun main() {
    val person1 = Person("Charlie", 28)
    val person2 = Person("Dave")
    person1.greet()
    person2.greet()
}

```
