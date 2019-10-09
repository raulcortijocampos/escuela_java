import { Component, OnInit } from '@angular/core';
import { Persona } from '../modelo/persona';
import { ServicioUsuariosService } from '../servicio-usuarios.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  newPersona: Persona;
  constructor(private perSrv: ServicioUsuariosService) { }

  ngOnInit() {
    this.newPersona = new Persona();
  }
  registrar(): void {
    
    this.perSrv.add(this.newPersona).subscribe();
    alert("registrado con exito");
    // Crear uno nuevo para la siguiente vez
    this.newPersona = new Persona();
  }

}
