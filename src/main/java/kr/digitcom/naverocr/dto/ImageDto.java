package kr.digitcom.naverocr.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class ImageDto {

    private String format;
    private String url;
    private String name;

    @Builder
    public ImageDto(String format, String url, String name) {
        this.format = format;
        this.url = url;
        this.name = name;
    }
}
