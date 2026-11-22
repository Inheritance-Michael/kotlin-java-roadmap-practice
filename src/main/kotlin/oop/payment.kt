package oop


fun main() {
    val inheritance = FullTime("inheritance", 20_000)
    val bola = PartTime("bola", 6, 13)
    val ada = Contractor("ada", 2, 30_000)

    val listOfEmployees : List<Employee> = listOf(bola, ada, inheritance)

    for (employee in listOfEmployees) {
        println(employee.calculatePay())
    }
}