package oop

/**
 * OOP: Payroll System
 * Make an abstract Employee with FullTime, PartTime, and Contractor subclasses.
 * Each one implements its own calculatePay(): salary, hours × rate, or per project.
 * Keep the salary private and expose it through a getter. Loop over a List<Employee> and print each payslip.
 * Tests: inheritance, polymorphism, abstraction, encapsulation.
 * The key thing to notice is that one loop handles all three types without any if checks.
 **/
abstract class Employee{
    abstract val name: String
    abstract fun calculatePay(): Int
}

