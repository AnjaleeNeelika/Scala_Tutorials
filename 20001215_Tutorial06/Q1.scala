object CaesarCipher extends App {
    import scala.io.StdIn._

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    print("Enter a string: ")
    val str = readLine()

    print("Shift by: ")
    val shift = readInt()

    val encrypt=(c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)+key+a.size)%a.size)

    val decrypt=(c:Char,key:Int,a:String)=>
        a((a.indexOf(c.toUpper)-key+a.size)%a.size)

    val cipher = (algo:(Char, Int, String) =>
    Char, s:String, key:Int, a:String) =>
    s.map(algo(_, key, a))

    val ct = cipher(encrypt, str, shift, alphabet)

    val pt = cipher(decrypt, ct, shift, alphabet)

    println("\nEncrypted: " + ct)
    println("Decrypted: " + pt)
}
