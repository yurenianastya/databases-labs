package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Service;

import java.util.Set;

public interface ServiceDAO {
    Service getService();
    Set<Service> getAllServices();
    boolean insertService();
    boolean updateService();
    boolean deleteService();
}