package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Integer> {
}
