package exception

interface BankAction {
    fun withdraw(pin: String, bankName: String, amount: Double, isLocked: Boolean,): String
    fun deposit(pin: String, bankName: String, amount: Double, accountNumber: String): String
    fun changePin(pin: String, bankName: String, isLocked: Boolean, name: String): String
}