package com.nttdata.commission.management.service.inter;

import com.nttdata.commission.management.entity.Commission;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CommissionInterface {

  Mono<Commission> save(Commission request);
  Flux<Commission> listAll();
  Mono<Commission> getById(String id);
}
