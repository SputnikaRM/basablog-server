import { Injectable } from '@angular/core';
import {User} from './user';
import {HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import {NgModel} from "@angular/forms";

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private userUrl: string;
  private verifyUrl: string;

  constructor(private http: HttpClient) {
    this.userUrl = 'http://localhost:8080/users/add';
    this.verifyUrl = 'http://localhost:8080/users/verify';
  }
  public save(user: User) {
    return this.http.post<User>(this.userUrl, user);
  }

  public verifyUser(user: User) {
    return this.http.post<User>(this.verifyUrl, user);
  }
}

