package com.vbartere.Shared.Kafka.DTO.Advertisement;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.List;

public class AdvertisementDTO {
    private Long id;
    private String title;
    private String description;
    private Long subCategoryId; // Используем ID для связи с SubCategory
    private Long ownerId;
    private Long buyersId;
    private List<Long> imagesId;
    private boolean status;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    public AdvertisementDTO() {}

    public AdvertisementDTO(Long id, String title, String description, Long subCategoryId, Long ownerId, Long buyersId, List<Long> imagesId, boolean status, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.subCategoryId = subCategoryId;
        this.ownerId = ownerId;
        this.buyersId = buyersId;
        this.imagesId = imagesId;
        this.status = status;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(Long subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getBuyersId() {
        return buyersId;
    }

    public void setBuyersId(Long buyersId) {
        this.buyersId = buyersId;
    }

    public List<Long> getImagesId() {
        return imagesId;
    }

    public void setImagesId(List<Long> imagesId) {
        this.imagesId = imagesId;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AdvertisementDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subCategoryId=" + subCategoryId +
                ", ownerId=" + ownerId +
                ", buyersId=" + buyersId +
                ", imagesId=" + imagesId +
                ", status=" + status +
                '}';
    }
}
