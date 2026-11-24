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
//    fun findItemNumber(item: T): Contact{
//        return Contact[item]
//    }
    fun unique():Set<T>{
        return items.toSet()
    }

}