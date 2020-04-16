/**
 * Public class Candy.
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
public class Candy {

    /**
     * Lombok Getters and Setters
     */
    @Getter @Setter
    private String name;
    @Getter @Setter
    private double price;
}
