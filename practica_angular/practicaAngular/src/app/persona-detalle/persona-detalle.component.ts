import { Component, OnInit, Input } from '@angular/core';
import { Persona } from '../modelo/persona';
import { ActivatedRoute } from '@angular/router';
import { ServicioUsuariosService } from '../servicio-usuarios.service';
import { ListadoComponent} from '../listado/listado.component';

@Component({
  selector: 'app-persona-detalle',
  templateUrl: './persona-detalle.component.html',
  styleUrls: ['./persona-detalle.component.css']
})
export class PersonaDetalleComponent implements OnInit {

  // Esta propiedad viene de algún componente externo
  @Input() persona: Persona;


  constructor(private perSrv: ServicioUsuariosService) { }

   ngOnInit() {
  //   this.getPersonaDetalle();
   }
  // getPersonaDetalle(): void {
  //   // Cogemos el id del parámetro de la url   /detail/:id
  //   const id = this.route.snapshot.paramMap.get('id');  
  //   //this.persona = this.perSrv.getUnaPersona(parseInt(id));
  //   let Lala = listaP.getUnaPersona(2);
  // };

   modificaar(){
    this.perSrv.modificar(this.persona);
    
   }
   

}
