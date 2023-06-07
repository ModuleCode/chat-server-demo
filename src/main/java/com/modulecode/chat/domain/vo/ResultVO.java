package com.modulecode.chat.domain.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.modulecode.chat.enums.ErrorCode;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO {
    private boolean success;
    private  String code;
    private  String message;
    private  Object data;

    public  static  ResultVO success(){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        return resultVO;
    }
    public  static  ResultVO success(Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(true);
        resultVO.setData(data);
        return resultVO;
    }

    public  static  ResultVO fail(ErrorCode errorCode, Object data){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(errorCode.getCode());
        resultVO.setMessage(errorCode.getMsg());
        resultVO.setData(data);
        return resultVO;
    }
    public  static  ResultVO fail(ErrorCode errorCode){
        ResultVO resultVO = new ResultVO();
        resultVO.setSuccess(false);
        resultVO.setCode(errorCode.getCode());
        resultVO.setMessage(errorCode.getMsg());
        return resultVO;
    }
}
