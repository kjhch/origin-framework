package cc.kejun.origin.core;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author hch
 * @since 2022/2/16
 */
@RestControllerAdvice
public class ServerErrorHandler {
    @ExceptionHandler(Exception.class)
    @ResponseStatus
    public String handleException(Exception e) {
        // e.printStackTrace();
        return "ex";
    }
}
