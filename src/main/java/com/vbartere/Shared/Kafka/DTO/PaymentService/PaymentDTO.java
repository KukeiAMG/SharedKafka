package com.vbartere.Shared.Kafka.DTO.PaymentService;

import java.math.BigDecimal;
import java.util.Map;

public class PaymentDTO {
    private Long buyersId;
    private Long advertisementsOwnerId;
    private Map<Long, BigDecimal> advertisementsWithPrice;

    public PaymentDTO() {}

    public PaymentDTO(Long buyersId, Long advertisementsOwnerId, Map<Long, BigDecimal> advertisementsWithPrice) {
        this.buyersId = buyersId;
        this.advertisementsOwnerId = advertisementsOwnerId;
        this.advertisementsWithPrice = advertisementsWithPrice;
    }

    public Long getBuyersId() {
        return buyersId;
    }

    public void setBuyersId(Long buyersId) {
        this.buyersId = buyersId;
    }

    public Long getAdvertisementsOwnerId() {
        return advertisementsOwnerId;
    }

    public void setAdvertisementsOwnerId(Long advertisementsOwnerId) {
        this.advertisementsOwnerId = advertisementsOwnerId;
    }

    public Map<Long, BigDecimal> getAdvertisementsWithPrice() {
        return advertisementsWithPrice;
    }

    public void setAdvertisementsWithPrice(Map<Long, BigDecimal> advertisementsWithPrice) {
        this.advertisementsWithPrice = advertisementsWithPrice;
    }

    @Override
    public String toString() {
        return "PaymentDTO{" +
                "buyersId=" + buyersId +
                ", advertisementsOwnerId=" + advertisementsOwnerId +
                ", advertisementsWithPrice=" + advertisementsWithPrice +
                '}';
    }
}
