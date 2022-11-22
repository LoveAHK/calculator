package com.example.calculator.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
//test commit
@Controller
public class CalcController {
    @GetMapping("/")
    public String greeting(Model model) {

        return "Main";
    }
    @PostMapping("/res")
    public String PostRes(@RequestParam(value = "a",  required = false, defaultValue = "1")
                              String a,@RequestParam(value = "Znak",  required = false, defaultValue = "2")
    String b,@RequestParam(value = "b",  required = false, defaultValue = "3")
    String c, Model model) {
        double itog;
        String Resault = "Что-то пошло не так";
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("resultat", Resault);
        }
        return "Main";
    }
    @GetMapping("/Main")
    public String GetRes(@RequestParam(value = "a")
                             String a,@RequestParam(value = "Znak")
    String b,@RequestParam(value = "b")
    String c, Model model) {
        double itog;
        String Resault = "Вы не выбрали значения";
        try {
            if (b.equals("+")) {
                itog = Double.parseDouble(a) + Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("-")) {
                itog = Double.parseDouble(a) - Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("*")) {
                itog = Double.parseDouble(a) * Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
            if (b.equals("/") && !c.equals("0")) {
                itog = Double.parseDouble(a) / Double.parseDouble(c);
                model.addAttribute("resultat", itog);
            }
        } catch (NumberFormatException e) {
            model.addAttribute("resultat", Resault);
        }
        return "Main";
    }
}


