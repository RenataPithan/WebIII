/**
 * Public class Client, with lombok.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemplopostconstructpredestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String name;

    public Client(){
        System.out.println("Client Class");
    }
}
