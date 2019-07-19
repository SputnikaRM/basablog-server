import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {User} from 'src/app/user';
import {UserService} from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
user: User;

  constructor(private userService: UserService, private route: ActivatedRoute, private router: Router) {
    this.user = new User();
  }
  ngOnInit() {
  }

  onSubmit() {
    this.userService.verifyUser(this.user).subscribe(user => this.verify());
  }
  verify() {
    this.router.navigate(['users/verify']);
    }
  }


