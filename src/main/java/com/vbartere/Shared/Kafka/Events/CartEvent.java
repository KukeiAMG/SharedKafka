package com.vbartere.Shared.Kafka.Events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vbartere.Shared.Kafka.Enum.CartEventType;

import java.math.BigDecimal;

public class CartEvent {
    private Long userId;
    private boolean isBanned;
    private Long advertisementId;
    private BigDecimal price;
    private CartEventType cartEventType;

    public CartEvent() {}

    public CartEvent(Long userId, boolean isBanned, Long advertisementId, BigDecimal price, CartEventType cartEventType) {
        this.userId = userId;
        this.isBanned = isBanned;
        this.advertisementId = advertisementId;
        this.price = price;
        this.cartEventType = cartEventType;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
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

    public CartEventType getCartEventType() {
        return cartEventType;
    }

    public void setCartEventType(CartEventType cartEventType) {
        this.cartEventType = cartEventType;
    }

    @Override
    public String toString() {
        return "CartEvent{" +
                "userId=" + userId +
                ", isBanned=" + isBanned +
                ", advertisementId=" + advertisementId +
                ", price=" + price +
                ", cartEventType=" + cartEventType +
                '}';
    }
}
