package com.vbartere.Shared.Kafka.Events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartResult {
    private Long userId;
    private Long advertisementId;
    private boolean successful;
    private boolean forceClear;

    @JsonCreator
    public CartResult(@JsonProperty("userId") Long userId,
                      @JsonProperty("advertisementId") Long advertisementId,
                      @JsonProperty("successful") boolean successful,
                      @JsonProperty("forceClear") boolean forceClear) {
        this.userId = userId;
        this.advertisementId = advertisementId;
        this.successful = successful;
        this.forceClear = forceClear;
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

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }

    public boolean isForceClear() {
        return forceClear;
    }

    public void setForceClear(boolean forceClear) {
        this.forceClear = forceClear;
    }

    @Override
    public String toString() {
        return "CartResult{" +
                "userId=" + userId +
                ", advertisementId=" + advertisementId +
                ", successful=" + successful +
                ", forceClear=" + forceClear +
                '}';
    }
}
