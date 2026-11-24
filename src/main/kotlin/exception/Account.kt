package exception

data class Account(
    val fullName: String = "inheritance Micheal",
    private val bankName: String = "Access Bank",
    private val accountNumber: String = "97123",
    val balance: Double = 12_000.0,
    val pin: String = "1234",
    val isLocked: Boolean = false,
)
