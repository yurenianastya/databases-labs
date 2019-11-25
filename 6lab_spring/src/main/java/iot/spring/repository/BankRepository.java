package iot.spring.repository;

import iot.spring.domain.Bank;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BankRepository extends JpaRepository<Bank, Integer> {}
