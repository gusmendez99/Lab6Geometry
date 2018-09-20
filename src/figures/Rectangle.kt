package figures

import behaviors.Describible
import behaviors.Drawable

class Rectangle: Drawable, Describible {
    var height = 0
    var width =  0

    override fun draw(): String {
        var figure:String = ""
        for(i in 1..height) {
            for(j in 1..width){
                figure += "* "
            }
            figure += "\n"
        }
        return figure
    }

    override fun requestDescription() {
        print("- Ingrese la altura: ")
        val heightStr = readLine()
        if(heightStr != null){  //Solamente si la altura no esta vacia
            height = heightStr.trim().toInt()

            print("- Ingrese el ancho: ")
            val widthStr = readLine()
            if(widthStr != null){ //Solamente si el ancho no esta vacio
                width = widthStr.trim().toInt()
            } else {
                println("Ancho invalido, intente de nuevo")
            }

        } else {
            println("Altura invalido, intente de nuevo")
        }
    }
}