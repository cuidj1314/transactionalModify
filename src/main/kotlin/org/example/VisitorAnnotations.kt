package org.example

import com.github.javaparser.ast.CompilationUnit
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration
import com.github.javaparser.ast.body.MethodDeclaration
import com.github.javaparser.ast.visitor.VoidVisitorAdapter

class ClassAnnotationsVisitor : VoidVisitorAdapter<Any?>() {
    override fun visit(n: ClassOrInterfaceDeclaration?, arg: Any?) {
        n?.annotations?.filter { it.toString().contains("@Transactional", ignoreCase = true) }?.forEach { it.remove() }
    }
}

class MethodAnnotationsVisitor : VoidVisitorAdapter<Any?>() {
    override fun visit(n: MethodDeclaration?, arg: Any?) {
        n?.annotations?.filter { it.toString().contains("@Transactional", ignoreCase = true) }?.forEach { it.remove() }
    }
}

class ImportVisitor : VoidVisitorAdapter<Any?>() {
    override fun visit(n: CompilationUnit?, arg: Any?) {
        n?.imports?.filter { it.toString().contains("Transactional", ignoreCase = true) }?.forEach { it.remove() }
    }
}