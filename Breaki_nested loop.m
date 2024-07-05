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
