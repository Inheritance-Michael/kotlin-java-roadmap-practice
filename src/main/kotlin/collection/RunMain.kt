package collection

fun main() {
    val contact = Repository<Contact>()
    println(contact.addItem(Contact("John Doe", 9044055271)))
}