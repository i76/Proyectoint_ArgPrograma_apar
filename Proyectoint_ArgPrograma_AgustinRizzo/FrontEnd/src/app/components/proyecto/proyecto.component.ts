import { Component, OnInit } from '@angular/core';
import { proyecto } from 'src/app/model/proyecto.model';
import { ProyectoService } from 'src/app/service/proyecto.service';


@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})

export class ProyectoComponent implements OnInit {
  public proyecto: proyecto[] = [];
  Proyecto: any;
 
 constructor(public proyectoService: ProyectoService) { }
   
   ngOnInit(): void {
     this.proyectoService.getProyecto().subscribe(datapro => { this.proyecto = datapro;
     });
   }
     
 
 }
