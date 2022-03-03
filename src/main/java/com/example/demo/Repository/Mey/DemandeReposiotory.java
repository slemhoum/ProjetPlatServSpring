package com.example.demo.Repository.Mey;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entities.Demande;

public interface DemandeReposiotory  extends JpaRepository<Demande, Long>{
 @Query("select d from Demande d where d.status=:x order by d.date_creation desc")
 public List<Demande>dstatus(@Param("x")String status);
}
