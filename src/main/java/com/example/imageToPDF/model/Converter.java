package com.example.imageToPDF.model;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;

public interface Converter {
    void convert(InputStream inputStream, OutputStream outputStream, Map<String, String> params) throws IOException;
}
