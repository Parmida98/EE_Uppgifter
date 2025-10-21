package Uppgift_01.Lektion;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

// Parameter 0 of constructor in
// com.demo.EE_demo_1.ViewExampleController required a bean of type
// 'com.demo.EE_demo_1.TestService' that could not be found.
@Service
public class TestService {

    /* Best Practices
     *   Business Logic - Goes here
     *   Handles Throwing Exceptions
     *   NEVER return ResponseEntity<> (Controllers handles this)
     *   Dependency Injection with Repository - Goes here
     *       AVOID using Repository inside Controllers
     *       The Controller should DI Services
     *   NEVER use Mappings inside Services (Controllers only)
     *   ALWAYS LOG inside Services (Controller logging is bad)
     *   Services MUST be Annotated with @Service
     *   Abstraction through Services (Must not always be implemented)
     * */

    // TODO - Service contains @Component... why?
    /* What are Components... Beans...?
     *   Components == beans (spring handled objects), they're similar but
     *   not identical... (Components is for class level)
     *   @Bean is method level annotation
     *   Beans are handled through Spring's lifecycle
     *   Beans / Components are injected through Autowiring (DI) IoC Container
     *
     * Spring = som din mamma som organiserar leksaker (objekt).
     * Bean = själva leksaken som finns på hyllan.
     * @Component = etiketten som gör att Spring hittar leksaken automatiskt.
     *
     *
     *
     * Dependency Injection:
     * Alltså: någon annan (Spring) ger objektet som behövs, istället för att objektet skapar det själv.
     * Dependency Injection betyder att Spring ger dig de verktyg (objekt) du behöver, så att du inte behöver skapa dem själv.
     *
     * */
}
