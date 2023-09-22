import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, Router} from '@angular/router';

import {HotelService} from '../hotel.service';
import {Hotel} from '../hotel.model';

@Component({
    selector: 'app-hotel',
    templateUrl: './hotel.component.html',
    styleUrls: ['./hotel.component.css']
})

export class HotelComponent implements OnInit {

    hotel: Hotel = new Hotel();

    constructor(
        private route: ActivatedRoute,
        private router: Router,
        private hotelService: HotelService
    ) {
    }


    ngOnInit(): void {
        /*    const id =  +this.route.snapshot.paramMap.get('id');
            if (id) {
                this.hotelService.getHotel(id).subscribe(data => {
                    this.hotel = data;
                });
            }*/
    }


    onSave(): void {
        if (this.hotel.id) {
            this.hotelService.updateHotel(this.hotel).subscribe(() => {
                this.router.navigate(['/hoteles']);
            });
        } else {
            this.hotelService.createHotel(this.hotel).subscribe(() => {
                this.router.navigate(['/hoteles']);
            });
        }
    }
}
