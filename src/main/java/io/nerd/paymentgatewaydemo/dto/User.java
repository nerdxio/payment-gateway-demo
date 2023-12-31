package io.nerd.paymentgatewaydemo.dto;

import java.time.LocalDateTime;
import java.util.List;

public record User(
        int id,
        String username,
        String first_name,
        String last_name,
        LocalDateTime date_joined,
        String email,
        boolean is_active,
        boolean is_staff,
        boolean is_superuser,
        LocalDateTime last_login,
        List<Integer> groups,
        List<Integer> user_permissions
) {
}