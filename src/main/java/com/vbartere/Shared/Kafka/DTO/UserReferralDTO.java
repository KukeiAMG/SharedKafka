package com.vbartere.Shared.Kafka.DTO;

public class UserReferralDTO {

    private Long id;
    private String invitedByCode;

    public UserReferralDTO(Long id, String invitedByCode) {
        this.id = id;
        this.invitedByCode = invitedByCode;
    }

    public String getInvitedByCode() {
        return invitedByCode;
    }

    public void setInvitedByCode(String invitedByCode) {
        this.invitedByCode = invitedByCode;
    }

    public Long getId() {
            return id;
        }

    public void setId(Long id) {
            this.id = id;
        }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", invitedByCode='" + invitedByCode + '\'' +
                '}';
    }
}


