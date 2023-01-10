import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  form:FormGroup;

  usernameRequiredMessage:string = '';
  usernameMinLengthMessage:string = '';

  constructor(private formBuilder:FormBuilder) {
    this.form = formBuilder.group({
      username:['', [Validators.required, Validators.minLength(3)]],
      color:[''],
      pesca:[''],
      musica:[''],
      lectura:[''],
      genero:['']
    })
  }

  getData():void {

    // console.log(this.form.get('username')?.value);
    // console.log(this.form.getRawValue().color);
    // console.log(this.form.getRawValue().lectura ? 'Lectura' : '');
    // console.log(this.form.getRawValue().musica ? 'Música' : '');
    // console.log(this.form.getRawValue().pesca ? 'Pesca' : '');
    // console.log(this.form.getRawValue().genero);

    // if(this.form.invalid){
    //   alert('El formulario no es válido');
    // }else
    //   alert('El formulario es válido');

    if(this.form.get('username')?.hasError('required')){
      this.usernameRequiredMessage = 'El campo es requerido';
      console.log(this.usernameRequiredMessage);
    }
    if(this.form.get('username')?.hasError('minlength')){
      this.usernameMinLengthMessage = 'El campo es demasiado corto';
      console.log(this.usernameMinLengthMessage);
    }

  }
}
