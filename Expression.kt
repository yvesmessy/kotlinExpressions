fun main(args: Array<String>) {

    print(max(4, 7))

}
// in-line function expression, Kotlin style

fun max(a: Int, b: Int): Int = if (a > b) a else b