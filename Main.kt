class Container<T> {
    private var item: T? = null

    fun put(item: T) {
        this.item = item
    }

    fun get(): T? {
        return item
    }

    fun clear() {
        item = null
    }

    fun isEmpty(): Boolean {
        return item == null
    }
}
fun main() {
    val container = Container<String>()

    println("Пустой? ${container.isEmpty()}")

    container.put("Привет, Kotlin!")
    println("Пустой? ${container.isEmpty()}")
    println("Содержимое: ${container.get()}")

    container.clear()
    println("Пустой? ${container.isEmpty()}")
    println("Содержимое: ${container.get()}")
}