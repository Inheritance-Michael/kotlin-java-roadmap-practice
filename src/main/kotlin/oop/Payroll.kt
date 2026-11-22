package oop

import com.sun.tools.javac.tree.TreeInfo.fullName

class FullTime(fullName: String): Employee() {
    private val salary: Int = 40_000

    override val name: String
        get() = TODO()

    override fun calculatePay(): Int {
        return salary
    }

}

class PartTime(): Employee() {
    private val hours: Int = 80
    private val rate: Int = 20

    override val name: String
        get() = TODO()
    override fun calculatePay(): Int{
        return hours * rate
    }

}

class Contractor: Employee() {
    private val projects: Int = 8
    private val projectRate: Int = 2000

    override val name: String
        get() = TODO("Not yet implemented")

    override fun calculatePay(): Int {
        return projects * projectRate
    }

}