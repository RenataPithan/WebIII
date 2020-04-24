/**
 * Character Entity for DB.
 * @author  Renata
 * @version 1.0
 * @since   24/04/2020
 */

package pithan.renata.h2rpgcharacter.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component

/**
 * Lombok Getter/Setter.
 */
@Getter @Setter

/**
 * Lombok Constructors.
 */
@NoArgsConstructor @AllArgsConstructor

/**
 * Lombok To String.
 */
@ToString

@Entity
@Table(name = "character")
public class CharacterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_character")
    private long id;

    @Column(name = "name")
    private String name;

    @Column(name = "race")
    private String race;

    @Column(name = "age")
    private long age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "primary_weapon")
    private String primaryWeapon;

    @Column(name = "hp")
    private double hp;

    @Column(name = "mp")
    private double mp;
}
