import java.util.*

fun fac(n:Int)=(1..n-1).toList().filter { n % it ==0 }
fun isComplete(n:Int):Boolean{
    return fac(n).sum()==n
}
fun main(args: Array<String>) {
    val sc=Scanner(System.`in`)
    while (true){
        val n=sc.nextInt()
        if (n==-1) break;
        if (isComplete(n)) {
            print("$n = ${fac(n).get(0)}")
            for (i in 1..fac(n).size-1){
                print(" + ")
                print(fac(n).get(i))
            }
            println()

        }
        else println("$n is NOT perfect.")

    }
}