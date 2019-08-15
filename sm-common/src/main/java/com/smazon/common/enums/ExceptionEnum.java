package com.smazon.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author sam
 * @apiNote 自定义异常枚举类型
 * @since 2019-08-15-8:27 PM
 **/
@Getter
@NoArgsConstructor  //枚举里的构造函数都是私有的，可以创建单例
@AllArgsConstructor
public enum ExceptionEnum {
    PRICE_CANNOT_BE_NULL(400, "价格不能为空！"),

    ;
    private int code;    //状态码
    private String msg;  //传递的异常消息
}
