import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { educacion } from '../model/educacion.model';



@Injectable({
  providedIn: 'root'
})


export class EducacionService {
  
  URL = 'https://aparback.herokuapp.com/educacion/';

  constructor(private httpClient : HttpClient) { }

  public lista(): Observable<educacion[]>{
    return this.httpClient.get<educacion[]>(this.URL+'lista');

  }

  public detail(id: number): Observable<educacion>{
    return this.httpClient.get<educacion>(this.URL + `detail/${id}`);
  }

  public save(educacion: educacion): Observable<any>{
    return this.httpClient.post<any>(this.URL + 'create', educacion);
  }

  public update(id: number, educacion: educacion): Observable<any>{
    return this.httpClient.put<any>(this.URL + `update/${id}`, educacion);
  }

  public delete(id: number): Observable<any>{
    return this.httpClient.delete<any>(this.URL + `delete/${id}`);
  }
}




  
  
