package com.example.demo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SimpleTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "step1", column = @Column(name = "step1_name"))
    })
    private Step1 step1;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "step2", column = @Column(name = "step2_name"))
    })
    private Step2 step2;

    public SimpleTask() {

    }

    public SimpleTask(Step1 step1, Step2 step2) {
        this.step1 = step1;
        this.step2 = step2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Step1 getStep1() {
        return step1;
    }

    public void setStep1(Step1 step1) {
        this.step1 = step1;
    }

    public Step2 getStep2() {
        return step2;
    }

    public void setStep2(Step2 step2) {
        this.step2 = step2;
    }
}
