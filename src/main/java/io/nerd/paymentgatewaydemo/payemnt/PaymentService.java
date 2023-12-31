package io.nerd.paymentgatewaydemo.payemnt;

import io.nerd.paymentgatewaydemo.dto.*;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.ArrayList;
import java.util.Random;

@Service
public class PaymentService {

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
        var input = new TokenInput("ZXlKaGJHY2lPaUpJVXpVeE1pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SmpiR0Z6Y3lJNklrMWxjbU5vWVc1MElpd2ljSEp2Wm1sc1pWOXdheUk2T1RRNE56YzRMQ0p1WVcxbElqb2lhVzVwZEdsaGJDSjkuX0FYUjQ1UURGQzdWS0thNzVPd2JXMHVobHJaU3ZvSW1KdE1wclp5Nkd6c1VUWWhtODRWanExTTZWOTdFVGdCRm9ya3lhOXBfeGxHdlNXMW9iUFhibkE=");

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
                "400",
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
                4423527,
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
