package io.nerd.paymentgatewaydemo.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Profile{
    public int id;
    public User user;
    public Date created_at;
    public boolean active;
    public String profile_type;
    public ArrayList<String> phones;
    public ArrayList<String> company_emails;
    public String company_name;
    public String state;
    public String country;
    public String city;
    public String postal_code;
    public String street;
    public boolean email_notification;
    public Object order_retrieval_endpoint;
    public Object delivery_update_endpoint;
    public Object logo_url;
    public boolean is_mobadra;
    public String sector;
    public boolean is_2fa_enabled;
    public int activation_method;
    public int signed_up_through;
    public int failed_attempts;
    public ArrayList<Object> custom_export_columns;
    public ArrayList<Object> server_IP;
    public Object username;
    public String primary_phone_number;
    public boolean primary_phone_verified;
    public boolean is_temp_password;
    public Object otp_2fa_sent_at;
    public Object otp_2fa_attempt;
    public Date otp_sent_at;
    public String otp_sent_to;
    public Date otp_validated_at;
    public Object awb_banner;
    public Object email_banner;
    public Object identification_number;
    public String delivery_status_callback;
    public Object merchant_external_link;
    public int merchant_status;
    public boolean deactivated_by_bank;
    public Object bank_deactivation_reason;
    public int bank_merchant_status;
    public Object national_id;
    public Object super_agent;
    public Object wallet_limit_profile;
    public Object address;
    public Object commercial_registration;
    public Object commercial_registration_area;
    public Object distributor_code;
    public Object distributor_branch_code;
    public boolean allow_terminal_order_id;
    public boolean allow_encryption_bypass;
    public Object wallet_phone_number;
    public int suspicious;
    public Object latitude;
    public Object longitude;
    public BankStaffs bank_staffs;
    public Object bank_rejection_reason;
    public boolean bank_received_documents;
    public int bank_merchant_digital_status;
    public Object bank_digital_rejection_reason;
    public boolean filled_business_data;
    public String day_start_time;
    public Object day_end_time;
    public boolean withhold_transfers;
    public String sms_sender_name;
    public Object withhold_transfers_reason;
    public Object withhold_transfers_notes;
    public boolean can_bill_deposit_with_card;
    public boolean can_topup_merchants;
    public Object topup_transfer_id;
    public boolean referral_eligible;
    public boolean is_eligible_to_be_ranger;
    public boolean is_ranger;
    public boolean is_poaching;
    public boolean paymob_app_merchant;
    public Object settlement_frequency;
    public Object day_of_the_week;
    public Object day_of_the_month;
    public boolean allow_transaction_notifications;
    public boolean allow_transfer_notifications;
    public double sallefny_amount_whole;
    public double sallefny_fees_whole;
    public Object paymob_app_first_login;
    public Object paymob_app_last_activity;
    public boolean payout_enabled;
    public boolean payout_terms;
    public boolean is_bills_new;
    public boolean can_process_multiple_refunds;
    public int settlement_classification;
    public boolean instant_settlement_enabled;
    public boolean instant_settlement_transaction_otp_verified;
    public Object preferred_language;
    public boolean ignore_flash_callbacks;
    public Object acq_partner;
    public Object dom;
    public Object bank_related;
    public ArrayList<Object> permissions;


    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public boolean isActive() {
        return active;
    }

    public String getProfile_type() {
        return profile_type;
    }

    public ArrayList<String> getPhones() {
        return phones;
    }

    public ArrayList<String> getCompany_emails() {
        return company_emails;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public String getStreet() {
        return street;
    }

    public boolean isEmail_notification() {
        return email_notification;
    }

    public Object getOrder_retrieval_endpoint() {
        return order_retrieval_endpoint;
    }

    public Object getDelivery_update_endpoint() {
        return delivery_update_endpoint;
    }

    public Object getLogo_url() {
        return logo_url;
    }

    public boolean isIs_mobadra() {
        return is_mobadra;
    }

    public String getSector() {
        return sector;
    }

    public boolean isIs_2fa_enabled() {
        return is_2fa_enabled;
    }

    public int getActivation_method() {
        return activation_method;
    }

    public int getSigned_up_through() {
        return signed_up_through;
    }

    public int getFailed_attempts() {
        return failed_attempts;
    }

    public ArrayList<Object> getCustom_export_columns() {
        return custom_export_columns;
    }

    public ArrayList<Object> getServer_IP() {
        return server_IP;
    }

    public Object getUsername() {
        return username;
    }

    public String getPrimary_phone_number() {
        return primary_phone_number;
    }

    public boolean isPrimary_phone_verified() {
        return primary_phone_verified;
    }

    public boolean isIs_temp_password() {
        return is_temp_password;
    }

    public Object getOtp_2fa_sent_at() {
        return otp_2fa_sent_at;
    }

    public Object getOtp_2fa_attempt() {
        return otp_2fa_attempt;
    }

    public Date getOtp_sent_at() {
        return otp_sent_at;
    }

    public String getOtp_sent_to() {
        return otp_sent_to;
    }

    public Date getOtp_validated_at() {
        return otp_validated_at;
    }

    public Object getAwb_banner() {
        return awb_banner;
    }

    public Object getEmail_banner() {
        return email_banner;
    }

    public Object getIdentification_number() {
        return identification_number;
    }

    public String getDelivery_status_callback() {
        return delivery_status_callback;
    }

    public Object getMerchant_external_link() {
        return merchant_external_link;
    }

    public int getMerchant_status() {
        return merchant_status;
    }

    public boolean isDeactivated_by_bank() {
        return deactivated_by_bank;
    }

    public Object getBank_deactivation_reason() {
        return bank_deactivation_reason;
    }

    public int getBank_merchant_status() {
        return bank_merchant_status;
    }

    public Object getNational_id() {
        return national_id;
    }

    public Object getSuper_agent() {
        return super_agent;
    }

    public Object getWallet_limit_profile() {
        return wallet_limit_profile;
    }

    public Object getAddress() {
        return address;
    }

    public Object getCommercial_registration() {
        return commercial_registration;
    }

    public Object getCommercial_registration_area() {
        return commercial_registration_area;
    }

    public Object getDistributor_code() {
        return distributor_code;
    }

    public Object getDistributor_branch_code() {
        return distributor_branch_code;
    }

    public boolean isAllow_terminal_order_id() {
        return allow_terminal_order_id;
    }

    public boolean isAllow_encryption_bypass() {
        return allow_encryption_bypass;
    }

    public Object getWallet_phone_number() {
        return wallet_phone_number;
    }

    public int getSuspicious() {
        return suspicious;
    }

    public Object getLatitude() {
        return latitude;
    }

    public Object getLongitude() {
        return longitude;
    }

    public BankStaffs getBank_staffs() {
        return bank_staffs;
    }

    public Object getBank_rejection_reason() {
        return bank_rejection_reason;
    }

    public boolean isBank_received_documents() {
        return bank_received_documents;
    }

    public int getBank_merchant_digital_status() {
        return bank_merchant_digital_status;
    }

    public Object getBank_digital_rejection_reason() {
        return bank_digital_rejection_reason;
    }

    public boolean isFilled_business_data() {
        return filled_business_data;
    }

    public String getDay_start_time() {
        return day_start_time;
    }

    public Object getDay_end_time() {
        return day_end_time;
    }

    public boolean isWithhold_transfers() {
        return withhold_transfers;
    }

    public String getSms_sender_name() {
        return sms_sender_name;
    }

    public Object getWithhold_transfers_reason() {
        return withhold_transfers_reason;
    }

    public Object getWithhold_transfers_notes() {
        return withhold_transfers_notes;
    }

    public boolean isCan_bill_deposit_with_card() {
        return can_bill_deposit_with_card;
    }

    public boolean isCan_topup_merchants() {
        return can_topup_merchants;
    }

    public Object getTopup_transfer_id() {
        return topup_transfer_id;
    }

    public boolean isReferral_eligible() {
        return referral_eligible;
    }

    public boolean isIs_eligible_to_be_ranger() {
        return is_eligible_to_be_ranger;
    }

    public boolean isIs_ranger() {
        return is_ranger;
    }

    public boolean isIs_poaching() {
        return is_poaching;
    }

    public boolean isPaymob_app_merchant() {
        return paymob_app_merchant;
    }

    public Object getSettlement_frequency() {
        return settlement_frequency;
    }

    public Object getDay_of_the_week() {
        return day_of_the_week;
    }

    public Object getDay_of_the_month() {
        return day_of_the_month;
    }

    public boolean isAllow_transaction_notifications() {
        return allow_transaction_notifications;
    }

    public boolean isAllow_transfer_notifications() {
        return allow_transfer_notifications;
    }

    public double getSallefny_amount_whole() {
        return sallefny_amount_whole;
    }

    public double getSallefny_fees_whole() {
        return sallefny_fees_whole;
    }

    public Object getPaymob_app_first_login() {
        return paymob_app_first_login;
    }

    public Object getPaymob_app_last_activity() {
        return paymob_app_last_activity;
    }

    public boolean isPayout_enabled() {
        return payout_enabled;
    }

    public boolean isPayout_terms() {
        return payout_terms;
    }

    public boolean isIs_bills_new() {
        return is_bills_new;
    }

    public boolean isCan_process_multiple_refunds() {
        return can_process_multiple_refunds;
    }

    public int getSettlement_classification() {
        return settlement_classification;
    }

    public boolean isInstant_settlement_enabled() {
        return instant_settlement_enabled;
    }

    public boolean isInstant_settlement_transaction_otp_verified() {
        return instant_settlement_transaction_otp_verified;
    }

    public Object getPreferred_language() {
        return preferred_language;
    }

    public boolean isIgnore_flash_callbacks() {
        return ignore_flash_callbacks;
    }

    public Object getAcq_partner() {
        return acq_partner;
    }

    public Object getDom() {
        return dom;
    }

    public Object getBank_related() {
        return bank_related;
    }

    public ArrayList<Object> getPermissions() {
        return permissions;
    }
}