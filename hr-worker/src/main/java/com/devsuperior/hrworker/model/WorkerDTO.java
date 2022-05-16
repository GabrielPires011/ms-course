package com.devsuperior.hrworker.model;

import com.devsuperior.hrworker.domain.Worker;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class WorkerDTO implements Serializable {

    private long id;
    private String name;
    private Double dailyIncome;

    public WorkerDTO(Worker obj) {
        id = obj.getId();
        name = obj.getName();
        dailyIncome = obj.getDailyIncome();
    }
}
