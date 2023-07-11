package lk.directpay.cardPayment.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cardNumber;
    private String cardHolderName;
    private String merchantId;
    private String currency;
    private String refCode;
    private String customerEmail;
    private String customerMobile;
    private String cardNickname;
    private boolean debug;
    private String logo;
    private String apiKey;
}