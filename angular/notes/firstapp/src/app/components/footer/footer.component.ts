import { Component, OnInit } from '@angular/core';
import { FormBuilder } from "@angular/forms";

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  username!:string;

  constructor(private formBuilder: FormBuilder) {
    this.form = formBuilder.group({
      username:Array('')
    })
  }

  ngOnInit(): void {
  }
  enviarFormulario(){
    console.log(this.username);
  }

}
