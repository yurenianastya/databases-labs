package iot.yurenia.passive.controller.Business;

import iot.yurenia.passive.model.Business;

import java.util.Set;

public interface BusinessDAO {
    Business getBusinesses(int id);
    Set<Business> getAllBusinesses();
    boolean insertBusiness(Business business);
    boolean updateBusiness(Business business);
    boolean deleteBusiness(int id);
}