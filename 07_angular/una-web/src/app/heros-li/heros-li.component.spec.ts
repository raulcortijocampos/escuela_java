import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HerosLiComponent } from './heros-li.component';

describe('HerosLiComponent', () => {
  let component: HerosLiComponent;
  let fixture: ComponentFixture<HerosLiComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HerosLiComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HerosLiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
