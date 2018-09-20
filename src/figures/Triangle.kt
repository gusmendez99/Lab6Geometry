package figures

import behaviors.Describible
import behaviors.Drawable

class Triangle: Drawable, Describible  {

    var height = 0

    override fun draw():String {
        var figure = ""


        for (i in 0 until height) {
            for (k in i until height) {
                figure += (" ")
            }
            for (j in 0..i) {
                figure += if (i != height - 1)
                    if (j == 0 || j == i)
                        ("*")
                    else
                        ("*")
                else
                    ("*")
                figure += (" ")
            }
            figure +=("\n")
        }

        return figure
    }

    override fun requestDescription() {
        print("- Ingrese la altura: ")
        val heightStr = readLine()
        if(heightStr != null){ //Solamente si la altura no esta vacia
            height = heightStr.trim().toInt()
        } else {
            println("Altura invalido, intente de nuevo")
        }
    }






}