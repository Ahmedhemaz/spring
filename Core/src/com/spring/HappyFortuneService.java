package com.spring;

public class HappyFortuneService implements IFortuneService {

    @Override
    public String getFourtune(){
        return "Good Luck mate";
    }
}
