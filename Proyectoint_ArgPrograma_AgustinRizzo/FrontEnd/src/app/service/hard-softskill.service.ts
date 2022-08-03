import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { HardSoftskill } from '../model/HardSoftskill.model';


@Injectable({
  providedIn: 'root'
})
export class HardSoftskillService {
  URL = 'https://aparback.herokuapp.com/hardsoftskill/';

  constructor(private http: HttpClient) { }

  public getHardSoftskill(): Observable<HardSoftskill[]>{
    return this.http.get<HardSoftskill[]>(this.URL+ 'traer/');
}

}



  






