package com.example.demo.repository;

import com.example.demo.models.DbResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NBPRepository extends JpaRepository<DbResponse, Long> {

}