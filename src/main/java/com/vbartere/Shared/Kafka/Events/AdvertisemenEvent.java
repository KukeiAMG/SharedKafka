package com.vbartere.Shared.Kafka.Events;

import com.vbartere.Shared.Kafka.Enum.AdvertisementEventType;

/**
 * Класс AdvertisementEvent используется для передачи событий, связанных с объявлениями,
 * между микросервисами через Kafka или другой механизм обмена сообщениями.
 *
 * <p>Основное назначение — уведомление AdvertisementService о действиях,
 * совершаемых администратором в AdminService (например, удаление объявления).
 *
 * <p>Пример использования: при удалении объявления администратором, в топик отправляется
 * объект этого класса с типом события {@link AdvertisementEventType#ADVERTISEMENT_BANNED},
 * чтобы основной сервис мог также удалить объявление у себя по причине его бана.
 *
 * <p>Содержит ключевые поля:
 * <ul>
 *   <li>{@code id} — идентификатор объявления</li>
 *   <li>{@code name} — название объявления</li>
 *   <li>{@code description} — краткое описание</li>
 *   <li>{@code eventType} — тип события (создание, обновление, удаление и т.д.)</li>
 * </ul>
 */

public class AdvertisemenEvent {
    private Long id;
    private String name;
    private String description;
    private AdvertisementEventType eventType;

    public AdvertisemenEvent() {}

    public AdvertisemenEvent(Long id, String name, String description, AdvertisementEventType eventType) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.eventType = eventType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public AdvertisementEventType getEventType() {
        return eventType;
    }

    public void setEventType(AdvertisementEventType eventType) {
        this.eventType = eventType;
    }
}
