package io.nerd.paymentgatewaydemo.dto;

public record UserProfile(
        Profile profile,
        String token
) {
}
