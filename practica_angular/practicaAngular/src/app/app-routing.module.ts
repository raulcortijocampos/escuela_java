import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RegistroComponent } from './registro/registro.component';
import { ListadoComponent } from './listado/listado.component';


const routes: Routes = [
  // Rutas estáticas utilizadas en la web 
  { path: "registro", component: RegistroComponent },
  { path: "listado", component: ListadoComponent },
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
