package com.example.demo;

import javax.persistence.Embeddable;

@Embeddable
public class Step2 {
    private String step2;

    public Step2() {

    }

    public Step2(String step2) {
        this.step2 = step2;
    }


    public String getStep2() {
        return step2;
    }

    public void setStep2(String step2) {
        this.step2 = step2;
    }
}
