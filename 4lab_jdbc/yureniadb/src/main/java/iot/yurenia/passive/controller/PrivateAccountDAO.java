package iot.yurenia.passive.controller;

import iot.yurenia.passive.model.PrivateAccount;

import java.util.Set;

public interface PrivateAccountDAO {
    PrivateAccount getPA();
    Set<PrivateAccount> getAllPA();
    boolean insertPA();
    boolean updatePA();
    boolean deletePA();
}