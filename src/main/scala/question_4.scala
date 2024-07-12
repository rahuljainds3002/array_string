case object question_4
{def main(args: Array[String]): Unit =
{
  var arr: Array[Double]  = Array(2.3,14.3,5.3,2.5)
  var max : Double = 0
  var i = 0
  while(i< arr.length){
    if(arr(i)>max){max = arr(i)}
    i+=1
  }
  print(max)



}
}
