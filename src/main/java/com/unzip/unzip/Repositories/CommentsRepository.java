package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends CrudRepository <Comments,Long> {
    List<Comments> findAllByPostid(Integer postid);
}
