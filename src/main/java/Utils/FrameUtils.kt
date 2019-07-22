package Utils

import java.awt.Color
import java.awt.Font
import javax.swing.JTextPane
import javax.swing.text.StyleConstants.getBackground
import java.awt.Graphics
import javax.swing.JPanel
import javax.swing.JTextArea


class FrameUtils {

    companion object{
        fun createJTextPane(text:String = "",isEditable:Boolean = false,font:Font,isOpaque:Boolean = false,background:Color = Color.WHITE,lineWrap:Boolean = false) : JTextArea {
            val panel = object : JTextArea() {
                override fun paintComponent(g: Graphics) {
                    g.color = background
                    g.fillRect(0, 0, width, height)
                    super.paintComponent(g)
                }
            }

            panel.text = text
            panel.isEditable = isEditable
            panel.font = font
            panel.isOpaque = isOpaque
            panel.lineWrap = true
            return panel
        }
    }
}