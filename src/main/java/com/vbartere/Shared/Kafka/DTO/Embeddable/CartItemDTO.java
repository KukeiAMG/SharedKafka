package com.vbartere.Shared.Kafka.DTO.Embeddable;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class CartItemDTO {
    private Long advertisementId;
    private BigDecimal price;

    public CartItemDTO() {}

    public CartItemDTO(Long advertisementId, BigDecimal price) {
        this.advertisementId = advertisementId;
        this.price = price;
    }

    public Long getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Long advertisementId) {
        this.advertisementId = advertisementId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "advertisementId=" + advertisementId +
                ", price=" + price +
                '}';
    }
}
