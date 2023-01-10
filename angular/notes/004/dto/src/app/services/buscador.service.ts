import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Usuario } from '../models/Usuario';

@Injectable({
  providedIn: 'root'
})
export class BuscadorService {

  constructor(private http:HttpClient) { }

  buscar(username:string):Observable<Usuario>{
    return this.http.get<Usuario>('http://localhost:8080/api/usuario/by-username/'+username);
  }
}
