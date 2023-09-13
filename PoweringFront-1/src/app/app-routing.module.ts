import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AutomezziComponent } from './pages/automezzi/automezzi.component';
import { FilialiComponent } from './pages/filiali/filiali.component';
import { HomeComponent } from './pages/home/home.component';

const routes: Routes = [
  {
    path: '',
    component: HomeComponent
  },
   {
    path: "automezzi",
    component: AutomezziComponent
  },
   {
    path: "filiali",
    component: FilialiComponent
  },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
