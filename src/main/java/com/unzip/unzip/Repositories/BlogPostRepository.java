package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Repository
public interface BlogPostRepository extends JpaRepository<BlogPost, Integer> {
    List<BlogPost> findAllByTag(String tag1);

    List<BlogPost> findAllByUserId(Integer id);
    BlogPost findBlogPostByUserIdAndAndId(Integer userId, Integer postId);
    List<BlogPost> findByOrderByIdDesc();
}
