/**
 * Application.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemplopostconstructpredestroy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pithan.renata.exemplopostconstructpredestroy.dao.ClientDAO;
import pithan.renata.exemplopostconstructpredestroy.model.Client;

@SpringBootApplication
public class ExemplopostconstructpredestroyApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExemplopostconstructpredestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Client01"));

		System.out.println("Object ClientDAO: " + clientDAO);
		System.out.println("Object Client : " + clientDAO.getClient());
	}

}
