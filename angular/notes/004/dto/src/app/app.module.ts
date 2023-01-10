import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { RouterModule, Routes} from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import {HttpClientModule} from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { FormularioComponent } from './components/formulario/formulario.component';
import { UpdateComponent } from './components/update/update.component';
import { BuscadorComponent } from './components/buscador/buscador.component';

const rutas:Routes = [
  {path: 'home', component:HomeComponent},
  {path: 'form', component:FormularioComponent},
  {path: 'upadate/:id', component:UpdateComponent},
  {path: 'search', component:BuscadorComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    FormularioComponent,
    UpdateComponent,
    BuscadorComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(rutas),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
