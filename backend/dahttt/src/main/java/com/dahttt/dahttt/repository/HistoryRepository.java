package com.dahttt.dahttt.repository;

import com.dahttt.dahttt.entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HistoryRepository extends JpaRepository<History, Integer>{

}
