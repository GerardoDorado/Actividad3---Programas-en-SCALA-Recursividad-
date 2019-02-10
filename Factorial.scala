

object Factorial {
  def main(args: Array[String]): Unit = {
    println("Factorial de 5: "+factorial(5)) 
  }
  
  def factorial(numero:Int):Int={
    if(numero>0){
      numero * factorial(numero-1)  
    }else{
      1
    }
  }
}