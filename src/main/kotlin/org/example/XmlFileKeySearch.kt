package org.example

import org.dom4j.Document
import org.dom4j.DocumentHelper

class XmlFileKeySearch {

    fun readXmlFile(inputPath: String) {
        ReadFile().readFile(inputPath, "xml")
            .forEach {
                try {
                    val doc: Document = DocumentHelper.parseText(it.readText())
                    if (doc.rootElement.elements().size > 0) {
                        // tx:adviceファイルが検索する
                        doc.rootElement.elements("advice").forEach { x ->
                                println(it.path)
                        }
                    }
                } catch (e: Throwable) {
                }
            }
    }
}