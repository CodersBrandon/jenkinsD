import {Component, OnInit} from '@angular/core';
import {Hotel} from "../hotel.model";
import {HotelService} from "../hotel.service";

@Component({
    selector: 'app-hotel-list',
    templateUrl: './hotel-list.component.html',
    styleUrls: ['./hotel-list.component.css']
})
export class HotelListComponent implements OnInit {
    hoteles: Hotel[] = [];

    constructor(private hotelService: HotelService) {
    }

    ngOnInit(): void {
        this.hotelService.getHoteles().subscribe(data => {
            this.hoteles = data;
        });
    }

    onDelete(id: number): void {
        this.hotelService.deleteHotel(id).subscribe(() => {
            // @ts-ignore
            this.hoteles = this.hoteles.filter(hotel => hotel.id !== id);
        });
    }
}
