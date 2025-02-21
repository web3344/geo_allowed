package com.wxl.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Result<T> implements Serializable {

    private Integer code;
    private String msg;
    private T data;




    public static <T> Result<T> success(T data) {
        return new Result<T>(HttpStatus.OK.value(),"success" , data);
    }

}
