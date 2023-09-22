import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { HotelListComponent } from './hotel/hotel-list/hotel-list.component';
import { HotelComponent } from './hotel/hotel/hotel.component';
//import { HotelDetailComponent } from './hotel/hotel-detail/hotel-detail.component';
//import { HotelEditComponent } from './hotel/hotel-edit/hotel-edit.component';


const routes: Routes = [
  {path : 'hoteles',component:HotelListComponent},
  { path: 'hotel', component: HotelComponent },
  //{ path: 'hoteles/:id', component: HotelDetailComponent },
  //{ path: 'hoteles/editar/:id', component: HotelEditComponent },
  //{ path: 'hoteles/crear', component: HotelEditComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
