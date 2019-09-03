package com.manalastas.exercises.angular.bikeRegistrationService.repository;

import com.manalastas.exercises.angular.bikeRegistrationService.model.Bike;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends CrudRepository<Bike, Long> {
}