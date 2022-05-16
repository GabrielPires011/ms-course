package com.devsuperior.hrpayroll.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment implements Serializable {

    private String name;
    private Double dailyIncome;
    private Integer days;

    public double getTotal(){
        return days * dailyIncome;
    }
}
