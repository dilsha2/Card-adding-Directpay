package lk.directpay.cardPayment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CardResponse {
    private boolean success;
    private String message;
}
