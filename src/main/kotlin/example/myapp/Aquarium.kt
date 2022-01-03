package example.myapp

class Aquarium(length: Int = 100, width: Int = 20, height: Int = 40 ) {

    var length: Int
    var width: Int
    var height: Int
    var volume: Int
        get() = length * width * height
        private set(value) {
            height = value / (width * length)
        }

    init {
        this.length = length
        this.width = width
        this.height = height
        this.volume = volume
        println("calculated volume = ${calculateVolume()}")
        println("volume = $volume")
        printSize()
        volume = 800000000
        printSize()
    }

    private fun calculateVolume(): Int {
        return (length * width * height)
    }

    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm " +
                "\n calculated volume = ${calculateVolume()}")
    }

}

