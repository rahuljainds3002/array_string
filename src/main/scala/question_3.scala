case object question_3
{def main(args: Array[String]): Unit =
  {
    var arr  = Array("rahul","jain","delhi")
    val arr1 = new Array[String](3)
    var  i = 0
    var j = arr.length-1
    //print(j)
    var a = arr(j)
    //println(a)
    while(i<arr.length){
      arr1(i) = arr(j)
      println(arr1(i))
      println(arr(j))
      i+=1
      j-=1}


    //print(arr(0))
  }
}
