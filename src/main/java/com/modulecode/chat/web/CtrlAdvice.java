package com.modulecode.chat.web;

import com.modulecode.chat.domain.vo.ResultVO;
import com.modulecode.chat.enums.ErrorCode;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@ControllerAdvice
@ResponseBody
public class CtrlAdvice {
    @ExceptionHandler
    public ResultVO exceptionHandler(MethodArgumentNotValidException e){
        Map<String, String> fieldErrors = e.getBindingResult().getFieldErrors().stream()
                .collect(Collectors.toMap(FieldError::getField,FieldError::getDefaultMessage));
        return ResultVO.fail(ErrorCode.PARAM_ERROR,fieldErrors);
    }


    @ExceptionHandler
    public ResultVO exceptionHandler(HttpMessageNotReadableException e){
        return ResultVO.fail(ErrorCode.BODY_NONE_ERROR);
    }
    @ExceptionHandler
    public ResultVO exceptionHandler(HttpRequestMethodNotSupportedException e){

        return ResultVO.fail(ErrorCode.REQUEST_METHODS_ERROR);
    }
}
