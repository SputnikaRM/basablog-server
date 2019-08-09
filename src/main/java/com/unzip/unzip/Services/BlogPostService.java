package com.unzip.unzip.Services;

import com.unzip.unzip.Models.Tags;
import com.unzip.unzip.Models.BlogPost;
import com.unzip.unzip.Repositories.BlogPostRepository;
import com.unzip.unzip.Repositories.TagsRepository;
import org.omg.CORBA.INTERNAL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BlogPostService {
    @Autowired
    BlogPostRepository blogPostRepository;
    @Autowired
    TagsRepository tagsRepository;

    public void save(BlogPost post){
        post.setTimeStamp();
        post.setHashpostId(post.getTitle() , post.getUserId(),post.getTimeStamp());
        Tags tags = new Tags(post.getTag(),post.getHashpostId());
        tagsRepository.save(tags);
        post.setTags(tagsRepository.getOneByTag(post.getTag()));
        blogPostRepository.save(post);
    }
//            comment.setPosts(blogPostRepository.getOne(comment.getPostid()));
//        commentsRepository.save(comment);


}
