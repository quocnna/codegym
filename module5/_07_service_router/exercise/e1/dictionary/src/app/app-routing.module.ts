import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ListComponent} from "./list/list.component";
import {DetailComponent} from "./detail/detail.component";

const routes: Routes = [
  {
    path : "list",
    component: ListComponent
  },
  {
    path: "detail/:word",
    component : DetailComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
