package com.vbartere.Shared.Kafka.Events;

import com.vbartere.Shared.Kafka.Enum.PaymentEventType;

import java.math.BigDecimal;
import java.util.Map;

public class PaymentEvent {
    private Long buyersId;
    private Map<Long, BigDecimal> advertisementsWithPrice;
    private PaymentEventType eventType;
    private String message;

    public PaymentEvent() {}

    public PaymentEvent(Long buyersId, Map<Long, BigDecimal> advertisementsWithPrice, PaymentEventType eventType, String message) {
        this.buyersId = buyersId;
        this.advertisementsWithPrice = advertisementsWithPrice;
        this.eventType = eventType;
        this.message = message;
    }

    public Long getBuyersId() {
        return buyersId;
    }

    public void setBuyersId(Long buyersId) {
        this.buyersId = buyersId;
    }

    public Map<Long, BigDecimal> getAdvertisementsWithPrice() {
        return advertisementsWithPrice;
    }

    public void setAdvertisementsWithPrice(Map<Long, BigDecimal> advertisementsWithPrice) {
        this.advertisementsWithPrice = advertisementsWithPrice;
    }

    public PaymentEventType getEventType() {
        return eventType;
    }

    public void setEventType(PaymentEventType eventType) {
        this.eventType = eventType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PaymentEvent{" +
                "buyersId=" + buyersId +
                ", advertisementsWithPrice=" + advertisementsWithPrice +
                ", eventType=" + eventType +
                ", message='" + message + '\'' +
                '}';
    }
}
