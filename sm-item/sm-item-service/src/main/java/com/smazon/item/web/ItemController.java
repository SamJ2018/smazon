package com.smazon.item.web;

import com.smazon.common.enums.ExceptionEnum;
import com.smazon.common.exception.SmException;
import com.smazon.item.pojo.Item;
import com.smazon.item.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sam
 * @apiNote
 * @since 2019-08-15-7:58 PM
 **/

@RestController
@RequestMapping("item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping
    public ResponseEntity<Item> saveItem(Item item) {
        //Rest风格返回
        //校验价格
        if (item.getPrice() == null) {
            //传入自定义异常
            throw new SmException(ExceptionEnum.PRICE_CANNOT_BE_NULL);
        }
        Item item1 = itemService.saveItem(item);
        return ResponseEntity.status(HttpStatus.CREATED).body(item1);
    }
}
