package com.apirbb.parkingcontrol.repositories;

import com.apirbb.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {
   /* boolean existsByLicencePlateCar(String licencePlateCar);

    boolean existsByLicencePlateCar(String )

    boolean existsByParkingSporNumber(String parkingSporNumber);

   boolean existsByByApartamentAndBlock(String apartment, String block);*/
}
