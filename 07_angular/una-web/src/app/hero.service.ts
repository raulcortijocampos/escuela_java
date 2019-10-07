import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import {HEROES} from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {


  constructor(private messageSrv: MessageService, private heroSrv: HeroService) { }

  getHeroes() : Hero[]{
    this.messageSrv.add("HeroService: capturando heroes");
    return HEROES;
  }

  addHero(/*id: string,*/ nombre: string, ruta: string ) :void{
    let nuevoHeroe = new Hero();
    nuevoHeroe.id = 1 + HEROES.length;
    //nuevoHeroe.id= parseInt(id);
    nuevoHeroe.name=nombre;
    nuevoHeroe.imagen=ruta;

    HEROES.push(nuevoHeroe);
  }
}
