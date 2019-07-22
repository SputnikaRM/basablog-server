import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BloglistComponent } from './bloglist/bloglist.component';
import { AddblogComponent } from './addblog/addblog.component';
import {AdduserComponent} from './adduser/adduser.component';
import {UserComponent} from './user/user.component';
import { BlogComponent } from './blog/blog.component';

const routes: Routes = [
  {
    path: '',
    component: BloglistComponent
  },

  {
    path: 'addblog',
    component: AddblogComponent
  },
  {
    path: 'adduser',
    component: AdduserComponent
  },
  {
    path: 'user',
    component: UserComponent
  },
  {
    path: 'post/:id',
    component: BlogComponent
  }

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
