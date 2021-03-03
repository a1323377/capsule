package com.time.base.controller;

import com.time.common.base.model.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanghao
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("/get")
    public R test(){return R.ok();}
}
