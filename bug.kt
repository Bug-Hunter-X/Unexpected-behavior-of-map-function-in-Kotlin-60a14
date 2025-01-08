fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.map { it * 2 } //This doesn't modify the original list
    println(mutableList) // Output: [1, 2, 3, 4, 5]
    
    mutableList.mapTo(mutableList){it * 2} //This modifies the original list
    println(mutableList) //Output: [2,4,6,8,10] 
}