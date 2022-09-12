object Q1 extends App {
    val obj1 = new Rational(1, 2)
    val obj2 = new Rational(4, 5)
    println(obj1.neg)
    val sum = obj1.add(obj2)
    println(sum)
}

class Rational(n: Int, d: Int) {
    def numer = n
    def denom = d

    def add(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, r.denom * this.denom)
    def neg = new Rational(-this.numer, this.denom)
    override def toString = numer + "/" + denom 
}