package com.vbartere.Shared.Kafka.DTO.PaymentService;

import java.math.BigDecimal;
import java.util.Map;

public class PaymentDTO {
    private Long buyersId;
    private Long advertisementsOwnerId;
    private Map<Long, BigDecimal> advertisementsWithPrice;
}
