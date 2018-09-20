import behaviors.Describible
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
        if (isOnMainMenu) { //MENU PRINCIPAL
            when (option) {
                1 -> {
                    isOnMainMenu = false //Se sale del Main menu para el submenu
                }
                2 -> {
                    wantsToContinue = false
                }
            }
        } else { //SUBMENU
            when (option) {
                1 -> {
                    val square = Square() //Instancia de Cuadrado
                    requestFigureDescription(square)
                    drawFigure(square) //Pasando el objeto que implementa Drawable
                }
                2 -> {
                    val rectangle = Rectangle() //Instancia de Rectangulo
                    requestFigureDescription(rectangle)
                    drawFigure(rectangle) //Pasando el objeto que implementa Drawable
                }
                3 -> {
                    val triangle = Triangle() //Instancia de Triangulo
                    requestFigureDescription(triangle)
                    drawFigure(triangle) //Pasando el objeto que implementa Drawable
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

fun requestFigureDescription(describable:Describible){
    describable.requestDescription()
}