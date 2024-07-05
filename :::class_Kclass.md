# Kclass - ::class
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
