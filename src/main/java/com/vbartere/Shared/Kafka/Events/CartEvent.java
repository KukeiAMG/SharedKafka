package com.vbartere.Shared.Kafka.Events;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CartEvent {
    private Long userId;
    private boolean isBanned;
    private Long advertisementId;

    public CartEvent() {}

    public CartEvent(Long userId, boolean isBanned, Long advertisementId) {
        this.userId = userId;
        this.isBanned = isBanned;
        this.advertisementId = advertisementId;
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

    @Override
    public String toString() {
        return "CartEvent{" +
                "userId=" + userId +
                ", isBanned=" + isBanned +
                ", advertisementId=" + advertisementId +
                '}';
    }
}
