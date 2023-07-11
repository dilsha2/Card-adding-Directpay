package lk.directpay.cardPayment.service;

import lk.directpay.cardPayment.entities.Card;
import lk.directpay.cardPayment.entities.Currency;
import lk.directpay.cardPayment.model.CardAddRequest;
import lk.directpay.cardPayment.repositories.CardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardService {

    private final CardRepository cardRepository;


    public void addCard(CardAddRequest request) {

        Card card = new Card();

        card.setMerchantId(request.getMerchantId());
        card.setCurrency(Currency.LKR.name());;
        card.setRefCode(request.getRefCode());
        card.setCustomerEmail(request.getCustomerEmail());
        card.setCustomerMobile(request.getCustomerMobile());
        card.setCardNickname(request.getCardNickname());
        card.setDebug(request.isDebug());
        card.setLogo(request.getLogo());
        card.setApiKey(request.getApiKey());

        cardRepository.save(card);
    }
}
