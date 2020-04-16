/**
 * Hello World Controller.
 *
 * @author Renata
 * @version 1.0
 * @since 15/04/2020
 */

package pithan.renata.helloworldrestcontrollerlombok.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class HelloWorldController {

        /**
         * show messages on "index".
         */
        @GetMapping("/")
        public String Index() {
            return "Hello World!";
        }
}
