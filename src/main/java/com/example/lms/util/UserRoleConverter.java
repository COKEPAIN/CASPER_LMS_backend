package com.example.lms.util;

import com.example.lms.constant.UserRole;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.apache.catalina.User;

@Converter(autoApply = true)
public class UserRoleConverter implements AttributeConverter<UserRole, String> {

    @Override
    public String convertToDatabaseColumn(UserRole attribute) {
        if ( attribute == null) {
            return null;
        }
        return attribute.getRole();
    }

    @Override
    public UserRole convertToEntityAttribute(String dbData) {
        if ( dbData == null ){
            return null;
        }

        return UserRole.valueOfRole(dbData);
    }
}
