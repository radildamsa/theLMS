package com.ilda.theLMS.service.serviceImpl;

import org.apache.pdfbox
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.ilda.theLMS.service.PdfExtractorService;

import java.io.IOException;

@Service
public class PdfExtractorServiceImpl implements PdfExtractorService {


    @Override
    public String extractText(MultipartFile file) throws IOException {
        try (PDDocument document = PDDocument.load(file.getInputStream())) {
            PDFTextStripper pdfStripper = new PDFTextStripper();

            // Extract and return text
            return pdfStripper.getText(document);
        }
    }
}
