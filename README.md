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

## Return value from function
```
fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val sum = add(5, 3)
    println("Sum: $sum") // Output: Sum: 8
}
```
 - Or
   `fun add(a: Int, b: Int): Int = a + b `

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
## If/Else can be used ase ternary operators
- in Java - `if (something) ? [option1]  : [option2] `
- in Kotlin - `if (something){ [option1] else [option2] `

## When - Kolin doesn't have Switch instead us "When" 
- Example
```
fun main() {
    val number = 2

    when (number) {
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        else -> println("Unknown number")
    }
}
```
```
fun main() {
    val name = "Sarah"

    when (name) {
        "Tony" -> println("T")
        "john" -> println("J")
        "Sarah" -> println("S")
        else -> println("Unknown name")
    }
}
```
## it  Keywod
- it, referring to a single parameter.
  - Example
```
- val numbers = listOf(1, 2, 3, 4, 5)
numbers.forEach { println(it) }

// Output:
// 1
// 2
// 3
// 4
// 5
```
## Range values
- example
  ```
  val age = 21

  when (age) {
  !in 1...19 -> Ptintln("No dice")
  in 20...32 -> Ptintln("What up")
  }
  ```
## Destructuring an Array of List
### An Array
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
### An List
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
##  Map
- Convert all elements in list1 to lowercase
   ` list1 = list1.map { it.lowercase() }.toMutableList()`
- Use map to apply a transformation to each element in a list.
- Convert the transformed list back to a mutable list using `toMutableList()` if you need to modify it further.
  - Example
```
  fun main() {
    // Create arrays
    val array = arrayOf("Rick", "Morty", "Summer")
    val array2 = arrayOf("Mike", "Mini", "Momo")
    
    var list1 = mutableListOf<String>()
    
    // Add all elements from array and array2 to list1
    list1.addAll(array + array2)
    
    // Convert all elements in list1 to lowercase
    list1 = list1.map { it.lowercase() }.toMutableList()
    
    println(list1) // Output: [rick, morty, summer, mike, mini, momo]
  }
```
## Ranges
-  1 to 5
`for(i in 1..5)`
- 5 down to 1
   ` for(i in 5 downTo 1)`
## Step
-  1 to 5 every 2nd element
`for(i in 1..5 step 2)`

## Do While
```
fun main() {
    val brand = "Poopy B"
    var index = 0

    // Using do-while loop to iterate through the string
    do {
        println(brand[index])
        index++
    } while (index < brand.length)
}
```
## Arguments
- can be defined as
  `greet("Rick Sanchex, 50)`
- or
  `greet(age = 50,name = "Rick Sanchez)`
## Elvis Operator
- provides a default value
```
fun main() {
    // Prompt the user for input
    println("Enter a number (or press Enter to use default):")

    // Read input from the user and convert to integer, using Elvis operator to provide default value
    val input = readLine()
    val number = input?.toIntOrNull() ?: 42

    println("The number is: $number")
}
```
## Functions as Arguments (but only the last argument)
```
// Define a higher-order function that takes another function as a parameter
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

// Define some basic operations
fun add(x: Int, y: Int): Int {
    return x + y
}

fun subtract(x: Int, y: Int): Int {
    return x - y
}

fun main() {
    val a = 10
    val b = 5

    // Call the higher-order function with different operations
    // below use Function References
    val sum = operateOnNumbers(a, b, ::add)
    val difference = operateOnNumbers(a, b, ::subtract)

    println("Sum: $sum")          // Output: Sum: 15
    println("Difference: $difference")  // Output: Difference: 5

    // Alternatively, use lambda expressions
    val product = operateOnNumbers(a, b) { x, y -> x * y }
    val quotient = operateOnNumbers(a, b) { x, y -> x / y }

    println("Product: $product")       // Output: Product: 50
    println("Quotient: $quotient")     // Output: Quotient: 2
}

```
## Breaking a nested loop
```
fun main() {
    outer@ for (i in 1..5) {
        for (j in 1..5) {
            println("i: $i, j: $j")
            if (i * j == 6) {
                println("Breaking out of nested loops.")
                break@outer
            }
        }
    }
    println("Exited nested loops.")
}

```
## Exit a method
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

