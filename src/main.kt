import behaviors.Drawable
import figures.Rectangle
import figures.Square
import figures.Triangle

fun getMenu(isOnMainMenu:Boolean):String {

    if(isOnMainMenu){
        return """
            Menu principal
            ----------------
            1. Dibujar una figura
            2. Salir
            """.trimIndent()
    } else {
        return """
            Menu
            ------
            1. Dibujar un cuadrado
            2. Dibujar un rectangulo
            3. Dibujar un triangulo
            4. Salir al menu principal
            """.trimIndent()
    }
    return ""
}

fun main (args: Array<String>) {

    var wantsToContinue = true
    var isOnMainMenu = true
    // ciclo principal, segun la opcion ingresada realiza un accion
    do {
        println(getMenu(isOnMainMenu))
        print("Ingrese una opcion: ")
        val strOption = readLine()!!
        val option = strOption.toInt()
        if (isOnMainMenu) {
            when (option) {
                1 -> {
                    isOnMainMenu = false
                }
                2 -> {
                    wantsToContinue = false
                }
            }
        } else {
            when (option) {
                1 -> {
                    val square = Square()
                    square.requestDescription()
                    drawFigure(square)
                }
                2 -> {
                    val rectangle = Rectangle()
                    rectangle.requestDescription()
                    drawFigure(rectangle)
                }
                3 -> {
                    val triangle = Triangle()
                    triangle.requestDescription()
                    drawFigure(triangle)
                }
                4 -> {
                    isOnMainMenu = true
                }
            }
        }
    } while (wantsToContinue)




}

fun drawFigure(drawable: Drawable){
    print(drawable.draw())
}