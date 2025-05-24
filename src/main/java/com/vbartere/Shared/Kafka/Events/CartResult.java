package com.vbartere.Shared.Kafka.Events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.vbartere.Shared.Kafka.Enum.UserEventType;

import java.math.BigDecimal;

public class CartResult {
    private Long userId;
    private Long advertisementId;
    private BigDecimal price;
    private boolean successfullyProcessed;
    private UserEventType eventType;

    public CartResult() {}

    @JsonCreator
    public CartResult(@JsonProperty("userId") Long userId,
                      @JsonProperty("advertisementId") Long advertisementId,
                      @JsonProperty("price") BigDecimal price,
                      @JsonProperty("successfullyProcessed") boolean successfullyProcessed,
                      @JsonProperty("eventType") UserEventType eventType) {
        this.userId = userId;
        this.advertisementId = advertisementId;
        this.successfullyProcessed = successfullyProcessed;
        this.eventType = eventType;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isSuccessfullyProcessed() {
        return successfullyProcessed;
    }

    public void setSuccessfullyProcessed(boolean successfullyProcessed) {
        this.successfullyProcessed = successfullyProcessed;
    }

    public UserEventType getEventType() {
        return eventType;
    }

    public void setEventType(UserEventType eventType) {
        this.eventType = eventType;
    }

    @Override
    public String toString() {
        return "CartResult{" +
                "userId=" + userId +
                ", advertisementId=" + advertisementId +
                ", price=" + price +
                ", successfullyProcessed=" + successfullyProcessed +
                ", eventType=" + eventType +
                '}';
    }
}
