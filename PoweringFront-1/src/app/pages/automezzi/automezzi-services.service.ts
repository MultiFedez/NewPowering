import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Automezzi } from 'src/app/interfaces/automezzi';


@Injectable({
  providedIn: 'root'
})
export class AutomezziServicesService {
  private apiUrl = 'http://localhost:8080/poweringdata/automezzo'
  constructor(private http: HttpClient) {}

  getAutomezzi() {
    const url = "http://localhost:8080/poweringdata/automezzo/all";
    return this.http.get<Automezzi[]>(url);
  }

  deleteAutomezzo(id:number){
    const url = `${this.apiUrl}/${id}`;
    return this.http.delete<void>(url);
  }

  creaAutomezzo(a:Automezzi){
    const url = `${this.apiUrl}/`;
    return this.http.post(url,a)
  }
}
