package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NumberController {

    @GetMapping("/")
    public String getNumber(Model model) {
        String usd = "USD";
        String rub = "RUB";
        CurrencyAPI currencyAPI = new CurrencyAPI();
        double currencyUSD = currencyAPI.getCurrencyByName(usd);
        double currencyRUB = currencyAPI.getCurrencyByName(rub);
        model.addAttribute("usd", usd);
        model.addAttribute("currencyUSD", currencyUSD);
        model.addAttribute("currencyRUB", currencyRUB);
        return "index";
    }
}