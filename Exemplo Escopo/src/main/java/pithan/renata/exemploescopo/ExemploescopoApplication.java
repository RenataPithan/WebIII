/**
 * Application.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemploescopo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pithan.renata.exemploescopo.dao.ClassDAO;

@SpringBootApplication
public class ExemploescopoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExemploescopoApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO: " + objectDAO1);
		System.out.println("Object JDBC: " + objectDAO1.getObjectJDBC());

		System.out.println("Object DAO: " + objectDAO2);
		System.out.println("Object JDBC: " + objectDAO2.getObjectJDBC());
	}

}
