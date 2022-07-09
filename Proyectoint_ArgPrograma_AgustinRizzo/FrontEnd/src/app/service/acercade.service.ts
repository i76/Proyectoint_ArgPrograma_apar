import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { acercade} from '../model/acercade.model';



@Injectable({
  providedIn: 'root'
})
export class AcercadeService {
    URL = 'http://localhost:8080/acercade/';

  
    constructor(private http: HttpClient ) { }

  public getAcercade(): Observable<acercade>{
   return this.http.get<acercade>(this.URL+ 'traer/perfil');
  }
}







 




 