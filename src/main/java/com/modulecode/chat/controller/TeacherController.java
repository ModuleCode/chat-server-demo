package com.modulecode.chat.controller;

import com.modulecode.chat.domain.dto.Teacher;
import com.modulecode.chat.domain.vo.ResultVO;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @PostMapping
    public ResultVO add(@RequestBody @Valid Teacher teacher) {
        return ResultVO.success();
    }
}
