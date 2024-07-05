# Classes
## Define a class
- Class Definition: The Person class has two properties (name and age) and a method (greet).
```
class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

```

# Object
## Define a object
- Object: The `val person = Person("Alice", 30)` statement creates an instance of the Person class 
- calls the greet() method on it.
```
class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hello, my name is $name and I am $age years old.")
    }
}

```
