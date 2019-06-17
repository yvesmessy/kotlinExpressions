@file:JvmName("DisplayFunctions")

package rrsk

fun main(args: Array<String>) {

    display("Message to be displayed when 'rrsk.display' is used")

}

fun display(message: String): Boolean {

    println(message)

    return true
}