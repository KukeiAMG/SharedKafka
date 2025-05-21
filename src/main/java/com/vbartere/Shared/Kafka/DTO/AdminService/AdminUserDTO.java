package com.vbartere.Shared.Kafka.DTO.AdminService;

import com.vbartere.Shared.Kafka.Enum.UserEventType;
import jakarta.persistence.ElementCollection;

import java.util.List;
import java.util.Set;

public class AdminUserDTO {
    private Long id;

    private String phoneNumber;

    private String name;

    private String surname;

    private String invitedByCode;

    private String email;

    private String imageUrl;

    @ElementCollection
    private Set<String> roles;

    public boolean banned;

    public UserEventType event;

    private List<Long> addedAdvertisements;

    public AdminUserDTO() {
    }

    public AdminUserDTO(Long id, String phoneNumber, String name, String surname, String invitedByCode, String email, String imageUrl, Set<String> roles, boolean banned, UserEventType event, List<Long> addedAdvertisements) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.surname = surname;
        this.invitedByCode = invitedByCode;
        this.email = email;
        this.imageUrl = imageUrl;
        this.roles = roles;
        this.banned = banned;
        this.event = event;
        this.addedAdvertisements = addedAdvertisements;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInvitedByCode() {
        return invitedByCode;
    }

    public void setInvitedByCode(String invitedByCode) {
        this.invitedByCode = invitedByCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Set<String> getRoles() {
        return roles;
    }

    public void setRoles(Set<String> roles) {
        this.roles = roles;
    }

    public boolean isBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public UserEventType getEvent() {
        return event;
    }

    public void setEvent(UserEventType event) {
        this.event = event;
    }

    public List<Long> getAddedAdvertisements() {
        return addedAdvertisements;
    }

    public void setAddedAdvertisements(List<Long> addedAdvertisements) {
        this.addedAdvertisements = addedAdvertisements;
    }
}