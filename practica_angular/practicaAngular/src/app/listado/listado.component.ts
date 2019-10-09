import { Component, OnInit } from '@angular/core';
import { Persona } from '../modelo/persona';
import { ServicioUsuariosService } from '../servicio-usuarios.service';

@Component({
  selector: 'app-listado',
  templateUrl: './listado.component.html',
  styleUrls: ['./listado.component.css']
})
export class ListadoComponent implements OnInit {

  listaPersona: Persona[];
  constructor(private perSrv: ServicioUsuariosService) { }

  ngOnInit() {
    // this.heroes = HEROES;
    this.getPersonasFromService();
  }
  getPersonasFromService(): void {
    this.listaPersona = this.perSrv.getPersonas();
  }

}
