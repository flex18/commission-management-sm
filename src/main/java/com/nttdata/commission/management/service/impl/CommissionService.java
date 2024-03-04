package com.nttdata.commission.management.service.impl;

import com.nttdata.commission.management.entity.Commission;
import com.nttdata.commission.management.repository.CommissionRepository;
import com.nttdata.commission.management.service.inter.CommissionInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CommissionService implements CommissionInterface {

  @Autowired
  CommissionRepository commissionRepository;
  @Override
  public Mono<Commission> save(Commission request) {
    return commissionRepository.save(request);
  }

  @Override
  public Flux<Commission> listAll() {
    return commissionRepository.findAll();
  }

  @Override
  public Mono<Commission> getById(String id) {
    return commissionRepository.findById(id);
  }
}
