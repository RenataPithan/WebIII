/**
 * Class DAO.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemplocomponentscan.externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter @Setter
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;

}
