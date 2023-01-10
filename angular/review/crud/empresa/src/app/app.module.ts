import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { DepartamentoformComponent } from './components/departamentoform/departamentoform.component';

@NgModule({
  declarations: [
    AppComponent,
    DepartamentoformComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
