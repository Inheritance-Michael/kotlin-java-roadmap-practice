package exception

class Repository: BankAction {
    val account = Account()

    override fun withdraw(
        pin: String,
        bankName: String,
        amount: Double,
        isLocked: Boolean
    ): String {
       try {

       }catch (e: Exception) {

       }
        TODO("Provide the return value")
    }

    override fun deposit(
        pin: String,
        bankName: String,
        amount: Double,
        accountNumber: String
    ): String {
        TODO("Not yet implemented")
    }

    override fun changePin(
        pin: String,
        bankName: String,
        isLocked: Boolean,
        name: String
    ): String {
        TODO("Not yet implemented")
    }
}