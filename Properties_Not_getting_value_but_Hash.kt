fun main() {
    val phone = SmartDevice()
    phone.color = "blue"
    phone.size = 7.2

    val tv = SmartDevice()
    tv.color = "silver"
    tv.size = 40.2

    println("Phone Color: ${phone.color}, Size: ${phone.size}")  // * $phone.size gets  Glass@5e91993f , use {} with modifiers
}
    println("TV Color: ${tv.color}, Size: ${tv.size}")
}

class SmartDevice {
    var color: String = ""
    var size: Double = 0.0
}
