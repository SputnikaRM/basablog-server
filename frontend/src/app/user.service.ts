import { Injectable } from '@angular/core';
import {User} from './user';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl: string;

  constructor(private http: HttpClient) {
    this.userUrl = "https://basablog.herokuapp.com/users/add";
  }
  public save(user: User) {
    return this.http.post<User>(this.userUrl, user);
  }

}

