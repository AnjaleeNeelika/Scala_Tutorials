object Q2 extends App {
    var x = new Rational(3, 4)
    var y = new Rational(5, 8)
    var z = new Rational(2, 7)

    var ans = x - y - z

    println(ans)
}

class Rational(n: Int, d: Int) {
    def numer = n
    def denom = d

    def neg = new Rational(-this.numer, this.denom)
    def +(r: Rational) = new Rational(this.numer * r.denom + r.numer * this.denom, this.denom * r.denom)
    def -(r: Rational) = this + r.neg
    override def toString = numer + "/" + denom
}