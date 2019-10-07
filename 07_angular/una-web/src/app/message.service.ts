import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class MessageService {
  message: string[] = []; // new Array()

  add(message: string){
    this.message.push(message);
  }
  clear() : void{
    this.message = [];
  }
}
