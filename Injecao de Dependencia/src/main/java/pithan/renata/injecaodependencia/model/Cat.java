/**
 *Public class Cat with InterfaceAnimal.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.injecaodependencia.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pithan.renata.injecaodependencia.interfaces.InterfaceAnimal;

@Component
@Primary
@Qualifier("cat")

public class Cat implements InterfaceAnimal {

    /**
     * @return the sound of the cat.
     */
    @Override
    public void comunicate() {
        //TODO auto-generated method stub
        System.out.println("Meow");
    }
}
