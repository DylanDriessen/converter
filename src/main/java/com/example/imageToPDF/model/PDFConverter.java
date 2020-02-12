package com.example.imageToPDF.model;

import com.example.imageToPDF.model.Converter;
import com.itextpdf.text.*;
import com.itextpdf.text.Image;
import com.itextpdf.text.pdf.PdfWriter;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Map;

public class PDFConverter implements Converter {

    public PDFConverter() {
    }

    @Override
    public void convert(InputStream inputStream, OutputStream outputStream, Map<String, String> params) throws IOException {
        Document doc = new Document();
        try {
            PdfWriter.getInstance(doc, outputStream);
            doc.open();

            java.awt.Image awtImage = ImageIO.read(inputStream);

            // scale image here
            int scaledWidth = awtImage.getWidth(null) / 2;
            int scaledHeight = awtImage.getHeight(null) / 2;
            BufferedImage scaledAwtImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_RGB);
            Graphics2D g = scaledAwtImage.createGraphics();
            g.drawImage(awtImage, 0, 0, scaledWidth, scaledHeight, null);
            g.dispose();

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            ImageIO.write(scaledAwtImage, "jpeg", bout);
            byte[] imageBytes = bout.toByteArray();


            Image image = Image.getInstance(imageBytes);

            float height = image.getHeight();
            float width = image.getWidth();

            float targetWidth = PageSize.A4.getWidth() - 100;
            float targetHeight = PageSize.A4.getHeight() - 100;

            if(height > targetHeight || width > targetWidth) {
                image.scaleToFit(targetWidth, targetHeight);
            }
            image.setAlignment(Element.ALIGN_CENTER);

            doc.add(image);

            // Scale the image to a certain percentage
            /*
            String url = "https://localhost:8080/image.png";
            image = Image.getInstance(url);
            image.scalePercent(200f);
            doc.add(image);
                */

            // Scales the image so that it fits a certain width and
            // height
            /*
            image = Image.getInstance(url);
            image.scaleToFit(100f, 200f);
            doc.add(image);
                */
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            doc.close();
        }
    }
}
