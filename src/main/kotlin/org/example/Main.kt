package org.example

fun main(args: Array<String>) {

    val javaInPutPath = "D:\\workspace_idea\\HSK\\downloadreport\\src\\mainTemp"
    val xmlInputPath = "C:\\Users\\cuidj\\Desktop\\test"
//    val javaInPutPath = "D:\\svn\\03_開発庫\\06_本変換\\ソース\\02_手修正後ソース"
//    val xmlInputPath = "D:\\svn\\03_開発庫\\06_本変換\\ソース\\02_手修正後ソース"
//    val javaInPutPath = "D:\\svn\\01_基線庫\\20211227\\20_原本ソース一式\\H\\src"
//    val xmlInputPath = "D:\\svn\\01_基線庫\\20211227\\20_原本ソース一式\\H\\src"
    JavaFileKeySearch().readJavaFile(javaInPutPath)
//    XmlFileKeySearch().readXmlFile(xmlInputPath)
}

