import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Filiali } from 'src/app/interfaces/filiali';

@Injectable({
  providedIn: 'root'
})
export class FlilaliServicesService {
  private apiUrl = 'http://localhost:8080/poweringdata/filiale'
  constructor(private http: HttpClient) {}

  getFiliali() {
    const url = "http://localhost:8080/poweringdata/filiale/all";
    return this.http.get<Filiali[]>(url);
  }

  deleteFiliale(id:number){
    const url = `${this.apiUrl}/${id}`;
    return this.http.delete<void>(url);
  }

  creaFiliale(f:Filiali){
    const url = `${this.apiUrl}/`;
    return this.http.post(url,f)
  }
}
