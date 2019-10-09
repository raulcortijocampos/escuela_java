import { Component, OnInit } from '@angular/core';
import { Persona } from '../modelo/persona';
import { ServicioUsuariosService } from '../servicio-usuarios.service';
import { Observable, of } from 'rxjs';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {
  personasRecibidas: Persona[];
  listaPersona: Persona[];
  personaSeleccionada: Persona;

  constructor(private perSrv: ServicioUsuariosService) {

   }

  ngOnInit() {
    let observArrayPersonas: Observable<Persona[]>;
    //observArrayPersonas = this.perSrv.getHeroesDonde();
    this.personasRecibidas = [];
    this.perSrv.getPersonaObservable().subscribe(personasRec =>{ 
      this.personasRecibidas = personasRec
    }
    );

    this.getPersonasFromService();
  } 

  getPersonasFromService(): void {
    this.listaPersona = this.perSrv.getPersonasLista();
  }


  getUnaPersona(id: number): Persona{
    let personaEncontrada = this.personasRecibidas.find( personaEncontrada=> personaEncontrada.id === id );
     return personaEncontrada;
   }
}
