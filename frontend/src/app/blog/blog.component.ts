import { Component, OnInit, Input } from '@angular/core';
import { Post } from '../post';
import { ActivatedRoute } from '@angular/router';
import { BlogService } from '../blog.service';

@Component({
  selector: 'app-blog',
  templateUrl: './blog.component.html',
  styleUrls: ['./blog.component.css']
})

export class BlogComponent implements OnInit {
  @Input() post : Post;

  constructor(
    private route: ActivatedRoute,
    private blogService: BlogService
  ) {}

  ngOnInit() {
    this.getPost();
  }

  getPost(): void {
    const id = +this.route.snapshot.paramMap.get('id');
    this.blogService.getBlogPost(id).subscribe(post => this.post = post);
  }

}

// import { Component, OnInit, Input } from '@angular/core';
// import { Post } from '../post';
// import { ActivatedRoute } from '@angular/router';
// import { BlogService } from '../blog.service';

// @Component({
//   selector: 'app-blog-detail',
//   templateUrl: './blog-detail.component.html',
//   styleUrls: ['./blog-detail.component.css']
// })
// export class BlogDetailComponent implements OnInit {
//   @Input() post : Post;

//   constructor(
//     private route: ActivatedRoute,
//     private blogService: BlogService,
//   ) { }

//   ngOnInit(): void {
//     this.getPost();
//   }

//   getPost(): void {
//     const id = +this.route.snapshot.paramMap.get('id'); 
//     this.blogService.getBlogPost(id).subscribe(post => this.post = post);
//   }

// }