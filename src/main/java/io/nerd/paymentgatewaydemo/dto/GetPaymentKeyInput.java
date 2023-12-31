package io.nerd.paymentgatewaydemo.dto;

public record GetPaymentKeyInput(
        String auth_token,
        String amount_cents,
        Integer expiration,
        String order_id,
        BillingData billing_data,
        String currency,
        Integer integration_id,
        String lock_order_when_paid
) {
}
