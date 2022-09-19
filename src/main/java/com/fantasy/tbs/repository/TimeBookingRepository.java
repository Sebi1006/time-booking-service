package com.fantasy.tbs.repository;

import com.fantasy.tbs.domain.TimeBooking;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data SQL repository for the TimeBooking entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TimeBookingRepository extends JpaRepository<TimeBooking, Long> {

    @Query(value = "select working_hours from time_booking where personal_number = :number", nativeQuery = true)
    List<Double> findByPersonalNumber(@Param("number") String personalNumber);

}
