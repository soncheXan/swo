import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { ListadepartamentosComponent } from './components/listadepartamentos/listadepartamentos.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule} from '@angular/common/http';
import { DepartamentoComponent } from './services/departamento/departamento.component';
import { DepartamentoformComponent } from './components/departamentoform/departamentoform.component';
import { EmpleadoComponent } from './services/empleado/empleado.component';
import { FormempleadoComponent } from './components/formempleado/formempleado.component';
const rutas:Routes = [
  {path:'departamentos', component: ListadepartamentosComponent}
  
]

@NgModule({
  declarations: [
    AppComponent,
    ListadepartamentosComponent,
    DepartamentoComponent,
    DepartamentoformComponent,
    EmpleadoComponent,
    FormempleadoComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(rutas),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
