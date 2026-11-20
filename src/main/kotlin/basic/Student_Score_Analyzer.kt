package basic



/** https://github.com/Inheritance-Michael/kotlin-java-roadmap-practice.git
 *  1. Basics: Student Score Analyzer
 * Take scores for N students (or fixed arrays), then print the average, highest, lowest, and a letter grade per student using when. Add a loop that re-asks on invalid input (negative or over 100).
 * Tests: variables, data types, loops, arrays, control flow.
 **/

fun main() {
    var score = 0
    val totalScore =  mutableListOf<Int>()
    println("")
    println("-------------------")
    while (true) {
        println("Enter your score number: ${score + 1} or a negative number to brake: ")
        val input = readlnOrNull()?.toIntOrNull() ?: 0
        if (input == -input || input > 100) {
            break
        }
        totalScore.add(input)
        score++
    }
    val highest = totalScore.maxOrNull() ?: 0
    val lowest = totalScore.minOrNull() ?: 0
    val average = totalScore.average()

    val averageGrade = when{
        average >= 86 -> "A"
        average >= 79 -> "B"
        average >= 60 -> "C"
        average >= 49 -> "D"
        else -> "E"
    }

    println("Your highest score is $highest, ")
    println("Your lowest score is $lowest, ")
    println("The average score is $average, grade $averageGrade.")
}

