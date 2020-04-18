/**
 * Public class ClientDao, with Post Construct and  Pre Destroy.
 * @author  Renata
 * @version 1.0
 * @since   18/04/2020
 */

package pithan.renata.exemplopostconstructpredestroy.dao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pithan.renata.exemplopostconstructpredestroy.model.Client;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    /**
     * Post Construct.
     */
    @PostConstruct
    public void postConstructor(){
        System.out.println("Created Object");
    }

    /**
     * Pre Destroy.
     */
    @PreDestroy
    public void preDestroy(){
        System.out.println("Finished Object");
    }
}
