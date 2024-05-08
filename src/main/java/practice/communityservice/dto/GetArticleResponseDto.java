package practice.communityservice.dto;

import lombok.Getter;
import lombok.Setter;
import practice.communityservice.domain.model.Comment;
import java.util.List;

@Getter
@Setter
public class GetArticleResponseDto {
    private ArticleDto articleInfo;
    private List<Comment> commentList;

    public static GetArticleResponseDto from(ArticleDto articleDto, List<Comment> commentList){
        GetArticleResponseDto getArticleResponseDto = new GetArticleResponseDto();
        getArticleResponseDto.setArticleInfo(articleDto);
        getArticleResponseDto.setCommentList(commentList);
        return getArticleResponseDto;
    }

}
