package com.example.imageToPDF.controller;

import com.example.imageToPDF.model.PDFConverter;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

@RestController
public class Controller {
    @PostMapping(value = "/convert/{format}", consumes = "application/octet-stream", produces = "application/octet-stream")
    @ResponseBody
    public void convert(RequestEntity<InputStream> entity, HttpServletResponse response, @PathVariable String format, @RequestParam Map<String, String> params) throws IOException {
        if ("pdf".equalsIgnoreCase(format)) { // avoid NPE
            System.out.println("TEST");
            PDFConverter cnv = new PDFConverter();
            cnv.convert(entity.getBody(), response.getOutputStream(), params);
            response.setContentType("application/octet-stream");
            response.getOutputStream().println("hello binary");
        } else {
            // handle other formats
            throw new IllegalArgumentException("illegal format: " + format);
        }
    }
}