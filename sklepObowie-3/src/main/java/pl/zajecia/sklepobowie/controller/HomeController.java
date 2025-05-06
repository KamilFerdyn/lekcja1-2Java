package pl.zajecia.sklepobowie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pl.zajecia.sklepobowie.model.Item;

@Controller
public class HomeController {
    static List<Item> items=new ArrayList<>();

    static {
        items.add(new Item("Ołówek", new BigDecimal("10.50"),
                "https://www.fabrykagadzetow.com.pl/userdata/public/gfx/fa342ac5b2ebcfd38825a3acb2ab7304.jpg"));
        items.add(  new Item("Długopis", new BigDecimal("40.50"),
                "https://wkdzik.pl/userdata/public/gfx/21499/dlugopis-czarny-1.jpg"));
        items.add( new Item("Pióro", new BigDecimal("75.50"),
                "https://biuronimo.pl/10277-thickbox_default/pioro-wieczne-waterman-expert-czarny-gt.jpg"));
    }
    @GetMapping("/")
// @ResponseBody
    public String home(Model model) {
        model.addAttribute("items",items);
    /* model.addAttribute("item",new Item("Ołówek", new BigDecimal("1.50"),
             "https://www.fabrykagadzetow.com.pl/userdata/public/gfx/fa342ac5b2ebcfd38825a3acb2ab7304.jpg"));*/
        return "home";
        //return new Item("Ołówek", new BigDecimal("1.50"),"https://www.fabrykagadzetow.com.pl/userdata/public/gfx/fa342ac5b2ebcfd38825a3acb2ab7304.jpg") ;
    }


}
