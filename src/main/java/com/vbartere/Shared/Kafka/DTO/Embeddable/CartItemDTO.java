package com.vbartere.Shared.Kafka.DTO.Embeddable;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Embeddable;

import java.math.BigDecimal;

@Embeddable
public class CartItemDTO {
    private Long advertisementId;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private BigDecimal price;
    private Boolean selected;

    public CartItemDTO() {}

    public CartItemDTO(Long advertisementId, BigDecimal price, Boolean selected) {
        this.advertisementId = advertisementId;
        this.price = price;
        this.selected = selected;
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

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    @Override
    public String toString() {
        return "CartItemDTO{" +
                "advertisementId=" + advertisementId +
                ", price=" + price +
                ", selected=" + selected +
                '}';
    }
}
