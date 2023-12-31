package io.nerd.paymentgatewaydemo.payemnt;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("payment")
public class PaymentController {



    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping
    public String pay(Model model) {
        var url = paymentService.pay();
        model.addAttribute("url", url);
        return "payemnt";
    }

    @GetMapping("/callback")
    public String callback(Model model) {
        return "callback";
    }

}
