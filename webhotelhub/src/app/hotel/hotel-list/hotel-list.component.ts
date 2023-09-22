import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import {Hotel} from "../hotel.model";
import {HotelService} from "../hotel.service";

@Component({
    selector: 'app-hotel-list',
    templateUrl: './hotel-list.component.html',
    styleUrls: ['./hotel-list.component.css']
})
export class HotelListComponent implements OnInit {
    hoteles: Hotel[] = [];

    //
    constructor(private hotelService: HotelService, private router:Router) {
    }

    ngOnInit(): void {
        //console.log('cargando....')
        this.hotelService.getHoteles().subscribe(data => {
            this.hoteles = data;
        });
    }

    onDelete(id: number): void {
        /*
        this.hotelService.deleteHotel(id).subscribe(() => {
            // @ts-ignore
            this.hoteles = this.hoteles.filter(hotel => hotel.id !== id);
        });
        */
    }
}
