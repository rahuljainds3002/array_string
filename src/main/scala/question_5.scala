object question_5
{def main(args: Array[String]): Unit =
{
  var arr: Array[Int]  = Array(1,2,3,4,5)
  var arr2: Array[Int]  = Array(6,7,8,9,10)
  var arr3 :Array[Int] = new Array[Int](20)
  var i = (arr.length + arr2.length)
  for(j<-0 until arr.length)
  {
    arr3(j) = arr(j)
    println(arr3(j))
  }
for(j<-arr.length until arr.length+arr2.length){
  arr3(j) = arr2(j-arr.length)
  println(arr3(j))
}


}
}
