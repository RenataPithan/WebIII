/**
 * Candy Controller.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontrollerlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import pithan.renata.helloworldrestcontrollerlombok.model.Candy;

import java.util.ArrayList;

public class CandyController {

    /**
     * show messages on "index".
     */
    @GetMapping("/candy")
    public Candy getCandy() {
        Candy candy = new Candy();
        candy.setName("Sweets!");

        return candy;
    }

    /**
     * show all array itens.
     */
    @GetMapping("/allsweets")
    public ArrayList<Candy> getSweets() {
        Candy candy1 = new Candy();
        candy1.setName("Kinder Bars");
        candy1.setPrice(2.50);

        Candy candy2 = new Candy();
        candy2.setName("M&M's");
        candy2.setPrice(1.30);

        Candy candy3 = new Candy();
        candy3.setName("Twix Bars");
        candy3.setPrice(3.00);

        Candy candy4 = new Candy();
        candy3.setName("Mentos");
        candy3.setPrice(1.00);

        ArrayList<Candy> sweets = new ArrayList<>();
        sweets.add(candy1);
        sweets.add(candy2);
        sweets.add(candy3);
        sweets.add(candy4);
        return sweets;
    }
}
