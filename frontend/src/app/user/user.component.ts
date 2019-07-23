import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import {User} from 'src/app/user';
import {UserService} from '../user.service';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
user: User;
result: Subscription;
@Output() userstatus = new EventEmitter<boolean>();

  constructor(private userService: UserService, private route: ActivatedRoute, private router: Router) {
    this.user = new User();
  }

  ngOnInit() {
    this.userstatus.emit(false);
  }

  onSubmit() {
    if (this.userService.verifyUser(this.user)) {return this.userstatus.emit(true); }
    return this.userService.verifyUser(this.user).subscribe(result => this.verify());
  }
  verify() {
    return this.router.navigate(['users/verify']);
    }
  }


