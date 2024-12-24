package com.ilda.theLMS.service;

import org.springframework.web.multipart.MultipartFile;

public interface PdfExtractorService {
    public String extractText(MultipartFile file);
}
