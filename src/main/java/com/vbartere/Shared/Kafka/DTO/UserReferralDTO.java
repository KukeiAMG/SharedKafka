package com.vbartere.Shared.Kafka.DTO;

public class UserReferralDTO {

    private Long id;
    private String name;

    private String invitedByCode;

    public UserReferralDTO(Long id, String name, String invitedByCode) {
        this.id = id;
        this.name = name;
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

    public String getName() {
            return name;
        }

    public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {
        return "UserDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


