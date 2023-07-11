package lk.directpay.cardPayment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CardAddRequest {

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
