import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Usuario } from 'src/app/models/Usuario';
import { UsuarioService } from 'src/app/services/usuario.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {

  usuario:Usuario = new Usuario;

  constructor(private usuarioService:UsuarioService, private activateRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.show();
  }


  show(){
    this.activateRoute.params.subscribe(
      params => this.usuarioService.buscarUsuarios(params['id']).subscribe(res=>console.log(res))
    );
  }

  update(){

  }
}
