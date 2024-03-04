package com.nttdata.commission.management.controller;

import com.nttdata.commission.management.entity.Commission;
import com.nttdata.commission.management.service.impl.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/commission")
public class CommissionController {

  @Autowired
  CommissionService commissionService;

  @GetMapping
  public Flux<Commission> getAllCommissions() {
    return commissionService.listAll();
  }

  @GetMapping("/{id}")
  public Mono<Commission> getByIdCommission(@PathVariable String id) {
    return commissionService.getById(id);
  }

  @PostMapping
  public Mono<Commission> addCommission(@RequestBody Commission request) {
    return commissionService.save(request);
  }
}
