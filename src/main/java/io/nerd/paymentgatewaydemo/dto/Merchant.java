package io.nerd.paymentgatewaydemo.dto;

import java.util.ArrayList;
import java.util.Date;

public record Merchant(
        int id,
        Date created_at,
        ArrayList<String> phones,
        ArrayList<String> company_emails,
        String company_name,
        String state,
        String country,
        String city,
        String postal_code,
        String street
) {

}
