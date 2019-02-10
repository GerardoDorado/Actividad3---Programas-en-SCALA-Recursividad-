

object Sumatoria {
  def main(args: Array[String]): Unit = {
    println("sumatoria: "+sumatoria(1,6))
  }
  
  def sumatoria(limiteInicial:Int, limiteFinal:Int):Int={
    var i=0
    if(limiteInicial<=limiteFinal){
      i+=limiteInicial + sumatoria(limiteInicial+1, limiteFinal)
    }
    
    i
  }
}