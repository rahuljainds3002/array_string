object question_6 {
  def main(args: Array[String]): Unit =
    {
      var arr  = Array(1,2,3,4,5,6)
      var sum : Float = 0
      for (i<-0 until arr.length)
{
  sum = sum + arr(i)

}
      var avg: Float = sum/arr.length
      var length = arr.length
      println(s"sum of array is $sum")
      println(s"length of array is $length")
      println(s"aerage of array is $avg")
    }

}
