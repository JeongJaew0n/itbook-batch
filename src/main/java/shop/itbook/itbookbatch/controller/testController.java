package shop.itbook.itbookbatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @GetMapping("/")
    public String home() {
        //안녕하세요 테스트입니다.
        return "Batch서버입니다.";
    }
}
