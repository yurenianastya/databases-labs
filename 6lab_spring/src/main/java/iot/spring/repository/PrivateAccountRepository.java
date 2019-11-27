package iot.spring.repository;

import iot.spring.domain.PrivateAccount;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PrivateAccountRepository extends JpaRepository<PrivateAccount, Integer> {}
