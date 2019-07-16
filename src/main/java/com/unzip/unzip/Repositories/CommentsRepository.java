package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.Comments;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentsRepository extends CrudRepository <Comments,Long> {
}
