package com.cgi.client.repository;

import com.cgi.client.entity.ClientVisit;
import com.cgi.client.entity.HealthCheckFront;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public
interface HealthCheckFrontRepository extends JpaRepository<HealthCheckFront, Long>, JpaSpecificationExecutor<HealthCheckFront> {
}

