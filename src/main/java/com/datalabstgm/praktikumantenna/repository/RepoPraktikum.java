package com.datalabstgm.praktikumantenna.repository;

import com.datalabstgm.praktikumantenna.model.entity.EntityPraktikum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoPraktikum extends JpaRepository<EntityPraktikum, Long> {
}
