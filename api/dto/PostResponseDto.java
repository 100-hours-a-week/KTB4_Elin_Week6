package community.api.dto;

import community.api.entity.Post;
import community.api.entity.User;
import lombok.Getter;

@Getter
public class PostResponseDto {

    private Long postId;
    private Long userId;
    private String nickname;
    private String profileImage;
    private String title;
    private String content;
    private String contentImage;
    private int viewCount;
    private int likeCount;
    private int commentCount;

    public PostResponseDto(Long postId, Long userId, String nickname, String profileImage, String title, String content, String contentImage, int viewCount, int likeCount, int commentCount) {
        this.postId = postId;
        this.userId = userId;
        this.nickname = nickname;
        this.profileImage = profileImage;
        this.title = title;
        this.content = content;
        this.contentImage = contentImage;
        this.viewCount = viewCount;
        this.likeCount = likeCount;
        this.commentCount = commentCount;
    }

    public static PostResponseDto from(Post post, User user, int likeCount, int commentCount) {
        return new PostResponseDto(
                post.getId(),
                user.getId(),
                user.getNickname(),
                user.getProfileImage(),
                post.getTitle(),
                post.getContent(),
                post.getContentImage(),
                post.getViewCount(),
                likeCount,
                commentCount
        );
    }
}