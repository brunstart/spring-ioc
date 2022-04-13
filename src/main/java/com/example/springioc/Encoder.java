package com.example.springioc;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


public class Encoder {

    private IEncoder iEncoder;

//    public Encoder(@Qualifier("base74Encoder") IEncoder iEncoder)
//    @Qualifier 로 component의 이름을 직접 호출

    public Encoder(IEncoder iEncoder){

        this.iEncoder = iEncoder;
//        this.iEncoder = new Base64Encoder();
//        this.iEncoder = new UrlEncoder();
    }

    public void setIEncoder(IEncoder iEncoder){
        this.iEncoder = iEncoder;
    }

    public String encode(String message){
        return iEncoder.encode(message);
    }
}