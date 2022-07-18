object calculateVolume {
    def sphereVolume(r: Int): Double = {
        4/3 * math.Pi * r * r * r;
    }

    def main(args: Array[String]): Unit = {
        println("The volume of a sphere with radius 5: " + sphereVolume(5));
    }
}
