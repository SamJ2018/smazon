package com.smazon.item.pojo;

import lombok.Data;

/**
 * @author sam
 * @apiNote
 * @since 2019-08-15-7:56 PM
 **/
@Data
public class Item {
    private Integer id;
    private String name;
    private Long price;
}
