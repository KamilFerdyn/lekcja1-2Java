package pl.zajecia.sklepobowie.model;
import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
//@AllArgsConstructor
@Getter
@Setter


public class Item {
    private String name;
    private BigDecimal price;
    private String imgUrl;

    public Item(String name, BigDecimal price, String imgURL) {
        this.name = name;
        this.price = price;
        this.imgUrl = imgURL;
    }

}
