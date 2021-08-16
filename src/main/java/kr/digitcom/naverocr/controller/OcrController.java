package kr.digitcom.naverocr.controller;

import kr.digitcom.naverocr.service.OcrService;
import lombok.Builder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class OcrController {

    private final OcrService ocrService;

    @Builder
    public OcrController(OcrService ocrService) {
        this.ocrService = ocrService;
    }

    @GetMapping("clover-ocr/general/file-path")
    public ResponseEntity<String> cloverOcrGeneralFilePath(@RequestBody String filePath) {

        ocrService.cloverOcrGeneralFilePath(filePath);

        return new ResponseEntity<String> ("SUCCESS", HttpStatus.OK);
    }
}
