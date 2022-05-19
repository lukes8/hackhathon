package com.cgi.client.repository;

import com.cgi.client.entity.ClientVisit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public
interface ClientVisitRepository extends JpaRepository<ClientVisit, Long>, JpaSpecificationExecutor<ClientVisit> {

    @Query
    List<ClientVisit> findAllByClientIdOrderByDateDesc(Long clientId);
}
