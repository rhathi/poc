package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Step1 {
    private String step1;

    public Step1() {

    }

    public Step1(String step1) {
        this.step1 = step1;
    }

    public String getStep1() {
        return step1;
    }

    public void setStep1(String step1) {
        this.step1 = step1;
    }

}
