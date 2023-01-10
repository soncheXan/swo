import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-botones',
  templateUrl: './botones.component.html',
  styleUrls: ['./botones.component.css']
})
export class BotonesComponent implements OnInit {

  alert:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  verAzul(){
    this.alert = "ALERTA DE COLOR AZUL";
  }
  verAmarillo(){
    this.alert = "ALERTA DE COLOR AMARILLO";
  }
  verVerde(){
    this.alert = "ALERTA DE COLOR ROJO";
  }

}
