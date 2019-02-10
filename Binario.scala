

object Binario {
  var bits=""
  
  def main(args: Array[String]): Unit = {
    println("Numero binario: "+funcionConvertir(725))
  }
  
  def funcionConvertir(unidad:Int):String={
    if(unidad/2==1){
      bits=unidad%2 + bits
      bits=unidad/2 + bits
    }else{
      bits=unidad%2+ bits
      funcionConvertir(unidad/2)
    }
    bits
  }
}