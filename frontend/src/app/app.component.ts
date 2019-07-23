import { Component } from '@angular/core';
import { User } from 'src/app/user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loginstatus = true;
  title = 'unZip';

  userstatuschange(value: boolean) {
    this.loginstatus = value;
  }

  getLoggedInStatus(): boolean {
    return this.loginstatus;
  }
}
