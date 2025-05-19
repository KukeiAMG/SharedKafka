package com.vbartere.Shared.Kafka.DTO.Cart;

import java.util.List;

public class CartDTO {
    private Long id;
    private Long userId;
    private List<Long> advertisementIds;

    public CartDTO() {}

    public CartDTO(Long id, Long userId, List<Long> advertisementIds) {
        this.id = id;
        this.userId = userId;
        this.advertisementIds = advertisementIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getAdvertisementIds() {
        return advertisementIds;
    }

    public void setAdvertisementIds(List<Long> advertisementIds) {
        this.advertisementIds = advertisementIds;
    }

    @Override
    public String toString() {
        return "CartDTO{" +
                "id=" + id +
                ", userId=" + userId +
                ", advertisementIds=" + advertisementIds +
                '}';
    }
}
