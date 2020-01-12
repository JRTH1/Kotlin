package strings
import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(seperator:String =",",prefix:String="",postfix :String=""):String{
    val result=StringBuilder(prefix);
    for ((index,element) in this.withIndex()){
        if (index > 0) result.append(seperator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    println(list.joinToString())
    println(list.joinToString(";","<",">"))
}