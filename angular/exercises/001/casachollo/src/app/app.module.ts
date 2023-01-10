import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { BodyComponent } from './component/body/body.component';
import { BuscarComponent } from './component/body/buscar/buscar.component';
import { FooterComponent } from './component/footer/footer.component';
import { RedesSocialesComponent } from './component/footer/redes-sociales/redes-sociales.component';
import { LegalPagesComponent } from './component/footer/legal-pages/legal-pages.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BodyComponent,
    BuscarComponent,
    FooterComponent,
    RedesSocialesComponent,
    LegalPagesComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
