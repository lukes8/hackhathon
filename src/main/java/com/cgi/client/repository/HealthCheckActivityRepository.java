package com.cgi.client.repository;

import com.cgi.client.entity.HealthCheckActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public
interface HealthCheckActivityRepository extends JpaRepository<HealthCheckActivity, Long>, JpaSpecificationExecutor<HealthCheckActivity> {
}

