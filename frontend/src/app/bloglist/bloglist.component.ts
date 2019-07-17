import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-bloglist',
  templateUrl: './bloglist.component.html',
  styleUrls: ['./bloglist.component.css']
})
export class BloglistComponent implements OnInit {
  private blogposturl = "http://localhost:8080/";
  private blog

  constructor(private http:HttpClient) {

    
   }

  ngOnInit() {
  }

}
