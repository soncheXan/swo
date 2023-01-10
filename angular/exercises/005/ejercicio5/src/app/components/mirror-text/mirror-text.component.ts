import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-mirror-text',
  templateUrl: './mirror-text.component.html',
  styleUrls: ['./mirror-text.component.css']
})
export class MirrorTextComponent implements OnInit {

  inputTxt:string = "";
  outputTxt:string = "";

  constructor() { }

  ngOnInit(): void {
  }

  mirrorText(): void {
    this.outputTxt = this.inputTxt;
  }
}
