package com.ShipmentDetails.ShipmentDetails.dao;

import com.ShipmentDetails.ShipmentDetails.entity.ShipmentDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadDao extends JpaRepository<ShipmentDetails, Long> {
}
