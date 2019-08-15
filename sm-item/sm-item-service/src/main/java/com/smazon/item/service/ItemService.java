package com.smazon.item.service;

import com.smazon.item.pojo.Item;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author sam
 * @apiNote
 * @since 2019-08-15-7:57 PM
 **/
@Service
public class ItemService {
    public Item saveItem(Item item) {
        //商品新增
        int id = new Random().nextInt(100);
        item.setId(id);
        return item;
    }
}
