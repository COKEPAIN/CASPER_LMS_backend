package com.example.lms.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import lombok.Getter;

@Getter
public enum UserRole {

    ADMIN("admin"),
    ASSOCIATE("associate"),
    GRAUATE("graduate"),
    REST("rest"),
    ACTIVE("active"),
    GUEST("guest");

    private final String role;

    UserRole(String role) { this.role = role; }

    public static UserRole valueOfRole(String role) {
        for ( UserRole userRole : values()) {
            if ( userRole.getRole().equals(role)) {
                return userRole;
            }
        }
        return GUEST;
    }

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public static UserRole fromString(String role) { return valueOfRole(role); }
}
