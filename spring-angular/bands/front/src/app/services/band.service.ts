import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http'
import {  Observable } from 'rxjs'
import { Band } from '../models/Band';

@Injectable({
  providedIn: 'root'
})
export class BandService {

  headers:HttpHeaders = new HttpHeaders({'Content-Type' : 'application/json'});
  URL:string = "http://localhost:8080/api/band";

  constructor(private http:HttpClient) { }

  saveBand(band:Band) : Observable<Band> {
    return this.http.post<Band>(this.URL+'/save' , band, {headers: this.headers})
  }

  bandsList() :Observable<Band>{
    return this.http.get<Band>(this.URL+'/list')
  }

  searchGroup(bandName:string): Observable<any>{
    return this.http.get<Band>(this.URL+'/search/'+bandName);
  }
}