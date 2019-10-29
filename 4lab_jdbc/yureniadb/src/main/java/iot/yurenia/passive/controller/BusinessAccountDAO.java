package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.BusinessAccount;

import java.util.Set;

public interface BusinessAccountDAO {
    BusinessAccount getBA();
    Set<BusinessAccount> getAllBusinessAccounts();
    boolean insertBA();
    boolean updateBA();
    boolean deleteBA();
}