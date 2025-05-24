package com.vbartere.Shared.Kafka.DTO.AdminService;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.vbartere.Shared.Kafka.Enum.AdvertisementEventType;
import jakarta.persistence.ElementCollection;

import java.math.BigDecimal;
import java.util.List;

public class AdminAdvertisementDTO {
    private Long id;

    private String title;

    private String description;

    private Long subcategoryId;

    private String subcategoryTitle;

    @ElementCollection
    private List<String> imageUrls;

    private Long ownerId;

    private String ownerUsername;

    private Long buyersId;

    private String buyerUsername;

    private Boolean status;

    private AdvertisementEventType eventType;

    private Boolean banStatus;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;

    public AdminAdvertisementDTO() {}

    public AdminAdvertisementDTO(Long id, String title, String description, Long subcategoryId, String subcategoryTitle, List<String> imageUrls, Long ownerId, String ownerUsername, Long buyersId, String buyerUsername, Boolean status, AdvertisementEventType eventType, Boolean banStatus, BigDecimal price) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.subcategoryId = subcategoryId;
        this.subcategoryTitle = subcategoryTitle;
        this.imageUrls = imageUrls;
        this.ownerId = ownerId;
        this.ownerUsername = ownerUsername;
        this.buyersId = buyersId;
        this.buyerUsername = buyerUsername;
        this.status = status;
        this.eventType = eventType;
        this.banStatus = banStatus;
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

    public Long getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(Long subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getSubcategoryTitle() {
        return subcategoryTitle;
    }

    public void setSubcategoryTitle(String subcategoryTitle) {
        this.subcategoryTitle = subcategoryTitle;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerUsername() {
        return ownerUsername;
    }

    public void setOwnerUsername(String ownerUsername) {
        this.ownerUsername = ownerUsername;
    }

    public Long getBuyersId() {
        return buyersId;
    }

    public void setBuyersId(Long buyersId) {
        this.buyersId = buyersId;
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public AdvertisementEventType getEventType() {
        return eventType;
    }

    public void setEventType(AdvertisementEventType eventType) {
        this.eventType = eventType;
    }

    public Boolean getBanStatus() {
        return banStatus;
    }

    public void setBanStatus(Boolean banStatus) {
        this.banStatus = banStatus;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AdminAdvertisementDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", subcategoryId=" + subcategoryId +
                ", subcategoryTitle='" + subcategoryTitle + '\'' +
                ", imageUrls=" + imageUrls +
                ", ownerId=" + ownerId +
                ", ownerUsername='" + ownerUsername + '\'' +
                ", buyersId=" + buyersId +
                ", buyerUsername='" + buyerUsername + '\'' +
                ", status=" + status +
                ", eventType=" + eventType +
                ", banStatus=" + banStatus +
                ", price=" + price +
                '}';
    }
}
