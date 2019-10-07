import { Component, OnInit } from '@angular/core';
import { HEROES } from '../model/array-heros';
import { Hero } from '../model/hero';



@Component({
  selector: 'app-heros-li',
  templateUrl: './heros-li.component.html',
  styleUrls: ['./heros-li.component.css']
})
export class HerosLiComponent implements OnInit {
   heroes: Hero[];

  constructor() { }

  ngOnInit() {
    this.heroes = HEROES;
  }

}
