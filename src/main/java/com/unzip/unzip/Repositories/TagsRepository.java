package com.unzip.unzip.Repositories;

import com.unzip.unzip.Models.Tags;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TagsRepository extends JpaRepository<Tags,Integer> {

    List<Tags> findAllByTagsId(Integer tagsId);

}
