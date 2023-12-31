package io.nerd.paymentgatewaydemo.dto;

public record BillingData(
        String apartment,
        String email,
        String floor,
        String first_name,
        String street,
        String building,
        String phone_number,
        String shipping_method,
        String postal_code,
        String city,
        String country,
        String last_name,
        String state
) {
}
