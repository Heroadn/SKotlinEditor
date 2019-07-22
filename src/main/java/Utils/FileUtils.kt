package Utils

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.nio.charset.Charset
import javax.swing.JFileChooser
import javax.swing.JMenuItem
import javax.swing.filechooser.FileSystemView

class FileUtils {
    companion object{
        fun read(fileName:String) = File(fileName).inputStream().readBytes().toString(Charsets.UTF_8)

        fun write(fileName:String,fileContent:String) = File(fileName).bufferedWriter().use { out -> out.write(fileContent) }

        fun getSaveLocation() : File?{
            var jfc: JFileChooser = JFileChooser(FileSystemView.getFileSystemView().homeDirectory)
            jfc.fileSelectionMode = JFileChooser.FILES_AND_DIRECTORIES

            var result = jfc.showSaveDialog(null)
            return jfc.selectedFile
        }

        fun getOpenLocation() : File?{
            var jfc: JFileChooser = JFileChooser(FileSystemView.getFileSystemView().homeDirectory)
            jfc.fileSelectionMode = JFileChooser.FILES_AND_DIRECTORIES

            var result = jfc.showOpenDialog(null)
            return jfc.selectedFile
        }
    }
}