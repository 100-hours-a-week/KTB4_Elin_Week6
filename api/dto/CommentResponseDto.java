package community.api.dto;

import community.api.entity.Comment;
import lombok.Getter;

@Getter
public class CommentResponseDto {

    private Long commentId;
    private Long postId;
    private Long userId;
    private String content;

    public CommentResponseDto(Long commentId, Long postId, Long userId, String content) {
        this.commentId = commentId;
        this.postId = postId;
        this.userId = userId;
        this.content = content;
    }

    public static CommentResponseDto from(Comment comment) {
        return new CommentResponseDto(
                comment.getId(),
                comment.getPostId(),
                comment.getUserId(),
                comment.getContent()
        );
    }
}