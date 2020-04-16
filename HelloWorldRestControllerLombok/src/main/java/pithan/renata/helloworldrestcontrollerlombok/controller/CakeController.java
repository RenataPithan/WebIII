/**
 * Cake Controller.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontrollerlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import pithan.renata.helloworldrestcontrollerlombok.model.Cake;

import java.util.ArrayList;

public class CakeController {

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
