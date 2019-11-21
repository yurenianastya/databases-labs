package hibernate.yurenia.service;

import hibernate.yurenia.dao.BankDAO;
import hibernate.yurenia.model.Bank;

import java.util.List;

public class BankService {

    private BankDAO bankDAO = new BankDAO();

    public BankService() {
    }

    public Bank findBank(int id) {
        return bankDAO.findByID(id);
    }

    public void saveBank(Bank bank) {
        bankDAO.save(bank);
    }

    public void deleteBank(int id) {
        bankDAO.delete(id);
    }

    public void updateBank(Bank bank) {
        bankDAO.update(bank);
    }

    public List<Bank> findAllBanks() {
        return bankDAO.findAll();
    }
}
