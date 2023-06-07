package com.modulecode.chat.controller;

import com.modulecode.chat.domain.dto.User;
import com.modulecode.chat.domain.vo.ResultVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
//@Validated
public class UserController {
    @PostMapping("/login")
    public ResultVO login(@Valid @RequestBody  User user) {
        return ResultVO.success();
    }

}
