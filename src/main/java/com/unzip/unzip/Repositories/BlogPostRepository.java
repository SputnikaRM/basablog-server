package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Integer> {
    List<BlogPost> findAllByTag1(String tag1);
    List<BlogPost> findAllByTag2(String tag2);
    List<BlogPost> findAllByTag3(String tag3);
    List<BlogPost> findAllByUserId(Integer id);
    BlogPost findBlogPostByUserIdAndAndId(Integer userId, Integer postId);


}
