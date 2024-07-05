# Companion Object
- Singletons and companion objects provide a single instance and static-like functionality.

```
class MyClass {
    companion object {
        fun create(): MyClass = MyClass()
    }
}

fun main() {
    val instance = MyClass.create()
    println("Instance created: $instance")
}

```
