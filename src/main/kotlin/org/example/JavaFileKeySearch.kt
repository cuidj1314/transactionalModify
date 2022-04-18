package org.example

import com.github.javaparser.StaticJavaParser
import java.io.File
import java.nio.charset.Charset
import java.nio.file.Files


class JavaFileKeySearch {

    fun readJavaFile(inputPath: String) {
        ReadFile().readFile(inputPath, "java")
            .forEach {
                try {
                    val cu = parserJavaFile(it)
                    if (!it.canWrite()) {
                        it.setWritable(true)
                    }
                    Files.writeString(it.toPath(), cu, Charset.forName("Windows-31j"))
                } catch (e: Throwable) {
                }
            }
    }

    private fun parserJavaFile(file: File): String {
        val cu = StaticJavaParser.parse(file, charset("shift-jis"))

        ClassAnnotationsVisitor().visit(cu, null)
        MethodAnnotationsVisitor().visit(cu, null)
        ImportVisitor().visit(cu, null)
        return cu.toString()
    }
}