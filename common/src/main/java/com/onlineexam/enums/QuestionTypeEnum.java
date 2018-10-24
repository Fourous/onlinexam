package com.onlineexam.enums;

public enum QuestionTypeEnum {



    OPTIONS(0,"选择题"),
    BLANKED(1,"填空题"),
    ;

    private Integer code;
    private String message;

    QuestionTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
