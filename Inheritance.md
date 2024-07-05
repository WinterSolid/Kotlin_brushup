# Inheritance
- one class to inherit properties and methods from another class.
```
open class Animal(val name: String) {
    open fun sound() {
        println("$name makes a sound.")
    }
}

class Dog(name: String) : Animal(name) {
    override fun sound() {
        println("$name barks.")
    }
}

fun main() {
    val animal = Animal("Generic Animal")
    val dog = Dog("Buddy")
    
    animal.sound() // Output: Generic Animal makes a sound.
    dog.sound()    // Output: Buddy barks.
}

```
