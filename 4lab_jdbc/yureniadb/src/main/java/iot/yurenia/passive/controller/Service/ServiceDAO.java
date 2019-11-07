package iot.yurenia.passive.controller.Service;

import iot.yurenia.passive.model.Service;

import java.util.Set;

public interface ServiceDAO {
    Service getService(int id);
    Set<Service> getAllServices();
    boolean insertService(Service service);
    boolean updateService(Service service);
    boolean deleteService(int id);
}