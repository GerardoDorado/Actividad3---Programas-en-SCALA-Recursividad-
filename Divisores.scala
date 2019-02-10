

object Divisores {
  
  var cadena=""
  
  def main(args: Array[String]): Unit = {
      println("Divisores del numero 32: "+divisores(1, 32))
  }
  
  def divisores(i:Int, numero:Int):String={
    if(numero==i){
      cadena+=i
    }
    else if(numero%i==0){
      cadena+=i+" "
      divisores(i+1, numero) 
    }else{
      divisores(i+1, numero)
    }
    
    cadena
  }
}