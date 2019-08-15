package com.smazon.common.vo;

import com.smazon.common.enums.ExceptionEnum;
import lombok.Data;

/**
 * @author sam
 * @apiNote 异常结果对象
 * @since 2019-08-15-8:34 PM
 **/
@Data
public class ExceptionResult {
    private int status; //状态码
    private String message; //消息
    private Long timestamp; //时间戳

    /**
     * 设置异常结果对象的值
     * @param em
     */
    public ExceptionResult(ExceptionEnum em) {
        this.status = em.getCode();
        this.message = em.getMsg();
        this.timestamp = System.currentTimeMillis();
    }
}
