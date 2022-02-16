package cc.kejun.origin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hch
 * @since 2022/2/16
 */
@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("/get")
    public String get(@RequestParam(required = false) Boolean ex) {
        if (ex != null && ex) {
            throw new RuntimeException("test");
        }
        return "ok";
    }
}
