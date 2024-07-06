# Functions and Methods
- Same thing done diffrently
## Function: performs a specific task and can be called independently.(outside class)
- Functions can be top-level (defined outside of any class),
- local (defined inside another function), or member functions (defined inside a class or an object).
```
fun topLevelFunction() {
    println("This is a top-level function")
}
```
  
## Method: A method is a function that is associated with an instance of a class or an object. (inside class)
- When a function is defined within a class or an object, it is often referred to as a method.
- Methods can operate on the data contained within the class (accessing the class's properties).
```
class Example {
    var property: String = "Example"

    fun memberFunction() {
        println("This is a member function of the class. Property value: $property")
    }
}

fun main() {
    val example = Example()
    example.memberFunction()  // This is a member function of the class. Property value: Example
}
```  
