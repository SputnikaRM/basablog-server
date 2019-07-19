import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {User} from '../user';
import {UserService} from '../user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
user: User;

  constructor(private route: ActivatedRoute, private userService: UserService, private router: Router) {
    this.user = new User();
  }
  ngOnInit(): void {
  }

  onSubmit() {
  this.userService.verifyUser(this.user).subscribe(result => this.gotoUserList());
  }

  gotoUserList() {
    this.router.navigate((['users/verify']));
  }
}


