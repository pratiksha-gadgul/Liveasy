package com.ShipmentDetails.ShipmentDetails.services;
import com.ShipmentDetails.ShipmentDetails.dao.LoadDao;
import com.ShipmentDetails.ShipmentDetails.entity.ShipmentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipmentDetailsServicesImpl implements ShipmentDetailsService {

    @Autowired
    private LoadDao loadDao;

    public ShipmentDetailsServicesImpl(){
    }

    @Override
    public List<ShipmentDetails> getShipmentDetails(){
        return loadDao.findAll();
    }

    @Override
    public ShipmentDetails getShipmentDetails(Long shipperID) {
        return loadDao.getOne(shipperID);
    }

    @Override
    public ShipmentDetails addShipmentDetails(ShipmentDetails shipmentDetails) {
        loadDao.save(shipmentDetails);
        return shipmentDetails;
    }

    @Override
    public ShipmentDetails updateShipmentDetails(Long shipperId, ShipmentDetails shipmentDetails) {
        shipmentDetails.setShipperId(shipperId);
        loadDao.save(shipmentDetails);
        return shipmentDetails;
    }

    @Override
    public String deleteShipmentDetails(Long shipperId) {
        ShipmentDetails entity=loadDao.getOne(shipperId);
        loadDao.delete(entity);
        return null;
    }
}
