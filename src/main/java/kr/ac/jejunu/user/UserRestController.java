package kr.ac.jejunu.user;

import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;

@RestController
@RequestMapping("/server/user")
public class UserRestController {
    @GetMapping
    public User get(@RequestParam("id") Integer id) throws SQLException {
        return null;
    }
    @PostMapping
    public User create(@RequestBody User user) {
        return user;
    }

    @PutMapping
    public User modify(@RequestBody User user){
        user.setName("modified");
        return user;
    }

    @DeleteMapping
    public void delete(@RequestParam Integer id) {

    }
}