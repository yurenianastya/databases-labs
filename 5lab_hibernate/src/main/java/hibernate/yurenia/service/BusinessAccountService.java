package hibernate.yurenia.service;

import hibernate.yurenia.dao.BusinessAccountDAO;
import hibernate.yurenia.model.BusinessAccount;

import java.util.List;

public class BusinessAccountService {

    private BusinessAccountDAO baDAO = new BusinessAccountDAO();

    public BusinessAccountService() {
    }

    public BusinessAccount findBA(int id) {
        return baDAO.findByID(id);
    }

    public void saveBA(BusinessAccount ba) {
        baDAO.save(ba);
    }

    public void deleteBA(BusinessAccount ba) {
        baDAO.delete(ba);
    }

    public void updateBA(BusinessAccount ba) {
        baDAO.update(ba);
    }

    public List<BusinessAccount> findAllBA() {
        return baDAO.findAll();
    }
}
