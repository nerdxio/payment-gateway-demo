package io.nerd.paymentgatewaydemo.dto;

import java.util.ArrayList;
import java.util.Date;

public record MakePaymentOutput(
         int id,
         Date created_at,
         boolean delivery_needed,
         Merchant merchant,
         Object collector,
         int amount_cents,
         Object shipping_data,
         String currency,
         boolean is_payment_locked,
         boolean is_return,
         boolean is_cancel,
         boolean is_returned,
         boolean is_canceled,
         String merchant_order_id,
         Object wallet_notification,
         int paid_amount_cents,
         boolean notify_user_with_email,
         ArrayList<Object> items,
         String order_url,
         int commission_fees,
         int delivery_fees_cents,
         int delivery_vat_cents,
         String payment_method,
         Object merchant_staff_tag,
         String api_source,
         Data data,
         String token,
         String url
) {
}
