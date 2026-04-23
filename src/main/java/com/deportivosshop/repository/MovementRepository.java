package com.deportivosshop.repository;

import com.deportivosshop.model.Movement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface MovementRepository extends JpaRepository<Movement, Integer> {

    Page<Movement> findByProductId(Integer productId, Pageable pageable);

    Page<Movement> findByMovementType(String movementType, Pageable pageable);

    Page<Movement> findByCreatedAtBetween(LocalDateTime from, LocalDateTime to, Pageable pageable);

    @Query("SELECT m FROM Movement m WHERE " +
           "(:productId IS NULL OR m.product.id = :productId) AND " +
           "(:movementType IS NULL OR m.movementType = :movementType)")
    Page<Movement> findWithFilters(
            @Param("productId") Integer productId,
            @Param("movementType") String movementType,
            Pageable pageable);
}
