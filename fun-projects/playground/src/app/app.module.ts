import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TextEnlargingImageComponent } from './text-enlarging-image/text-enlarging-image.component';

@NgModule({
  declarations: [
    AppComponent,
    TextEnlargingImageComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
