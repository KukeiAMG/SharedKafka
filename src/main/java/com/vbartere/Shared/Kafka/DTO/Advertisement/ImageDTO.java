package com.vbartere.Shared.Kafka.DTO.Advertisement;

// DTO без больших данных
public class ImageDTO {
    private Long id;
    private String name;
    private String originalFileName;
    private String contentType;
    private Long size;
    private boolean isPreviewImage;
    private String url;

    public ImageDTO() {}

    public ImageDTO(Long id, String name, String originalFileName, String contentType, Long size, boolean isPreviewImage, String url) {
        this.id = id;
        this.name = name;
        this.originalFileName = originalFileName;
        this.contentType = contentType;
        this.size = size;
        this.isPreviewImage = isPreviewImage;
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public boolean isPreviewImage() {
        return isPreviewImage;
    }

    public void setPreviewImage(boolean previewImage) {
        isPreviewImage = previewImage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
