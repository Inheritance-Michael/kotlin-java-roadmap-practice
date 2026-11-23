package collection

/**
 * Collections: Contact Book
 * Build a generic Repository<T> class that stores items.
 * Use a Map for fast lookup by phone number, a Set to block duplicates, and a List for sorted display.
 * Add a search by name that uses an iterator to remove matches.
 * Tests: List/Set/Map, generics, iterators. Think about why each collection fits its job.
 **/


data class Contact(
    val name: String,
    val number: Long
)