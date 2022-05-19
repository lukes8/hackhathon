package com.cgi.client.repository;

import com.cgi.client.entity.Health;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public
interface HealthRepository extends JpaRepository<Health, Long>, JpaSpecificationExecutor<Health> {
}

