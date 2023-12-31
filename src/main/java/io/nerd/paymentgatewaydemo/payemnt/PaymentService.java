package io.nerd.paymentgatewaydemo.payemnt;

import io.nerd.paymentgatewaydemo.dto.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;

@Service
public class PaymentService {
    @Value("${paymob.apiKey}")
    private String apiKey;
    @Value("${paymob.integrationId}")
    private String integrationId;
    private final RestClient restClient;

    public PaymentService(RestClient restClient) {
        this.restClient = restClient;
    }


    String pay() {
        var token = getTokens();
        var id = makePaymentOrder(token, (int) (Math.random() * 1000));
        var key = getPaymentKey(token, id);
        return STR."https://accept.paymob.com/api/acceptance/iframes/811281?payment_token=\{key}";
    }

    String getTokens() {
        var input = new TokenInput(apiKey);

        ResponseEntity<UserProfile> entity = restClient
                .post()
                .uri("/api/auth/tokens")
                .contentType(MediaType.APPLICATION_JSON)
                .body(input)
                .retrieve()
                .toEntity(UserProfile.class);
        System.out.println("token:" + entity.getBody().token());
        return entity.getBody().token();
    }

    int makePaymentOrder(String token, int merchantOrderId) {
        var input = new MakePaymentInput(
                token,
                "false",
                "400",
                "EGP",
                merchantOrderId,
                new ArrayList<>()
        );

        ResponseEntity<MakePaymentOutput> entity = restClient
                .post()
                .uri("/api/ecommerce/orders")
                .contentType(MediaType.APPLICATION_JSON)
                .body(input)
                .retrieve()
                .toEntity(MakePaymentOutput.class);

        System.out.println("orderID:" + entity.getBody().id());
        return entity.getBody().id();
    }

    String getPaymentKey(String token, int orderId) {

        var input = new GetPaymentKeyInput(
                token,
                STR."\{(int) (Math.random() * 1000)}",
                3600,
                STR."\{orderId}",
                new BillingData(
                        "803",
                        "claudette09@exa.com",
                        "42",
                        "Hasa",
                        "Claudette",
                        "2343",
                        "+86(8)9135210487",
                        "PKG",
                        "01233",
                        "Ethan Land",
                        "CR",
                        "Nicolas",
                        "Utah"
                ),
                "EGP",
                Integer.parseInt(integrationId),
                "false"
        );

        var response = restClient
                .post()
                .uri("/api/acceptance/payment_keys")
                .contentType(MediaType.APPLICATION_JSON)
                .body(input)
                .retrieve()
                .toEntity(GetPaymentKeyOutput.class);
        System.out.println("key:" + response.getBody().token());
        return response.getBody().token();
    }
}
