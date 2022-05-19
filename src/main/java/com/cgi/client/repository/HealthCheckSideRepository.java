package com.cgi.client.repository;

import com.cgi.client.entity.HealthCheckSide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public
interface HealthCheckSideRepository extends JpaRepository<HealthCheckSide, Long>, JpaSpecificationExecutor<HealthCheckSide> {
}

