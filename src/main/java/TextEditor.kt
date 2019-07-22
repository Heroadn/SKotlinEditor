import Utils.FrameUtils
import java.awt.Color
import java.awt.Dimension
import java.awt.Font
import javax.swing.JScrollPane
import javax.swing.JTextArea
import javax.swing.JTextPane

class TextEditor() : JScrollPane() {
    var content:JTextArea
    var scroll:JScrollPane

    init {
        content = FrameUtils.createJTextPane(
            text = "",
            isEditable = true,
            font = Font("Courier New", Font.PLAIN, 12),
            isOpaque = false,
            background = Color(1.0f, 1.0f, 1.0f),
            lineWrap = true
        )

        scroll = JScrollPane(
            content,
            VERTICAL_SCROLLBAR_AS_NEEDED,
            HORIZONTAL_SCROLLBAR_NEVER
        )
    }
}
