package com.ShipmentDetails.ShipmentDetails.controller;

import java.util.List;

import com.ShipmentDetails.ShipmentDetails.entity.ShipmentDetails;
import com.ShipmentDetails.ShipmentDetails.services.ShipmentDetailsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoadController {

    @Autowired
    private ShipmentDetailsService shipmentdetailsservice;


    //get the shipment details
    @GetMapping("/load")
    public List<ShipmentDetails> getShipmentdetails(){
        return this.shipmentdetailsservice.getShipmentDetails();
    }

    @GetMapping("/load/{shipperId}")
    public ShipmentDetails getShipmentDetails(@PathVariable Long shipperId){
        return this.shipmentdetailsservice.getShipmentDetails(shipperId);
    }

    @PostMapping("/load")
    public String addShipmentdetails(@RequestBody ShipmentDetails shipmentDetails) {
        ShipmentDetails addedShipmentDetails = this.shipmentdetailsservice.addShipmentDetails(shipmentDetails);
        if(addedShipmentDetails != null){
            return "Loads details added successfully";
        }else{
            return "Error in Added Loads Details";
        }
    }

    @PutMapping("/load/{shipperId}")
    public ShipmentDetails updateShipmentDetails(@PathVariable Long shipperId, @RequestBody ShipmentDetails shipmentDetails){
        return shipmentdetailsservice.updateShipmentDetails(shipperId,shipmentDetails);
    }

    @DeleteMapping("/load/{shipperId}")
    public String deleteShipmentDetails(@PathVariable Long shipperId){
        return shipmentdetailsservice.deleteShipmentDetails(shipperId);
    }
}
