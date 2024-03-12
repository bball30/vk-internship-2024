package dev.vasilev.vkinternship.controller;

import dev.vasilev.vkinternship.dto.post.Post;
import dev.vasilev.vkinternship.service.PostsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080/")
@RestController
@RequestMapping("/posts")
@RequiredArgsConstructor
public class PostsController {

    @Autowired
    private PostsService service;

    @PostMapping("/")
    public ResponseEntity<Post> create(@RequestBody Post post) {
        var createdPost = service.create(post);
        return new ResponseEntity<>(createdPost.getBody(), createdPost.getStatusCode());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Post> getPost(@PathVariable Integer id) {
        return service.getPost(id);
    }

    @GetMapping("/")
    public ResponseEntity<List<Post>> getPosts() {
        return service.getPosts();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id) {
        return service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Post> editUser(@PathVariable Integer id, @RequestBody Post post) {
        return service.edit(id, post);
    }
}
