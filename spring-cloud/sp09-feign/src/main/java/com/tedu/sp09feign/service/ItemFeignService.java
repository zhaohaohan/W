package com.tedu.sp09feign.service;


import com.tedu.sp01.pojo.Item;
import com.tedu.web.util.JsonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
//根据name属性配置得到要访问的地址
@FeignClient(name="item-service", fallback = ItemFeignServiceFB.class)
public interface ItemFeignService {
    /**
     * 根据Mapping中指定的路径，在主机地址后面拼接路径
     *http://localhsot:8001/{orderId}
     * 根据@PathVariable  配置把参数数据，拼接到路径当中
     * 假设参数是“123”
     * http://localhsot:8001/123
     * 向拼接路径来转发调用
     * */
    @GetMapping("/{orderId}")
    JsonResult<List<Item>> getItems(@PathVariable String orderId);
    /**
     * 根据配置，拼接下面的路径，并想下面路径转发请求
     * 在协议体中，携带商品参数
     * */
    @PostMapping("/decreaseNumber")
    JsonResult decreaseNumber(@RequestBody List<Item> items);
}
