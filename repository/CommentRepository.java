package community.api.repository;

import community.api.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findAllByPost_Id(Long postId);

    long countByPost_Id(Long postId);

    void deleteByPost_Id(Long postId);
}