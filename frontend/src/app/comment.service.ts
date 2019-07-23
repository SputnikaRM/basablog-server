import { Injectable } from '@angular/core';
import {HttpClient,HttpHeaders} from '@angular/common/http';
import {Comment} from 'src/app/comment';
import {Observable} from 'rxjs'; 

@Injectable({
  providedIn: 'root'
})
export class CommentService {
  private postURL: string;


  constructor(private http:HttpClient) {
    this.postURL = "http://localhost:8080/comments/add";
   }

  public findAll(postid : number): Observable<Comment[]> {
    return this.http.get<Comment[]>(`http://localhost:8080/${postid}/comments/all`);
  }
  
  public save(comment: Comment) {
    return this.http.post<Comment>(this.postURL, comment);
  }
}
