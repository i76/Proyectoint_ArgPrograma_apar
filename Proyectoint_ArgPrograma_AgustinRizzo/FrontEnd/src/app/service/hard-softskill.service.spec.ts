import { TestBed } from '@angular/core/testing';

import { HardSoftskillService } from './hard-softskill.service';

describe('HardSoftskillService', () => {
  let service: HardSoftskillService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HardSoftskillService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
