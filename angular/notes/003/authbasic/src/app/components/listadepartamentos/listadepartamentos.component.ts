import { Component, OnInit } from '@angular/core';
import { DepartamentoService } from 'src/app/services/departamento';

@Component({
  selector: 'app-listadepartamentos',
  templateUrl: './listadepartamentos.component.html',
  styleUrls: ['./listadepartamentos.component.css']
})
export class ListadepartamentosComponent implements OnInit {

  departamentos: any;

  constructor(private departamentoService:DepartamentoService) { }

  ngOnInit(): void {
  }

  list(){
    this.departamentoService.listaDepartamentos().subscribe(
      res => {
        this.departamentos = res
      }
    );
  }
  
}
