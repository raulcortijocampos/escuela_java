import { NgModule } from '@angular/core';
// import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from '@angular/router';
import { HerosLiComponent } from '../app/heros-li/heros-li.component';
import { NewHeroComponent } from '../app/new-hero/new-hero.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeroDetailComponent } from './hero-detail/hero-detail.component';


//Listado de vinculaciones entre URL y Component
const routes: Routes = [
  //Ruta raiz carga por defeccto el dashboard
  { path: '', redirectTo: '/dashboard', pathMatch: 'full'},
  //Rutas estaticas
  { path: "heroes", component: HerosLiComponent},
  { path: "newHero", component: NewHeroComponent},
  { path: "dashboard", component: DashboardComponent},
  //Rutas con parametros
  { path: 'detail/:id', component: HeroDetailComponent}
 
];


@NgModule({
  declarations: [],
  imports: [
   // CommonModule
   RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
