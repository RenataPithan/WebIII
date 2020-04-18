/**
 *Application.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.injecaodependencia;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InjecaodependenciaApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = (ApplicationContext) SpringApplication.run(InjecaodependenciaApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}
