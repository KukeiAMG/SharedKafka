package com.vbartere.Shared.Kafka.DTO.Cart;

import com.vbartere.Shared.Kafka.DTO.Embeddable.CartItemDTO;

import java.util.List;

public class CartDTO {
    private Long id;
    private Long userId;
    private List<CartItemDTO> advertisementIds;

    public CartDTO() {}

    public CartDTO(Long id, Long userId, List<CartItemDTO> advertisementIds) {
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

    public List<CartItemDTO> getAdvertisementIds() {
        return advertisementIds;
    }

    public void setAdvertisementIds(List<CartItemDTO> advertisementIds) {
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
