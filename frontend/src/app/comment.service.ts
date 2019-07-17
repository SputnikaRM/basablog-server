import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import {Comment} from 'src/app/comment';
import {Observable} from 'rxjs'; 

@Injectable({
  providedIn: 'root'
})
export class CommentService {
  private findURL: string;
  private postURL: string;


  constructor(private http:HttpClient) {
    this.postURL = "http://localhost:8080/comments/add";
    this.findURL = "http://localhost:8080/comments/all";
   }

public findAll(): Observable<Comment[]> {
  return this.http.get<Comment[]>(this.postURL);
}

public save(post: Comment) {
  return this.http.post<Comment>(this.findURL, post);
}
}
