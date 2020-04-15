/**
 * Public class Candy.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontroller.model;

public class Candy {

    private String name;
    private double price;

    /**
     * Class Constructors
     */
    public Candy() {
    }

    public Candy(String name) {
        this.name = name;
    }

    public Candy(double price) {
        this.price = price;
    }

    /**
     * Getters and Setters.
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * To String
     */
    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
