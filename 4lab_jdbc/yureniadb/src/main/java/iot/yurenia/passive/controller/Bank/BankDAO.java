package iot.yurenia.passive.controller.Bank;

import iot.yurenia.passive.model.Bank;

import java.util.Set;

public interface BankDAO {
    Bank getBank(int id);
    Set<Bank> getAllBanks();
    boolean insertBank(Bank bank);
    boolean updateBank(Bank bank);
    boolean deleteBank(int id);
}
