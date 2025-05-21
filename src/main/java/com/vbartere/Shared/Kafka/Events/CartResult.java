package com.vbartere.Shared.Kafka.Events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartResult {
    private Long userId;
    private Long advertisementId;
    private boolean addToCart;
    private boolean forceClear;
    private boolean removeFromCart;

    public CartResult() {}

    @JsonCreator
    public CartResult(@JsonProperty("userId") Long userId,
                      @JsonProperty("advertisementId") Long advertisementId,
                      @JsonProperty("addToCart") boolean addToCart,
                      @JsonProperty("forceClear") boolean forceClear,
                      @JsonProperty("removeFromCart") boolean removeFromCart) {
        this.userId = userId;
        this.advertisementId = advertisementId;
        this.addToCart = addToCart;
        this.forceClear = forceClear;
        this.removeFromCart = removeFromCart;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getAdvertisementId() {
        return advertisementId;
    }

    public void setAdvertisementId(Long advertisementId) {
        this.advertisementId = advertisementId;
    }

    public boolean isAddToCart() {
        return addToCart;
    }

    public void setAddToCart(boolean addToCart) {
        this.addToCart = addToCart;
    }

    public boolean isForceClear() {
        return forceClear;
    }

    public void setForceClear(boolean forceClear) {
        this.forceClear = forceClear;
    }

    public boolean isRemoveFromCart() {
        return removeFromCart;
    }

    public void setRemoveFromCart(boolean removeFromCart) {
        this.removeFromCart = removeFromCart;
    }

    @Override
    public String toString() {
        return "CartResult{" +
                "userId=" + userId +
                ", advertisementId=" + advertisementId +
                ", addToCart=" + addToCart +
                ", forceClear=" + forceClear +
                ", removeFromCart=" + removeFromCart +
                '}';
    }
}
