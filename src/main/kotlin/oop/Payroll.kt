package oop


class FullTime(override val name: String, private val _salary: Int): Employee() {

    val salary = this._salary

    override fun calculatePay(): Int {
        return salary
    }
}

class PartTime(override val name: String, private val hours: Int, private val rate: Int): Employee() {

    override fun calculatePay(): Int{
        return hours * rate
    }

}

class Contractor(override val name: String, private val projects: Int, private val projectRate: Int): Employee() {

    override fun calculatePay(): Int {
        return projects * projectRate
    }

}