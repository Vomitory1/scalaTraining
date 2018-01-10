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


}
