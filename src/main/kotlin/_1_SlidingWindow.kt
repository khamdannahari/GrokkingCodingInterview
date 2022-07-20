object AverageOfSubarrayOfSizeK {
    fun findAverages(K: Int, arr: IntArray): DoubleArray {
        val result = DoubleArray(arr.size - K + 1)
        for (i in 0..arr.size - K) {
            // find sum of next 'K' elements
            var sum = 0.0
            for (j in i until i + K) sum += arr[j].toDouble()
            result[i] = sum / K // calculate average
        }
        return result
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val result = findAverages(5, intArrayOf(1, 3, 2, 6, -1, 4, 1, 8, 2))
        println("Averages of subarrays of size K: " + result.contentToString())
    }
}
