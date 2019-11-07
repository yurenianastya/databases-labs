package iot.yurenia.passive.controller.PrivateAccount;

import iot.yurenia.passive.model.PrivateAccount;

import java.util.Set;

public interface PrivateAccountDAO {
    PrivateAccount getPA(int id);
    Set<PrivateAccount> getAllPA();
    boolean insertPA(PrivateAccount pa);
    boolean updatePA(PrivateAccount pa);
    boolean deletePA(int id);
}