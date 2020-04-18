/**
 *Public class Pet, that can show the sound of dog or cat.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.injecaodependencia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import pithan.renata.injecaodependencia.interfaces.InterfaceAnimal;

@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private InterfaceAnimal interfaceAnimal;

    /**
     * @return the sound of the choosen animal.
     */
    public void execute(){interfaceAnimal.comunicate();}

}
