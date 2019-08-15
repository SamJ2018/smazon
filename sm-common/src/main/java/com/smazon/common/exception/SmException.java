package com.smazon.common.exception;

import com.smazon.common.enums.ExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author sam
 * @apiNote 自定义异常
 * @since 2019-08-15-8:26 PM
 **/

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class SmException extends RuntimeException {
    private ExceptionEnum exceptionEnum;
}
