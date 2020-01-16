fun parsePath (path:String){
    val directory=path.substringBeforeLast("/")
    val fullname=path.substringAfterLast("/")
    val filename=fullname.substringBeforeLast(".")
    val extension=fullname.substringAfterLast(".")
    println("Dir: $directory, name: $filename, ext: $extension")
}

fun parsePathReg (path:String){
    val regex="""(.+)/(.+)\.(.+)""".toRegex()
    val matchResult=regex.matchEntire(path)
    if (matchResult != null){
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    parsePath("/Users/jaeryeong/Study/Test.kt")
    parsePathReg("/Users/jaeryeong/Study/Test.kt")
}