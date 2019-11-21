package hibernate.yurenia.service;

import hibernate.yurenia.dao.ServiceDAO;
import hibernate.yurenia.model.Service;

import java.util.List;

public class ServiceService {

    private ServiceDAO serviceDAO = new ServiceDAO();

    public ServiceService() {
    }

    public Service findCustomer(int id) {
        return serviceDAO.findByID(id);
    }

    public void saveCustomer(Service service) {
        serviceDAO.save(service);
    }

    public void deleteCustomer(Service service) {
        serviceDAO.delete(service);
    }

    public void updateCustomer(Service service) {
        serviceDAO.update(service);
    }

    public List<Service> findAllCurrencies() {
        return serviceDAO.findAll();
    }
}
