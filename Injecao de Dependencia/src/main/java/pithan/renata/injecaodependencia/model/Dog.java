/**
 *Public class Dog with InterfaceAnimal.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.injecaodependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pithan.renata.injecaodependencia.interfaces.InterfaceAnimal;

@Component
@Qualifier("dog")
public class Dog implements InterfaceAnimal {

    /**
     * @return the sound of the dog.
     */
    @Override
    public void comunicate() {
        System.out.println("Au-au");
    }
}
