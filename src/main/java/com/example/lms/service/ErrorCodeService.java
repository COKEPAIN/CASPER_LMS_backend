package com.example.lms.service;

import com.example.lms.constant.ErrorCode;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ErrorCodeService {
    public Map<String, Object> setErrorCodeBody(ErrorCode code) {
        return code.toMap();
    }
}

