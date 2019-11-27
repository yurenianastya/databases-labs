package iot.spring.repository;

import iot.spring.domain.Currency;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {}
