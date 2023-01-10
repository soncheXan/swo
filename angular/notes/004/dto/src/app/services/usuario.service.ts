import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ComplexUser } from '../models/ComplexUsers';
import { Usuario } from '../models/Usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  URL:string = "http://localhost:8080/api/usuario";
  httpheaders:HttpHeaders = new HttpHeaders({'Content-Type' : 'application/json'})

  constructor(private http:HttpClient) { }
  //  LISTAR LOS USUARIOS
  listarUsuarios():Observable<Usuario>{
    return this.http.get<Usuario>(this.URL+'/list-dto');
  }
  //  ELIMINAR USUARIOS
  eliminarUsuarios(id:number): Observable<Usuario>{
    return this.http.delete<Usuario>(this.URL+'/delete/'+id);
  }

  //  GUARDAR USUARIOS
  guardarUsusarios(usuario:ComplexUser):Observable<ComplexUser>{
    return this.http.post<ComplexUser>(this.URL+'/save', usuario, {headers:this.httpheaders})
  }

  //  BUSCAR USUARIO POR ID
  buscarUsuarios(id:number):Observable<Usuario>{
    return this.http.get<Usuario>(this.URL+'/'+id)
  }
}

