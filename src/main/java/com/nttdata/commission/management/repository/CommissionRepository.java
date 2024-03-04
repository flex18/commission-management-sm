package com.nttdata.commission.management.repository;

import com.nttdata.commission.management.entity.Commission;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CommissionRepository extends ReactiveMongoRepository<Commission, String> {
}
