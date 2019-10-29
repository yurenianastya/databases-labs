package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.Bank;

import java.util.Set;

public interface BankDAO {
    Bank getBank();
    Set<Bank> getAllBanks();
    boolean insertBank();
    boolean updateBank();
    boolean deleteBank();
}
