import math.{sqrt, pow}

case class Point(a: Int, b: Int) {
    def x: Int = a
    def y: Int = b

    def +(that: Point) = Point((this.x + that.x), (this.y + that.y))

    def move(dx: Int, dy: Int) = Point((this.x + dx), (this.y + dy))

    def distance(other: Point): Double = sqrt(pow(this.x - other.x, 2) + pow(this.y - other.y, 2))

    def invert() = Point(this.y, this.x)
}
 
object Q1 extends App {
    val p1 = new Point(8, 4)
    val p2 = new Point(3, 1)

    println("\nAddition of two points: " + (p1+p2))

    val p3 = p1.move(2, 1)
    println("After moving the point: " + p3)

    val p4 = p1.distance(p2)
    println("Distance between the two points: " + p4)

    println("Point p1: " + p1)
    println("Invert of p1: " + p1.invert())
}