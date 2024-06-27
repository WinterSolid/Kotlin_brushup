# Kotlin_brushup


## Main
 `fun main () {
 }`
## Variables

 ` var num: Int = 5 `  

 `var num2: Int = 11`
 
`var numdb: Double = 5.0`

`val numl: Long = 5`

`var character: Char = 'a'`

`val name: String = "The name"`

`val isCool: Boolean = true`

## Class 
- choose a class when you need concrete implementations and state management
```
open class Animal {
    open fun sound() {
        println("Some sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Bark")
    }
}
```

## Interface 
- when you need to define a common set of methods that multiple classes can implement, especially if you require multiple inheritance. Interfaces can also inherit from multiple other interfaces to combine behavior

```
interface Drivable {
    fun drive()
}

class Car : Drivable {
    override fun drive() {
        println("Driving a car")
    }
}

class Bike : Drivable {
    override fun drive() {
        println("Riding a bike")
    }
}
 ```
