/**
 * Public class Cake.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontroller.model;

public class Cake {

    private String flavor;
    private Double price;

    /**
     * Class Constructors
     */
    public Cake() {
    }


    public Cake(String flavor) {
        this.flavor = flavor;
    }

    public Cake(Double price) {
        this.price = price;
    }

    /**
     * Getters and Setters.
     */
    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * To String
     */
    @Override
    public String toString() {
        return "Cake{" +
                "flavor='" + flavor + '\'' +
                ", price=" + price +
                '}';
    }
}
