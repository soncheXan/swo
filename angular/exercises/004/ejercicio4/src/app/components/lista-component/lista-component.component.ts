import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lista-component',
  templateUrl: './lista-component.component.html',
  styleUrls: ['./lista-component.component.css']
})
export class ListaComponentComponent implements OnInit {

  txt:string = "Mostrar tabla";

  empleados:{
    nombreCompleto:string
    antiguedad:number
    salario:number
  }[] =
  [
    {nombreCompleto : "Luis Pérez López", antiguedad : 6, salario : 24000},
    {nombreCompleto : "María Gómez Hernández", antiguedad : 6, salario : 32000}
  ]

  constructor() { }

  ngOnInit(): void {
  }

  showTable(): void{

    let table = document.querySelector("table")!;

    if(this.txt === "Mostrar tabla")
      this.txt = "Ocultar tabla";
    else
      this.txt = "Mostrar tabla";
  }
}
