package lk.directpay.cardPayment.repositories;

import lk.directpay.cardPayment.entities.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {

}
