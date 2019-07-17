package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.BlogPost;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Integer> {}
