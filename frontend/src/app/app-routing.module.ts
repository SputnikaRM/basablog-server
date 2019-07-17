import { NgModule, Component } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BloglistComponent } from './bloglist/bloglist.component';
import { AddblogComponent } from './addblog/addblog.component';


const routes: Routes = [
{
  path: '',
  component: BloglistComponent
},

{
  path: 'addblog',
  component: AddblogComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
