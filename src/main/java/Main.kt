import Utils.Bar
import Utils.Menu
import java.awt.BorderLayout

/*
* Put everthing inside a app class
* */
fun main(){
    val screen = Screen(500,500,resizable = true)
    val textEditor = TextEditor()
    val topMenu = TopMenu(textEditor)

    var files = Menu("File", topMenu.open(), topMenu.save())
    var topBar = Bar(files)

    screen
        .addComponent(textEditor.scroll,BorderLayout.CENTER)
        .addComponent(topBar,BorderLayout.NORTH)
        .turnOn()
}