package com.modulecode.chat.domain.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;

@Data
public class Student {
    private int id;
    @NotEmpty
    private String name;
    @NotNull
    private String gender;

    private Teacher teacher;
}
