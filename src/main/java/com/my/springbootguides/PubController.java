package com.my.springbootguides;

import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class PubController {

    @RequestMapping("/sayhi")
    public Object sayHello(@RequestParam(value = "name") String name){
        String content = "Hello, World!";
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", 1);
        if(StringUtils.hasText(name)){
            jsonObject.put("content", "Hello,"+name);
        }else{
            jsonObject.put("content", content);
        }

        return jsonObject;
    }
}
