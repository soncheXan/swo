import { Component, OnInit } from '@angular/core';
import { Usuario } from 'src/app/usuario';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})


export class UsuariosComponent{

  user1: Usuario =
  {username: "Juan Antonio Airado Vilar", email: "juan@gmail.com"};

  user2: Usuario =
  {username: "Pedro Alonso Comesaña", email: "pedro@gmail.com"};

  user3: Usuario =
  {username: "Eduard Ceparu", email: "eduard@gmail.com"};
  
  usuarios: Usuario[] = [this.user1, this.user2];

  constructor() { }

  ngOnInit(): void {
  }

  addUsuario(): void{
    if(this.usuarios.length < 3)
      this.usuarios.push(this.user3);
  }
}
