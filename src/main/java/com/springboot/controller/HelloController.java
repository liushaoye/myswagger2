package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * Created by
 *
 * @author: liuya
 * @Date: 2018/5/22 14:07
 * @Description: myswagger2
 * <p>
 * 访问位置
 */

@RestController
@RequestMapping("hello")
public class HelloController {


    @ApiIgnore
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "Hello World";
    }

}
