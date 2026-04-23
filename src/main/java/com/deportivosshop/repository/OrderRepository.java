package com.deportivosshop.repository;

import com.deportivosshop.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    Optional<Order> findByOrderNumber(String orderNumber);

    Page<Order> findByUserId(Integer userId, Pageable pageable);

    Page<Order> findByStatus(String status, Pageable pageable);

    Page<Order> findByCreatedAtBetween(LocalDateTime from, LocalDateTime to, Pageable pageable);

    @Query("SELECT o FROM Order o WHERE " +
           "(:userId IS NULL OR o.user.id = :userId) AND " +
           "(:status IS NULL OR o.status = :status)")
    Page<Order> findWithFilters(
            @Param("userId") Integer userId,
            @Param("status") String status,
            Pageable pageable);

    boolean existsByOrderNumber(String orderNumber);
}
