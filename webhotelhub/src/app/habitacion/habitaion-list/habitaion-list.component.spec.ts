import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HabitaionListComponent } from './habitaion-list.component';

describe('HabitaionListComponent', () => {
  let component: HabitaionListComponent;
  let fixture: ComponentFixture<HabitaionListComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HabitaionListComponent]
    });
    fixture = TestBed.createComponent(HabitaionListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
