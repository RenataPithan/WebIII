/**
 * Hello World and general Controller.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontroller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pithan.renata.helloworldrestcontroller.model.Cake;
import pithan.renata.helloworldrestcontroller.model.Candy;

import java.util.ArrayList;

@RestController
public class HelloWorldController {

    /**
     * show messages on "index".
     */
    @GetMapping("/")
    public String Index() {
        return "Hello World!";
    }

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

    /**
     * show messages on "index".
     */
    @GetMapping("/cakes")
    public String getCake() {
        return "Cakes!";
    }

    /**
     * show all array itens.
     */
    @GetMapping("/allcakes")
    public ArrayList<Cake> getCakes() {
        Cake cake1 = new Cake();
        cake1.setFlavor("Chocolate");
        cake1.setPrice(35.20);

        Cake cake2 = new Cake();
        cake2.setFlavor("Vanilla");
        cake2.setPrice(3.50);

        Cake cake3 = new Cake();
        cake3.setFlavor("Red Velvet");
        cake3.setPrice(42.80);

        ArrayList<Cake> cakes = new ArrayList<>();
        cakes.add(cake1);
        cakes.add(cake2);
        cakes.add(cake3);
        return cakes;
    }
}