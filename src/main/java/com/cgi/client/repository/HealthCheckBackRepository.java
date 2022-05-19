package com.cgi.client.repository;

import com.cgi.client.entity.HealthCheckBack;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public
interface HealthCheckBackRepository extends JpaRepository<HealthCheckBack, Long>, JpaSpecificationExecutor<HealthCheckBack> {
}

