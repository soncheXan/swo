import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import {} from '@angular/'
import { Departamento } from 'src/app/modules/Departamento';

@Injectable({
  providedIn: 'root';
})

@Component({
  selector: 'app-departamento',
  templateUrl: './departamento.component.html',
  styleUrls: ['./departamento.component.css']
})

export class DepartamentoService{

  URL:string = "http://localhost:8080/api/departamento"

  private httpHeaders:HttpHeaders = new HttpHeaders({'Content-Type': 'application/json'})

  constructor(private http:HttpClient) { }

  listaDepartamentos(){
    return this.http.get(this.URL+'/lista');
  }

  guardarDepartamento(departamento:Departamento):Observable<Departamento>{
    return this.http.post<Departamento>(this.URL+'/save', departamento, {headers: this.httpHeaders})
  }


}
