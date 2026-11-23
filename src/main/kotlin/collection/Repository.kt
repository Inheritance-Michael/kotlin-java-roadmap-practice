package collection



class Repository<T> {

    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }
    fun displayItem(): List<T> {
        return items
    }
    fun deleteItem(item: T) {
      items.remove(item)
    }
    fun findItemNumber(key: Int): Map<Int,T> {
        return items.associateBy { key }
    }
    fun unique(item: T):Set<T>{
        return items.union(setOf(item))
    }

}