package figures

import behaviors.Describible
import behaviors.Drawable

class Square: Drawable, Describible {
    var height = 0

    override fun draw(): String {
        var figure = ""
        for(i in 1..height) {
            for(j in 1..height){
                figure += "* "
            }
            figure += "\n"
        }
        return figure
    }

    override fun requestDescription() {
        print("- Ingrese el lado: ")
        val heightStr = readLine()
        if(heightStr != null) { //Ver si el lado no esta vacio
            height = heightStr.trim().toInt()
        } else {
            println("Lado invalido, intente de nuevo")
        }
    }
}