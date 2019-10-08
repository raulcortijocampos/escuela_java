import { Injectable } from '@angular/core';
import { Hero } from './model/hero';
import {HEROES} from './model/array-heros';
import { MessageService } from './message.service';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  arrayHeroes: Hero[];

  constructor(private messageSrv: MessageService, private heroSrv: HeroService) { 
    this.arrayHeroes = HEROES;
  }

  getHeroes() : Hero[]{
    this.messageSrv.add("HeroService: capturando heroes");
    return HEROES;
  }

  getHero(id: number): Hero{
    
    let hero = this.arrayHeroes.find( (hero) => {return hero.id === id} );
    return hero;
  };

  addHero(/*id: string,*/ nombre: string, ruta: string ) :void{
    let nuevoHeroe = new Hero();
    nuevoHeroe.id = 1 + this.arrayHeroes.length;
    //nuevoHeroe.id= parseInt(id);
    nuevoHeroe.name=nombre;
    nuevoHeroe.imagen=ruta;

    this.arrayHeroes.push(nuevoHeroe);
  }
}
