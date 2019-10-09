import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from './modelo/persona';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { ListadoComponent} from './listado/listado.component';

@Injectable({
  providedIn: 'root'
})

export class ServicioUsuariosService {
  urlApiRest = "http://localhost:8084/CRUD_Vista_JSTL/api/users";
  urlApiListado = "http://localhost:8084/CRUD_Vista_JSTL/personas.do";
  httpOptions= {
    headers: new HttpHeaders({'Content-Type': "application/json"})
  }

  listaPersona: Persona[];
  constructor(private httpCli: HttpClient) {
     this.getPersonasLista()
   }

  getPersonaObservable() : Observable<Persona[]> {
    let observResp:Observable<any>;
    observResp = this.httpCli.get(this.urlApiRest);
    return observResp;
  }

  getPersonasLista() : Persona[] {
    return this.listaPersona;
  }
add(newPersona: Persona): Observable<Persona> {
   return this.httpCli.post<Persona>(this.urlApiRest, newPersona, this.httpOptions);
  }

    
  modificar(personaModificar: Persona): void{
    this.httpCli.put<Persona>(this.urlApiRest, personaModificar, this.httpOptions);
  }
  /*
  getUnaPersona(): Persona{
   let personaEncontrada = this.personasRecibidas.find( personaEncontrada=> persona.id === id );
    return personaEncontrada;
  }
  */

}