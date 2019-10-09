import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { RegistroComponent } from './registro/registro.component';
import { MensajesComponent } from './mensajes/mensajes.component';
import { ListadoComponent } from './listado/listado.component';
import { PersonaDetalleComponent } from './persona-detalle/persona-detalle.component';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';


@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    RegistroComponent,
    MensajesComponent,
    ListadoComponent,
    PersonaDetalleComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    NgbModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
