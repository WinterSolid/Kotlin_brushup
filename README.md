# Kotlin_brushup


## Main
 `fun main () {
 }`
 ## keyword
 - `var` // read/write
 - `val` // read only
 - `const val`// static final and must be diffined outside/before function
   
## Variables
`var wildcard: Any = "Any Data type"` - Be careful using

 ` var num: Int = 5 `  or   ` var num = 5 ` - (Defined vs Inferred)

 `var num2: Int = 11`
 
`var numdb: Double = 5.0`

`val numl: Long = 500L`

`val numl: Float = 3.14F`

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
## FYI
### ==
- checks for structural equality, meaning it checks if the values of the objects are the same.
### === 
- checks for referential equality, meaning it checks if the two references point to the same object.
### Increment
- `++something` , `--something` =  increment/decriment (Before)
- `something++` ,  `something--`  = increment/decriment (After)
### Kclass
- `::class` Gets the KClass instance of the specified object or class.
- In Kotlin, KClass is part of Kotlin's reflection API.
- It represents a class in the Kotlin type system.
-  and it provides methods to access information about the class, such as its:
   - properties
   - functions
   - constructors
   - annotations.
- Example
  ```
    val kotlinClass = String::class
    val javaClass = kotlinClass.java
    
    println("Kotlin class: ${kotlinClass.simpleName}")  // Output: String
    println("Java class: ${javaClass.name}")
  ```
### If/Else can be used ase ternary operators
- in Java - `if (something) ? [option1]  : [option2] `
- in Kotlin - `if (something){ [option1] else [option2] `
