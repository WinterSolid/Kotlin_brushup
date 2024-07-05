# get Value by Key or by Value
```
fun getStudentScores(): Map<String, Int> {
    return mapOf("Alice" to 90, "Bob" to 85, "Charlie" to 95)
}

fun main() {
    val scores = getStudentScores()

    // Get value by key
    val studentName = "Bob"
    val score = scores[studentName]
    if (score != null) {
        println("Score for $studentName: $score")
    } else {
        println("$studentName is not in the list")
    }

    // Get key by value
    val targetScore = 85
    val studentWithTargetScore = scores.filterValues { it == targetScore }.keys.firstOrNull()
    if (studentWithTargetScore != null) {
        println("Student with score $targetScore: $studentWithTargetScore")
    } else {
        println("No student found with score $targetScore")
    }
}


```
