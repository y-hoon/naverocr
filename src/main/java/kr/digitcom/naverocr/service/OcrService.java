package kr.digitcom.naverocr.service;

import kr.digitcom.naverocr.dto.GeneralOcrDto;
import kr.digitcom.naverocr.dto.ImageDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class OcrService {


    public void cloverOcrGeneralFilePath(String filePath) {

        ImageDto imageDto = ImageDto.builder()
                .format("jpg")
                .url(filePath)
                .name("테스트 처방전1")
                .build();

        List<ImageDto> images = new ArrayList<>();
        images.add(imageDto);

        GeneralOcrDto generalOcrDto = GeneralOcrDto.builder()
                .version("V2")
                .requestId("0f365b39-c33d-39be-bdfc-74aaf5534470")
                .timestamp(0)
                .images(images)
                .build();


    }
}
