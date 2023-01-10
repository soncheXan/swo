import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card-component',
  templateUrl: './card-component.component.html',
  styleUrls: ['./card-component.component.css']
})
export class CardComponentComponent implements OnInit {

  clicks:number = 0;

  constructor() { }

  ngOnInit(): void {
  }

  addClick(): void {
    this.clicks ++;
  }
}
