package com.example.demo.controller

import com.example.demo.service.MDFileService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.multipart.MultipartFile
import org.springframework.web.servlet.mvc.support.RedirectAttributes
import java.io.File
import java.io.IOException

@Controller
class FileController(_mdFileService: MDFileService) {

    val mdFileService = _mdFileService

    @RequestMapping
    fun uploadForm(): String{
        return "index.html"
    }

    @PostMapping("/upload")
    @Throws(IOException::class)
    fun convertMD(@RequestParam file: MultipartFile, redirectAttributes: RedirectAttributes): String{
        // file upload to system
        val currentDir: String = System.getProperty("user.dir")
        val convertedFile = File("$currentDir\\" + file.originalFilename)
        file.transferTo(convertedFile)

        this.mdFileService.convert2html(convertedFile, currentDir)

        return "converted.html"
    }
}