import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HabitaionComponent } from './habitaion.component';

describe('HabitaionComponent', () => {
  let component: HabitaionComponent;
  let fixture: ComponentFixture<HabitaionComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [HabitaionComponent]
    });
    fixture = TestBed.createComponent(HabitaionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
