package practice.communityservice.domain.exceptions;

import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter
public enum ErrorCode {
    /**
     * 400 Bad Request
     */
    ROW_DOES_NOT_EXIST(4000),
    ROW_ALREADY_EXIST(4001),
    INVALID_PARAMETER(4002),            // Parameter format error
    INVALID_USER_DATA_REQUEST(4003),    // User signup & update validation error
    TARGET_DELETED(4004),
    INVALID_HTTP_METHOD(4005),
    APPLY_NOT_EXIST(4006),
    CANNOT_PERFORMED(4007),
    AWAITING_STATUS(4008),
    INVALID_STUDENT_ID(4009),
    TIME_NOT_PASSED(4010),
    NO_APPLICATION(4011),
    NEED_SIGN_IN(4012),
    INVALID_REQUEST_ROLE(4013),
    INVALID_REQUEST_USER_STATE(4014),
    INVALID_FILE_EXTENSION(4015),
    INVALID_EXPIRE_DATE(4016),
    FLAG_NOT_AVAILABLE(4017),

    /**
     * 401 Unauthorized
     */
    API_NOT_ACCESSIBLE(4100),
    INVALID_SIGNIN(4101),
    LEAVED_USER(4102),

    INVALID_JWT(4105),
    INVALID_REFRESH(4106),

    /**
     * 500 Internal Server Error
     */
    INTERNAL_SERVER(5000),
    DATABASE_ERROR(5001),

    /**
     * 503 Service Unavailable Error
     */
    SERVICE_UNAVAILABLE(5030);

    @JsonValue
    private int code;

    ErrorCode(int code) {
        this.code = code;
    }
}
