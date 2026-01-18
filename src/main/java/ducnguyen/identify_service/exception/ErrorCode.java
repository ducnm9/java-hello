package ducnguyen.identify_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized exception"),
    INVALID_KEYWORD(1000, "Invalid message key"),
    USER_EXISTED(1001, "User already existed"),
    INVALID_REQUEST(1002, "Invalid request"),
    RESOURCE_NOT_FOUND(1003, "Resource not found"),
    INTERNAL_SERVER_ERROR(1004, "Internal server error"),
    USERNAME_INVALID(1005, "Username must be between 3 and 20 characters"),
    INVALID_PASSWORD(1006, "Password must be at least 8 characters long"),
    UNAUTHENTICATED(1007, "Authentication is required to access this resource"),
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
