case object question2{
  def main(args: Array[String]): Unit = {
    var arr = Array(1,2,3,4,5)
    var sum = 0
    var i = 0
    //for(i<-0 to arr){
    while(i< arr.length) {
      sum = sum+arr(i)
      i+=1

    println(sum)
    }
    println(s"final sum is $sum")
  }
}
