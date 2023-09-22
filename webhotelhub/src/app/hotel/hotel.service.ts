import {HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import {Observable} from 'rxjs';
import {Hotel} from './hotel.model';
import {environment} from "../../environments/environment";

@Injectable({
    providedIn: 'root'
})
export class HotelService {

    private apiUrl = environment.apiUrl + 'hoteles';

    constructor(private http: HttpClient) {
    }

    getHoteles(): Observable<Hotel[]> {
        return this.http.get<Hotel[]>(this.apiUrl);
    }

    getHotel(id: number): Observable<Hotel> {
        return this.http.get<Hotel>(`${this.apiUrl}/${id}`);
    }

    createHotel(hotel: Hotel): Observable<Hotel> {
        return this.http.post<Hotel>(this.apiUrl, hotel);
    }

    updateHotel(hotel: Hotel): Observable<Hotel> {
        return this.http.put<Hotel>(`${this.apiUrl}/${hotel.id}`, hotel);
    }

    deleteHotel(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
    }
}
