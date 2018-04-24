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


  println(" ")
  def gameResults(): Seq[(String, Int)] =
  ("Daniel", 3500) :: ("Melissa", 13000) :: ("John", 7000) :: Nil

  def hallOfFame = for {
    result <- gameResults()
    (name, score) = result
    if (score > 5000)
    } yield name
  println(hallOfFame)


  val songTitles =
     List("The White Hare", "Childe the Hunter", "Take no Rogues")
  println(songTitles.map(t => t.toLowerCase))
  println(songTitles.map(_.toLowerCase))


  val wordFrequencies = List(
    ("habitual", 6),
    ("and", 56),
    ("consuetudinary", 2),
    ("additionally", 27),
    ("homely", 5),
    ("society", 13))

  def wordsWithoutOutliers(
                            wordFrequencies: Seq[(String, Int)]): Seq[String] =
     wordFrequencies.filter(wf => wf._2 > 3 && wf._2 < 25).map(_._1)

  def wordsWithoutOutliers2(
   wordFrequencies: Seq[(String, Int)]): Seq[String] =
     wordFrequencies.filter { case (_, f) =>
     f > 3 && f < 25 } map { case (w, _) => w }

  println(wordsWithoutOutliers(wordFrequencies))
  println(wordsWithoutOutliers2(wordFrequencies))


  val pf = new PartialFunction[(String, Int), String] {
    def apply(wordFrequency: (String, Int)) = wordFrequency match {
    case (word, freq) if freq > 3 && freq < 25 => word
     }
     def isDefinedAt(wordFrequency: (String, Int)) = wordFrequency match {
     case (word, freq) if freq > 3 && freq < 25 => true
         case _ => false
         }
     }

  println(wordFrequencies.collect(pf))


  println(1.toString)
  println(1.to(10))

}
