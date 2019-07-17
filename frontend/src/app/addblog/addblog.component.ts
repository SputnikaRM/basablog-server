import { Component, OnInit } from '@angular/core';
import { BlogService } from '../blog.service';
import {Post} from 'src/app/post'

@Component({
  selector: 'app-addblog',
  templateUrl: './addblog.component.html',
  styleUrls: ['./addblog.component.css']
})
export class AddblogComponent implements OnInit {
  post: Post[];

  constructor(private blogService: BlogService) {

   }

  ngOnInit() {
    this.blogService.findAllBlogPost().subscribe(data => {this.post = data;})
  }

}
