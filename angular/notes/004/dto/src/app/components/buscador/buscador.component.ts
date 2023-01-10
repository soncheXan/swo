import { Component, OnInit } from '@angular/core';
import { BuscadorService } from 'src/app/services/buscador.service';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-buscador',
  templateUrl: './buscador.component.html',
  styleUrls: ['./buscador.component.css']
})
export class BuscadorComponent implements OnInit {

  usuarios:any = [];
  username:string = "";

  constructor(private buscadorService:BuscadorService) { }

  ngOnInit(): void {
  }


  buscarUsuario(){
    this.buscadorService.buscar(this.username).subscribe(
      res=>{
        this.usuarios = res
        console.log(this.usuarios)
      }
    )
  }

  realTimeBuscador(){
    this.buscarUsuario();
  }
}
