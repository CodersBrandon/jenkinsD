import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HabitaionListComponent } from './habitacion/habitaion-list/habitaion-list.component';
import { HabitaionComponent } from './habitacion/habitaion/habitaion.component';
import { HotelListComponent } from './hotel/hotel-list/hotel-list.component';
import { HotelComponent } from './hotel/hotel/hotel.component';

@NgModule({
  declarations: [
    AppComponent,
    HabitaionListComponent,
    HabitaionComponent,
    HotelListComponent,
    HotelComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
