

object CocientesNumerosEnteros {
  var coci=""
  
  def main(args: Array[String]): Unit = {
    println(obtenerCocienteDivisor(5, 165, 1, 0, 0))
  }
  
  def obtenerCocienteDivisor(x:Int, y:Int, indice:Int, posicion:Int, residuo:Int):Unit={
    var cociente=y+""
    cociente.substring(posicion, indice)
    
    if(x>=Integer.parseInt(cociente.substring(posicion, indice)) && indice<cociente.length()){
      obtenerCocienteDivisor(x, y, indice+1, posicion, residuo)
    }else if(indice<cociente.length()){
       val division=Integer.parseInt(cociente.substring(posicion, indice))/x
       val resi=Integer.parseInt(cociente.substring(posicion, indice))%x
       coci+=division
       obtenerCocienteDivisor(x, y, indice+1, indice, resi)
    }else{
      coci+=Integer.parseInt(cociente.substring(posicion, indice))/x
    }
  }
}