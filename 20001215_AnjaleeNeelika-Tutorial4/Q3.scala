object UpperLower {
    def toUpper(str: String): String = {
        str.toUpperCase()
    }

    def toLower(str: String): String = {
        str.toLowerCase()
    }

    def formatNames(name: String)(function: String => String)(index: Int*): String = {
        if(index.isEmpty) {
            return function(name)
        }

        var tmp = ""
        var i = 0
        while(i < name.length()) {
            if(index.contains(i)) tmp = tmp + function(name.charAt(i).toString())
            else tmp = tmp + name.charAt(i).toString()
            i = i + 1
        }

        tmp
    }

    def main(args: Array[String]): Unit = {
        println(formatNames("Benny")(toUpper)())
        println(formatNames("Niroshan")(toUpper)(0,1))
        println(formatNames("Saman")(toLower)())
        println(formatNames("Kumara")(toUpper)(5))
    }
}