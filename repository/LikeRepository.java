package community.api.repository;

import community.api.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LikeRepository extends JpaRepository<Like, Long> {

    boolean existsByPost_IdAndUser_Id(Long postId, Long userId);

    void deleteByPost_IdAndUser_Id(Long postId, Long userId);

    long countByPost_Id(Long postId);

    void deleteByPost_Id(Long postId);
}