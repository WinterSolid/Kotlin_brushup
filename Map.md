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
