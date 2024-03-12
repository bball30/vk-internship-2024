package dev.vasilev.vkinternship.controller;

import dev.vasilev.vkinternship.dto.user.User;
import dev.vasilev.vkinternship.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UsersController {

    @Autowired
    private UsersService service;

    @PostMapping("/")
    public ResponseEntity<User> create(@RequestBody User user) {
        var createdUser = service.create(user);
        return new ResponseEntity<>(createdUser.getBody(), createdUser.getStatusCode());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getUsers() {
        return service.getUsers();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        return service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> editUser(@PathVariable Integer id, @RequestBody User user) {
        return service.edit(id, user);
    }
}
