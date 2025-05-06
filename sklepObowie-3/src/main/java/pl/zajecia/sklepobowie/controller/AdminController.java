package pl.zajecia.sklepobowie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import pl.zajecia.sklepobowie.model.Item;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private List<Item> items = new ArrayList<>();

    @GetMapping
    public String adminPage() {
        return "adminview/addItem";
    }

//    @PostMapping("/add")
//    public String addItem(@RequestParam String name, @RequestParam BigDecimal price, @RequestParam(required = false) String imgUrl) {
//
//        HomeController.items.
//        items.add(newItem);
//
//        return "redirect:/admin";
//    }

    @PostMapping("/add")
    public String addItem(Item item) {
       // items.add(new Item(name, price, imgUrl));
        HomeController.items.add(item);
        return "redirect:/";
    }
}
