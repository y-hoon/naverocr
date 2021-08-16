package kr.digitcom.naverocr.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class GeneralOcrDto {

    private String version;
    private String requestId;
    private long timestamp;

    private List<ImageDto> images = new ArrayList<>();

    @Builder
    public GeneralOcrDto(String version, String requestId, long timestamp, List<ImageDto> images) {
        this.version = version;
        this.requestId = requestId;
        this.timestamp = timestamp;
        this.images = images;
    }
}
