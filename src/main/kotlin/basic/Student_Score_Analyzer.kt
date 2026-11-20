package basic



/** https://github.com/Inheritance-Michael/kotlin-java-roadmap-practice.git
 *  1. Basics: Student Score Analyzer
 * Take scores for N students (or fixed arrays), then print the average, highest, lowest, and a letter grade per student using when. Add a loop that re-asks on invalid input (negative or over 100).
 * Tests: variables, data types, loops, arrays, control flow.
 **/

fun main() {
    val score = 0
    val totalScore =  mutableListOf<Int>()
    while (true) {
        println("Enter your score number: ${score + 1} or a negative number to brake: ")
        val input = readlnOrNull() ?: break
        val takenInput =  input.toInt()
        if (takenInput == -takenInput || takenInput > 100) {
            break
        }
        totalScore.add(takenInput)
    }
    val highest = totalScore.maxOrNull() ?: 0
    val lowest = totalScore.minOrNull() ?: 0
    val average = totalScore.average()

    when{
        average >= 86 -> println("A")
        average >= 79 -> println("B")
        average >= 60 -> println("C")
        average >= 49 -> println("D")
        else -> println("E")
    }

    println()
}

