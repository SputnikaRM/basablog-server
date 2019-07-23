import { Component, OnInit, Input } from '@angular/core';
import { Post } from '../post';
import { ActivatedRoute } from '@angular/router';
import { BlogService } from '../blog.service';
import { CommentService } from '../comment.service';
import { Comment } from '../comment';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})

export class BlogComponent implements OnInit {
  @Input() post : Post;
  @Input() comments : Comment[];
  
  loginStatus : boolean;

  constructor(
    private route: ActivatedRoute,
    private blogService: BlogService,
    private commentService: CommentService,
    private appComponent : AppComponent
  ) {}
  
  ngOnInit() {
    this.getPost();
    this.getComments();
    // this.loginStatus = this.appComponent.getLoggedInStatus();
  }

  getPost(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.blogService.getBlogPost(id).subscribe(post => this.post = post);
  }

  getComments(): void {
    const postid = +this.route.snapshot.paramMap.get('id');
    this.commentService.findAll(postid).subscribe(comments => this.comments = comments);
  }

  onSubmit(): void {
    
  }
}

