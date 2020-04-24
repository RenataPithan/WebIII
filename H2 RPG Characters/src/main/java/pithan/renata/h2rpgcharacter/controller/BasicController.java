/**
 * Basic controller/index.
 * @author  Renata
 * @version 1.0
 * @since   24/04/2020
 */

package pithan.renata.h2rpgcharacter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String index() {
        return "Welcome! Make your character sheet here!";
    }
}
