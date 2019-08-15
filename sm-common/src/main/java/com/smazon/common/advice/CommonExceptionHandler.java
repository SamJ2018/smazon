package com.smazon.common.advice;

import com.smazon.common.enums.ExceptionEnum;
import com.smazon.common.exception.SmException;
import com.smazon.common.vo.ExceptionResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author sam
 * @apiNote 自动拦截所有的Controller(默认情况下) 通用的异常处理
 * @since 2019-08-15-8:15 PM
 **/
@ControllerAdvice
public class CommonExceptionHandler {

    /**
     * 拦截controller, runtimeException异常
     * @param e 自定义的异常
     * @return 异常结果对象（message status timestamp）
     */
    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ExceptionResult> handleException(SmException e) {
        return ResponseEntity.status(e.getExceptionEnum().getCode()).
                body(new ExceptionResult(e.getExceptionEnum()));//设置状态码,出错消息，时间戳等
    }
}
