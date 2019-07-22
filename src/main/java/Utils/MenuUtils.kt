package Utils

import javax.swing.JMenu
import javax.swing.JMenuBar
import javax.swing.JMenuItem

class Bar(vararg items:JMenu) : JMenuBar(){
    init{
        for(item in items){
            add(item)
        }
    }
}

class Menu(name:String, vararg items:JMenuItem) : JMenu(name){
    init{
        for(item in items){
            add(item)
        }
    }
}