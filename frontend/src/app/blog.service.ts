import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import {Post} from 'src/app/post';
import {Comment} from 'src/app/comment';
@Injectable({
  providedIn: 'root'
})
export class BlogService {private blogposturl = "http://localhost:8080/blogPost/add";
private bloggeturl =  "http://localhost:8080/blogPost/all";
private blogdeleteurl = "http://localhost:8080/";
private blogupdateurl = "http://localhost:8080/";
private commentgeturl = "http://localhost:8080/";
private commentposturl = "http://localhost:8080/";

constructor(private http:HttpClient) {
  
  
 }
 public findAllBlogPost(): Observable<Post[]>{
   return this.http.get<Post[]>(this.bloggeturl);
 }
 public save(post: Post){
   return this.http.post<Post>(this.blogposturl,post);
 }
 
}
