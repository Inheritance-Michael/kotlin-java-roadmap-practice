package collection

fun main() {
    val contact = Repository<Contact>()
    contact.addItem(Contact("John Doe", 81384392398))
    contact.addItem(Contact("John Doe", 81384392398))
    contact.addItem(Contact("John Doe", 81384392398))
    contact.addItem(Contact("inheritance micheal", 9044055271))
    contact.addItem(Contact("Samuel ifick", 23239442994))
    contact.addItem(Contact("John Doe", 93298593342))
    contact.deleteItem(Contact("John Doe", 93298593342))
   // println(contact.displayItem())
   // println(contact.unique())
    //println(contact.findItemNumber())
}