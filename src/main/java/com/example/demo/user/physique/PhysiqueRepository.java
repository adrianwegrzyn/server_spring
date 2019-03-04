package com.example.demo.user.physique;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhysiqueRepository extends JpaRepository<PhysiqueEntity,Integer> {


}
