object Listas09 {
  def main(args: Array[String]): Unit = {
    def fPrimo(i :Int) : Boolean = {
      if (i <= 1)
        false
      else if (i == 2)
        true
      else
        !(2 to (i-1)).exists(x => i % x == 0)
    }

    def fNPrimos(lista:List[Int]):List[Int] = {
      lista.filter(x => fPrimo(x))
    }

    def factorial(n:Int):Int = {
      if (n <= 1) 1
      else n * factorial(n - 1)
    }

    def fFactorial(lista:List[Int]):List[Int] = {
      lista.map(x => factorial(x))
    }

    def fPromSum(lista:List[Int]):Int = {
      lista.sum / lista.length
    }

    val lista = List(1,2,3,4,5,6,7,8,9,10)
    println("La lista original es: "+lista)
    println("Numeros primos")
    println(fNPrimos(lista))
    println("Factoriales de los numeros:")
    println(fFactorial(lista))
    println("Suma y promedio")
    println(fPromSum(lista))


  }
}
