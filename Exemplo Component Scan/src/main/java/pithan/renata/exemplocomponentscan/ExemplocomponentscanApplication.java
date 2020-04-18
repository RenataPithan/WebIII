/**
 * Application.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemplocomponentscan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import pithan.renata.exemplocomponentscan.externalclasses.ClassDAO;

@SpringBootApplication
@ComponentScan("externalclasses")
public class ExemplocomponentscanApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplocomponentscanApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO: " + objectDAO1);
		System.out.println("Object JDBC: "+ objectDAO1.getObjectJDBC());
	}

}
