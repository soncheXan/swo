import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {

  // constructor() { }

  // ngOnInit(): void {
  // }

  on:boolean = true;
  enlace1:string = 'casachollo';
  enlace2:string = 'Comprar';
  enlace3:string = 'Alquilar';
  alertas:string = 'Alertas';
  favoritos:string = 'Favoritos';
  publicar:string = 'Publica';
  log:string = 'Accede';



}
