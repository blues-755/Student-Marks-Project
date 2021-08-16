/* UserControllerTest.java
    Author: Lunga Tshila (216282934)
    Date: 15 July 2021
 */

package za.ac.cput.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.Entity.User;
import za.ac.cput.Factory.UserFactory;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

class UserControllerTest {

    private static User user = UserFactory.build("Lunga", "Tshila", "lunga@gmail.com", 989,
            334, "0944");
    @Autowired
    private TestRestTemplate template;
    private final String BASE_URL = "http://localhost:8081/user";

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        ResponseEntity<User> postUserResponse = template.postForEntity(url, user, User.class);
        assertNotNull(postUserResponse);
        assertNotNull(postUserResponse.getBody());
        assertEquals(postUserResponse.getStatusCode(), HttpStatus.OK);
        user = postUserResponse.getBody();
        System.out.println("Stored data" + user);
        assertEquals(user.getUserId(), postUserResponse.getBody().getUserId());
    }

    @Test
    void b_read() {
        String url = BASE_URL + "/read/" + user.getUserId();
        System.out.println("URL: " + url);
        ResponseEntity<User> response = template.getForEntity(url, User.class);
        assertEquals(user.getUserId(), response.getBody().getUserId());
    }

    @Test
    void c_update() {
        User updated = new User.Builder().copy(user).setFirstName("Lunga").builder();
        String url = BASE_URL + "/update";
        System.out.println("URL: " + url);
        System.out.println("Post data: " + updated);
        ResponseEntity<User> response = template.postForEntity(url, updated, User.class);
        assertNotNull(response.getBody());
    }

    @Test
    void e_delete() {
        String url = BASE_URL + "/delete/" + user.getUserId();
        System.out.println("URL: " + url);;
        template.delete(url);
    }

    @Test
    void d_getAll() {
        String url = BASE_URL + "/getall";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity<String> response = template.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println("View All:");
        System.out.println(response);
        System.out.println(response.getBody());
    }
}