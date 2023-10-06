package com.ShipmentDetails.ShipmentDetails.services;

import com.ShipmentDetails.ShipmentDetails.entity.ShipmentDetails;

import java.util.List;

public interface ShipmentDetailsService {

    List<ShipmentDetails> getShipmentDetails();

    ShipmentDetails getShipmentDetails(Long shipperID);

    ShipmentDetails addShipmentDetails(ShipmentDetails shipmentDetails);

    ShipmentDetails updateShipmentDetails(Long shipperId, ShipmentDetails shipmentDetails);

    String deleteShipmentDetails(Long shipperId);
}
