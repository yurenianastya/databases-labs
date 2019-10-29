package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Business;

import java.util.Set;

public interface BusinessDAO {
    Business getBusinesses();
    Set<Business> getAllBusinesses();
    boolean insertBusiness();
    boolean updateBusiness();
    boolean deleteBusiness();
}