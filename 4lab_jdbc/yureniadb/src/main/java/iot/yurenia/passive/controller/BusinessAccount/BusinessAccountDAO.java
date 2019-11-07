package iot.yurenia.passive.controller.BusinessAccount;

import iot.yurenia.passive.model.BusinessAccount;

import java.util.Set;

public interface BusinessAccountDAO {
    BusinessAccount getBA(int id);
    Set<BusinessAccount> getAllBusinessAccounts();
    boolean insertBA(BusinessAccount ba);
    boolean updateBA(BusinessAccount ba);
    boolean deleteBA(int id);
}