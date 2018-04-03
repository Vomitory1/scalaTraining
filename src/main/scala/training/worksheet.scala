package training

object worksheet extends App {
  var k = 0
  while (k < 20) {
    println( "k vale " + k )
    k = k + 1
  }
//map para recorrer una arraylist y devuelve otra lista
  // transformada con algo
  val numeros = List(4,8,10,12,14)
  print(numeros.map {x => 2* x})
  println(" ")
  val coches = List("BMW", "Mercedez", "SEAT", "Renaul", "Toyota")
  print( coches.map { _.toUpperCase() })
  println(" ")
  //filter
  val nums = List(5, 1, 4, 3, 2)
  print(nums.filter(_ > 2).sorted)

  println(" ")
  val xs = 58 #:: 43 #:: 93 #:: Stream.empty
  println(" ")
  xs match {
    case first #:: second #:: _ => print(first - second)
    case _ => print(-1)
  }
  println(" ")
  print(xs)

  println(" ")
  xs match {
   case #::(first, #::(second, _)) => print(first - second)
   case _ => print(-1)
  }

  println(" ")
  val xsa = 3 :: 6 :: 12 :: Nil
   xsa match {
   case List(a, b) => print(a * b)
   case List(a, b, c) => print(a + b + c)
    case _ => print(0)
   }
  println(" ")
  val xs3 = 3 :: 6 :: 12 :: 24 :: Nil
  xs3 match {
  case List(a, b, _*) => print(a * b)
  case _ => print(0)
  }

}
