package my.projectSpringMVC.repository;

import my.projectSpringMVC.modul.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> all();

    Optional<Post> getById(long id);

    Post save(Post post);

    void removePostById(long id);
}
