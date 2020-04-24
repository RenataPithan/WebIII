/**
 * Character Repository.
 * @author  Renata
 * @version 1.0
 * @since   24/04/2020
 */

package pithan.renata.h2rpgcharacter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pithan.renata.h2rpgcharacter.model.CharacterEntity;

@Repository
public interface CharacterRepository extends CrudRepository<CharacterEntity, Long> {
}
