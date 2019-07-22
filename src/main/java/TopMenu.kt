import Utils.FileUtils
import javax.swing.JMenuItem

class TopMenu(var textEditor: TextEditor) {

    fun open() : JMenuItem{
        var open = JMenuItem("Abrir")
        open.addActionListener {
            var path:String? = FileUtils.getOpenLocation()?.path

            if(path != null) {
                textEditor.content.text = FileUtils.read(path)
            }
        }

        return open
    }

    fun save() : JMenuItem{
        var save = JMenuItem("Salvar")
        var path:String? = null

        save.addActionListener{
            if(path == null){
                path =  FileUtils.getSaveLocation()?.path
                FileUtils.write(path!!,textEditor.content.text)
            }else{
                FileUtils.write(path!!,textEditor.content.text)
            }
        }

        return save
    }

}