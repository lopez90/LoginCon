package com.logicon.dto;
import javax.xml.registry.JAXRException;
import javax.xml.registry.infomodel.ClassificationScheme;
import javax.xml.registry.infomodel.PostalAddress;
import javax.xml.registry.infomodel.Slot;
import java.util.Collection;

/**
 * Created by Dom on 16.06.2016.
 */

public class Address implements PostalAddress{

    public String street;
    public String streetNumber;
    public String city;
    public String stateOrProvince;
    public String postalCode;
    public String country;
    public String type;
    public ClassificationScheme scheme;

    @Override
    public String getStreet() throws JAXRException {
        return street;
    }

    @Override
    public void setStreet(String street) throws JAXRException {
        this.street=street;

    }

    @Override
    public String getStreetNumber() throws JAXRException {
        return streetNumber;
    }

    @Override
    public void setStreetNumber(String streetNumber) throws JAXRException {
        this.streetNumber=streetNumber;

    }

    @Override
    public String getCity() throws JAXRException {
        return city;
    }

    @Override
    public void setCity(String city) throws JAXRException {
        this.city=city;
    }

    @Override
    public String getStateOrProvince() throws JAXRException {
        return stateOrProvince;
    }

    @Override
    public void setStateOrProvince(String stateOrProvince) throws JAXRException {
        this.stateOrProvince=stateOrProvince;
    }

    @Override
    public String getPostalCode() throws JAXRException {
        return postalCode;
    }

    @Override
    public void setPostalCode(String postalCode) throws JAXRException {
        this.postalCode=postalCode;
    }

    @Override
    public String getCountry() throws JAXRException {
        return country;
    }

    @Override
    public void setCountry(String country) throws JAXRException {
        this.country=country;
    }

    @Override
    public String getType() throws JAXRException {
        return type;
    }

    @Override
    public void setType(String type) throws JAXRException {
        this.type=type;
    }

    @Override
    public void setPostalScheme(ClassificationScheme scheme) throws JAXRException {
        this.scheme=scheme;
    }

    @Override
    public ClassificationScheme getPostalScheme() throws JAXRException {
        return scheme;
    }

    @Override
    public void addSlot(Slot slot) throws JAXRException {

    }

    @Override
    public void addSlots(Collection slots) throws JAXRException {

    }

    @Override
    public void removeSlot(String slotName) throws JAXRException {

    }

    @Override
    public void removeSlots(Collection slotNames) throws JAXRException {

    }

    @Override
    public Slot getSlot(String slotName) throws JAXRException {
        return null;
    }

    @Override
    public Collection getSlots() throws JAXRException {
        return null;
    }
}
