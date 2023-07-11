package lk.directpay.cardPayment.controller;

import lk.directpay.cardPayment.model.CardAddRequest;
import lk.directpay.cardPayment.model.CardResponse;
import lk.directpay.cardPayment.service.CardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequiredArgsConstructor
public class CardController {

    private final CardService cardService;

    @GetMapping("/card/add")
    public ResponseEntity<CardResponse> addCard(@RequestBody CardAddRequest request) {
        try {
            cardService.addCard(request);
            CardResponse response = new CardResponse(true, "Card added successfully.");
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            CardResponse response = new CardResponse(false, "Failed to add card: " + e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
        }
    }

    @GetMapping("/card/ui")
    public String getCardUI(Model model) {
        model.addAttribute("merchantId", "EC02095");
        model.addAttribute("currency", "LKR");
        model.addAttribute("refCode", "1566895327605");
        model.addAttribute("customerEmail", "abc@mail.com");
        model.addAttribute("customerMobile", "+94712584756");
        model.addAttribute("cardNickname", "My Card");
        model.addAttribute("debug", true);
        model.addAttribute("logo", "https://www.roarafrica.com/wp-content/uploads/2017/11/sample-logo.png");
        model.addAttribute("apiKey", "O8rYWgfOE5j6xsRzZPj0lvpQokhcsgYN");

        return "card_ui";
    }
}
