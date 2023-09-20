import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Hotel} from './hotel.model';

@Injectable({
    providedIn: 'root'
})
export class HotelService {
    private apiUrl = 'http://localhost:8080/api/hoteles';

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
