import java.awt.Component
import java.awt.GridBagConstraints
import java.util.*
import javax.swing.JFrame
import java.awt.Color



class Screen(var screenWidth: Int,  var screenHeight: Int,var isUndecored:Boolean = false,resizable:Boolean = false) : JFrame() {
    var screenTitle = "HellKaiser"

    init {
        setTitle(screenTitle)
        setSize(screenWidth, screenHeight)
        isResizable = resizable

        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        setLocationRelativeTo(null)

        isUndecorated = isUndecored
        requestFocus()
    }

    fun addComponent(component:Component,constraints: Any) : Screen{
        this.add(component,constraints)
        return this
    }

    fun turnOn(){
        this.isVisible = true
    }

}