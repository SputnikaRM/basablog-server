import { Component, OnInit } from '@angular/core';
import { BlogService} from 'src/app/blog.service';
import {Post} from 'src/app/post';
import {Comment} from 'src/app/comment';

@Component({
  selector: 'app-bloglist',
  templateUrl: './bloglist.component.html',
  styleUrls: ['./bloglist.component.css']
})
export class BloglistComponent implements OnInit {
  posts: Post[];

  constructor(private blogService: BlogService) {
    
    
   }
   
   

  ngOnInit() {
    this.blogService.findAllBlogPost().subscribe(data=> {this.posts = data;});
  }
      
 

}
