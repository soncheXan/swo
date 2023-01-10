import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  email:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  getForm(): void{
    console.log(this.email);
  }

}
