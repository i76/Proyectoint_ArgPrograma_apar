import { Component, OnInit } from '@angular/core';
import { experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  experiencia: any;

  id: String='';
  empresa: String='';
  tarea: String='';
  duracion: String='';


  

  constructor(public experienciaService: ExperienciaService) { }

  ngOnInit(): void {
    this.experienciaService.getExperiencia().subscribe(dataExperiencia =>{console.log(dataExperiencia); this.experiencia = dataExperiencia})
    
  }

}

 


