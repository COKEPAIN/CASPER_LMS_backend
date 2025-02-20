package com.example.lms.constant;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public enum ErrorCode {
    LOGIN_ID_NOT_FOUND(-101, "로그인 아이디를 찾을 수 없음"),
    LOGIN_PASSWORD_MISMATCH(-102, "로그인 패스워드 불일치"),
    LOGIN_EXCEED_ATTEMPTS(-105, "로그인 5회 이상 실패"),
    ACCOUNT_NOT_FOUND(-106, "해당 정보로 가입된 계정을 찾을 수 없음"),
    SIGNUP_MISSING_PARAMETER(-201, "회원 가입 파라미터 누락"),
    SIGNUP_EMAIL_VERIFICATION_ERROR(-202, "회원 가입 이메일 인증 오류"),
    SIGNUP_DUPLICATE_ID(-203, "회원 가입 ID 중복"),
    BOARD_NO_ACCESS(-301, "게시판 접근 권한 없음"),
    BOARD_NO_WRITE_PERMISSION(-302, "게시글 쓰기 권한 없음"),
    BOARD_NO_EDIT_PERMISSION(-303, "게시글 수정/삭제 권한 없음"),

    FILE_SIZE_EXCEEDED(-401, "파일 용량 10MB 초과"),
    FILE_NAME_INVALID(-402, "파일 이름이 너무 길거나 NULL"),
    ADMIN_PERMISSION_UNCHANGEABLE(-501, "관리자의 권한은 바꿀 수 없음"),
    LOGIN_REQUIRED(-603, "로그인 후 사용 가능"),
    FILE_COUNT_EXCEEDED(-604, "파일 5개 초과"),
    COMMENT_EDIT_SELF_ONLY_AGAIN(-705, "댓글 수정은 본인만 가능"),
    COMMENT_DELETE_LIMITED(-706, "관리자, 작성자만 삭제 가능"),
    FILE_COUNT_EXCEEDED_AGAIN(-707, "파일 5개 초과"),
    USABLE_ONLY_DEVELOPMENT(-1000, "개발 환경에서만 사용 가능"),
    UNDEFINED_ERROR(-1, "지정되지 않은 에러");

    private final int code;
    private final String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ErrorCode valueOf(int code) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.code == code) {
                return errorCode;
            }
        }
        return UNDEFINED_ERROR;
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("message", message);
        return map;
    }

}
