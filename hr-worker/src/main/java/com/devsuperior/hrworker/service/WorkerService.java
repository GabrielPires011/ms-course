package com.devsuperior.hrworker.service;

import com.devsuperior.hrworker.domain.Worker;
import com.devsuperior.hrworker.repository.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class WorkerService {

    @Autowired
    private WorkerRepository repository;

    public List<Worker> findAll(){
        var workerFindAll = repository.findAll();
        return workerFindAll;
    }

    public Optional<Worker> workerById(Long id){
        var workerId = repository.findById(id);
        return workerId;
    }
}
