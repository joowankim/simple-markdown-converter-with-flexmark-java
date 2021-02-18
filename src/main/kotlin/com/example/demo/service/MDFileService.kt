package com.example.demo.service

import com.vladsch.flexmark.html.HtmlRenderer
import com.vladsch.flexmark.parser.Parser
import com.vladsch.flexmark.util.ast.Node
import com.vladsch.flexmark.util.data.MutableDataSet
import org.springframework.stereotype.Service
import java.io.File
import java.io.FileReader
import java.io.FileWriter

@Service
class MDFileService {

    fun convert2html(file: File, currentDir: String) {

        val options = MutableDataSet()
        val parser = Parser.builder(options).build()
        val renderer = HtmlRenderer.builder(options).build()

        FileReader(file).use {
            val document: Node = parser.parseReader(it)
            var html =
                """
                <html xmlns:th="http://www.thymeleaf.org"
                      xmlns:layout="http://www.utraq.net.nz/thymeleaf/layout"
                      layout:decorate="layouts/layout">
                <div layout:fragment="content">
                """ +
                renderer.render(document) +
                """
                </div>
                </html>
                """.trimIndent()

            val output = "$currentDir\\src\\main\\resources\\templates\\converted.html"

            FileWriter(output).use{ fw ->
                fw.write(html)
            }
        }
        file.delete()

    }

}