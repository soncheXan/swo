import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista',
  templateUrl: './lista.component.html',
  styleUrls: ['./lista.component.css']
})
export class ListaComponent implements OnInit {

  constructor(private http:HttpClient) { 
    this.http.get('https://jsonplaceholder.typicode.com/users%C2%A0').subscribe;
    res => console.log(res);
    err => console.log(err);
  }
  ngOnInit(): void {
  }

}
