package hibernate.yurenia.service;

import hibernate.yurenia.dao.BusinessDAO;
import hibernate.yurenia.model.Business;

import java.util.List;

public class BusinessService {

    private BusinessDAO businessDAO = new BusinessDAO();

    public BusinessService() {
    }

    public Business findBusiness(int id) {
        return businessDAO.findByID(id);
    }

    public void saveBusiness(Business ba) {
        businessDAO.save(ba);
    }

    public void deleteBusiness(Business ba) {
        businessDAO.delete(ba);
    }

    public void updateBusiness(Business ba) {
        businessDAO.update(ba);
    }

    public List<Business> findAllBusinesses() {
        return businessDAO.findAll();
    }
}
