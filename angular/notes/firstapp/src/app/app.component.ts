import { Component } from '@angular/core';
import { reduce } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title:string = 'firstapp';
  nombre:string = 'Juan';
  apellidos:string = 'Airado Vilar';
  edad:number = 25;

  aficiones={
    deportes: 'Natación'
  }

  nombres:string[] = ['Juan', 'Pablo', 'Clara'];
  pagado:boolean = true;
  color:string = 'azul';

  ocupado:boolean = false;
  backgroundColor:string = 'powderblue';
  textColor:string = 'brown';
  textAlign:string = 'right';
}
