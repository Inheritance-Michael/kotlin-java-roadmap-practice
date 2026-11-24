package exception

/**
 * Exception Handling: ATM Simulator
 * Make a PIN check (3 attempts, then lock) and withdraw and deposit actions. Throw custom exceptions like InsufficientFundsException, InvalidPinException, and AccountLockedException. Catch them separately and give a different message for each. Also handle NumberFormatException when the user types letters instead of numbers.
 * Tests: try/catch, throw vs throws, custom exceptions
 **/

fun main() {
   val accountRepo = Repository()

    val owerName = accountRepo.account.fullName

    println("-----")
    println("welcome to access bank $owerName \n how can we help you: \n")
    print("Enter 1 to withdraw \n" +
            "Enter 2 to deposit \n" +
            "Enter 3 to change your pin"
    )
    val input = readlnOrNull()?.toIntOrNull() ?: 0
    try {
        if (input <= 0){
            throw NumberFormatException( if (input == 0) "" else "Negative Number are not allowed: $input")
        }
        when (input) {
            1 -> withdraw()
            2 -> deposit()
            3  -> changePin()
        }
    }catch (e: Exception) {

    }

}

fun changePin() {
    TODO("Not yet implemented")
}

fun deposit() {
    TODO("Not yet implemented")
}

fun withdraw() {
    TODO("Not yet implemented")
}
