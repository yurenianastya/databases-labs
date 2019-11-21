package hibernate.yurenia.service;

import hibernate.yurenia.dao.PrivateAccountDAO;
import hibernate.yurenia.model.PrivateAccount;

import java.util.List;

public class    PrivateAccountService {

    private PrivateAccountDAO paDAO = new PrivateAccountDAO();

    public PrivateAccountService() {
    }

    public PrivateAccount findProduct(int id) {
        return paDAO.findByID(id);
    }

    public void saveProduct(PrivateAccount privateAccount) {
        paDAO.save(privateAccount);
    }

    public void deleteProduct(PrivateAccount privateAccount) {
        paDAO.delete(privateAccount);
    }

    public void updateProduct(PrivateAccount privateAccount) {
        paDAO.update(privateAccount);
    }

    public List<PrivateAccount> findAllProducts() {
        return paDAO.findAll();
    }
}
