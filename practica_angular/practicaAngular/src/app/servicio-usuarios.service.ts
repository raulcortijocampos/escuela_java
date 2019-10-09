import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from './modelo/persona';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})

export class ServicioUsuariosService {
  urlApiRest = "http://localhost:8084/CRUD_Vista_JSTL/api/users";
  urlApiListado = "http://localhost:8084/CRUD_Vista_JSTL/personas.do"
  httpOptions= {
    headers: new HttpHeaders({'Content-Type': "application/json"})
  }

  listaPersona: Persona[];
  constructor(private httpCli: HttpClient) {
     
   }

  getPersona() : Observable<Persona> {
    let observResp:Observable<any>;
    observResp = this.httpCli.get(this.urlApiRest);
    return observResp;
  }

  getPersonas() : Persona[] {
    return this.listaPersona;
  }

  add(newPersona: Persona): Observable<Persona> {
   return this.httpCli.post<Persona>(this.urlApiRest, newPersona, this.httpOptions);
  }
}
