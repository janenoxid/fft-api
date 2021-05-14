import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TextEnlargingImageComponent } from './text-enlarging-image.component';

describe('TextEnlargingImageComponent', () => {
  let component: TextEnlargingImageComponent;
  let fixture: ComponentFixture<TextEnlargingImageComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TextEnlargingImageComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TextEnlargingImageComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
