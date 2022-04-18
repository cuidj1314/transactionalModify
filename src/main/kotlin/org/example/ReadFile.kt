package org.example

import java.io.File

class ReadFile {

    fun readFile(inputPath: String, fileFlg: String): Sequence<File> {
        val fileTree: FileTreeWalk = File(inputPath).walk()
        return fileTree.filter { it.isFile }
            .filter { if (fileFlg == "xml") it.extension == "xml" else it.extension == "java" }
            .filter {
                if (fileFlg == "xml") it.name.contains(
                    "Context",
                    ignoreCase = true
                ) else it.name.contains("service", ignoreCase = true)
            }
    }
}