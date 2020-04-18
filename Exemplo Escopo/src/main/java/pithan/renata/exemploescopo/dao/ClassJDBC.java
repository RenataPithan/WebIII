/**
 * Class JDBC with scope.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemploescopo.dao;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ClassJDBC {

    public ClassJDBC() {
        System.out.println("JDBC Class");

    }
}
