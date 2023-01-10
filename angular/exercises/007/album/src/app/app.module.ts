import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { SavealbumComponent } from './components/savealbum/savealbum.component';
import { SavebandComponent } from './components/saveband/saveband.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http'
import { FormsModule } from '@angular/forms';
import { SearcherComponent } from './components/searcher/searcher.component';

const routes:Routes = [
  {path: 'save-band', component:SavebandComponent},
  {path: 'save-album', component:SavealbumComponent},
  {path: 'search', component:SearcherComponent}
]

@NgModule({
  declarations: [
    AppComponent,
    SavealbumComponent,
    SavebandComponent,
    SearcherComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})

export class AppModule { }
