/* HomeController.java
    Author: Lunga Tshila (216282934)
    Date: 15 July 2021
 */

package za.ac.cput.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @RequestMapping({"/", "/home"})
    public String home() {
        return "Student Application Home Page";
    }
}
