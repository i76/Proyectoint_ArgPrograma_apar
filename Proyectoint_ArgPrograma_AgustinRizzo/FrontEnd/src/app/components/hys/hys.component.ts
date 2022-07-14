import { Component, OnInit } from '@angular/core';
import { HardSoftskillService } from 'src/app/service/hard-softskill.service';
import { HardSoftskill } from 'src/app/model/HardSoftskill.model';
import { NgCircleProgressModule } from 'ng-circle-progress';

@Component({
  selector: 'app-hys',
  templateUrl: './hys.component.html',
  styleUrls: ['./hys.component.css'],
  providers: [HardSoftskillService]
})
export class HysComponent implements OnInit {
  public hardsoftskill: HardSoftskill[] = [];
  HardsoftSkill: any



  constructor(public HardSoftskillService: HardSoftskillService) { }

  ngOnInit(): void {
    this.HardSoftskillService.getHardSoftskill().subscribe(dataHS => { this.hardsoftskill = dataHS; 
    });
  }


}


