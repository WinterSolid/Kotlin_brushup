# Getters  & Setters
- Are given by default without use of get or set
- `get() = field`  field will be what ever you have for variable value
- ie... so in this case field = color value
- So if I want to also modify i can : Line:12 `field = value.uppercase()` to return values uppercased

```
class SmartDevice {
    var color: String = ""
        get() = field
        set(value) {
            field = value
            println("Color has been updated to $value")
        }

    var size: Double = 0.0
        get() = field
        set(value) {
            field = value
            println("Size has been updated to $value")
        }
}

fun main() {
    val phone = SmartDevice()
    phone.color = "blue"
    phone.size = 7.2

    val tv = SmartDevice()
    tv.color = "silver"
    tv.size = 40.2

    println("Phone Color: ${phone.color}, Size: ${phone.size}")
    println("TV Color: ${tv.color}, Size: ${tv.size}")
}

```
