import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Departamento } from 'src/app/modules/Departamento';
import { DepartamentoService } from 'src/app/services/departamento/departamento.component';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-departamentoform',
  templateUrl: './departamentoform.component.html',
  styleUrls: ['./departamentoform.component.css']
})
export class DepartamentoformComponent implements OnInit {

  nombre:string = "";

  departamento:Departamento = new Departamento();

  constructor(private departamentoService:DepartamentoService, private router:Router) { }

  ngOnInit(): void {
  }

  save(){
    this.departamento.nombreDepartamento = this.nombre;
    this.departamentoService.guardarDepartamento(this.departamento).subscribe(
      res => {
        Swal.fire({
          position: 'center',
          icon: 'success',
          title: 'Departamento registrado',
          showConfirmButton: false,
          timer: 1500
        })
        this.router.navigate(['/departamentos'])
      }
    )
  }
}
