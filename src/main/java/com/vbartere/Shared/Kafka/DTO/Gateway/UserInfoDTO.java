package com.vbartere.Shared.Kafka.DTO.Gateway;

import java.util.List;

public class UserInfoDTO {
    private Long id;
    private List<String> roles;

    public UserInfoDTO() {}

    public UserInfoDTO(Long id, List<String> roles) {
        this.id = id;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
