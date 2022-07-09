import { Component, OnInit } from '@angular/core';
import { acercade } from 'src/app/model/acercade.model';
import { persona } from 'src/app/model/persona.model';
import { AcercadeService } from 'src/app/service/acercade.service';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  persona: persona = new persona("", "", ""); 
  acercade: acercade = new acercade("");
  
  constructor(public personaService: PersonaService, public acercadeService: AcercadeService) { }
  

  ngOnInit(): void {
    this.personaService.getPersona().subscribe(data => {this.persona= data});
    this.acercadeService.getAcercade().subscribe(data1 =>{this.acercade= data1});
    console.log(this.persona);
    console.log(this.acercade);
  }

}






  
  