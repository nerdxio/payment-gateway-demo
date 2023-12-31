package io.nerd.paymentgatewaydemo.dto;

import java.util.ArrayList;

public record MakePaymentInput(
        String auth_token,
        String delivery_needed,
        String amount_cents,
        String currency,
        Integer merchant_order_id,
        ArrayList<Object> items
) {
}
