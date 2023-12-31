package io.nerd.paymentgatewaydemo;

import io.nerd.paymentgatewaydemo.dto.TokenInput;
import io.nerd.paymentgatewaydemo.dto.UserProfile;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaymentGatewayDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentGatewayDemoApplication.class, args);
    }

    @Bean
    RestClient restClient(RestClient.Builder builder) {
        return builder
                .baseUrl("https://accept.paymob.com")
                .build();
    }

//
//    @Bean
//    ApplicationRunner applicationRunner(RestClient restClient){
//        return args -> {
//            var input = new TokenInput("ZXlKaGJHY2lPaUpJVXpVeE1pSXNJblI1Y0NJNklrcFhWQ0o5LmV5SmpiR0Z6Y3lJNklrMWxjbU5vWVc1MElpd2ljSEp2Wm1sc1pWOXdheUk2T1RRNE56YzRMQ0p1WVcxbElqb2lhVzVwZEdsaGJDSjkuX0FYUjQ1UURGQzdWS0thNzVPd2JXMHVobHJaU3ZvSW1KdE1wclp5Nkd6c1VUWWhtODRWanExTTZWOTdFVGdCRm9ya3lhOXBfeGxHdlNXMW9iUFhibkE=");
//
//            ResponseEntity<UserProfile> entity = restClient
//                    .post()
//                    .uri("/api/auth/tokens")
//                    .contentType(MediaType.APPLICATION_JSON)
//                    .body(input)
//                    .retrieve()
//                    .toEntity(UserProfile.class);
//        };
//    }

}
