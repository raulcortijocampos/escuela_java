import { Component, OnInit } from '@angular/core';
import { Persona } from '../modelo/persona';
import { ServicioUsuariosService } from '../servicio-usuarios.service';

@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {
  personasRecibidas: Persona[] ; //= new Array();
  newPersona: Persona;
  constructor(private perSrv: ServicioUsuariosService) { }


  registrar(): void {
    
    this.perSrv.add(this.newPersona).subscribe();
 
    alert("registrado con exito");
    this.personasRecibidas.push(this.newPersona);
    // Crear uno nuevo para la siguiente vez
    this.newPersona = new Persona();
    
  }
  
  ngOnInit() {
    
    this.newPersona = new Persona();
    /*
    this.perSrv.getPersonaObservable().subscribe(
      personasRec =>{ 
        this.personasRecibidas = personasRec;
      }
      
    )*/}

}
