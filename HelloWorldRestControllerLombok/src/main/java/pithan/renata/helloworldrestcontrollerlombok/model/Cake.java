/**
 * Public class Cake.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontrollerlombok.model;

import lombok.*;

/**
 * Lombok ToString
 */
@ToString

/**
 * Lombok Class Constructors
 */
@NoArgsConstructor
@AllArgsConstructor
public class Cake {

    /**
     * Lombok Getters and Setters
     */
    @Getter @Setter
    private String flavor;
    @Getter @Setter
    private double price;
}
