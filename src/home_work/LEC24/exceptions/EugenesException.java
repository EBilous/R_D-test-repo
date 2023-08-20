package src.home_work.LEC24.exceptions;

import java.io.IOException;
import java.util.Objects;

public class EugenesException extends IOException {
private final String message;
private final int errorCode;

    public EugenesException(String message, int errorCode) {
        super();
        this.message = message;
        this.errorCode = errorCode;
    }

    @Override public String getMessage() {
        return message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    @Override public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EugenesException that = (EugenesException) o;

        if (errorCode != that.errorCode) {
            return false;
        }
        return Objects.equals(message, that.message);
    }

    @Override public int hashCode() {
        int result = message != null ? message.hashCode() : 0;
        result = 31 * result + errorCode;
        return result;
    }

    @Override public String toString() {
        return "EugenesException{" +
            "message='" + message + '\'' +
            ", errorCode=" + errorCode +
            '}';
    }
}
