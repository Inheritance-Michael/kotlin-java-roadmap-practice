package oop

class FullTime: Employee() {
    private val _salary = calculatePay()
    override fun calculatePay(): Int {
        return 12 * 9
    }
    val salary = _salary
}

class PartTime: Employee() {
    private val _salary = calculatePay()
    override fun calculatePay(): Int {
        return 6 * 4
    }
    val salary = _salary
}

class Contractor: Employee() {
    private val _salary = calculatePay()
    override fun calculatePay(): Int {
        return 4 * 9
    }
    val salary = _salary
}