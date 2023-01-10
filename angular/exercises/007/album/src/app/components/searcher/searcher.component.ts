import { Component, OnInit } from '@angular/core';
import { BandService } from 'src/app/services/band.service';

@Component({
  selector: 'app-searcher',
  templateUrl: './searcher.component.html',
  styleUrls: ['./searcher.component.css']
})
export class SearcherComponent implements OnInit {

  bandName:string = "";
  bands:any = [];

  constructor(private bandService:BandService) { }

  ngOnInit(): void {
  }

  show(){this.bandService.searchGroup(this.bandName).subscribe(res=>res === null ? this.bands = "" : this.bands = res)}
}