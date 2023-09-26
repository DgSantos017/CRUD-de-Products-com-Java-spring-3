package com.myProducts.myProducts.execptions;

import lombok.Data;

@Data
public class ErrorMensageExecption {
    private String errorMensage;

    public ErrorMensageExecption(String errorMensageParam){
        this.errorMensage = errorMensageParam;
    }
}
