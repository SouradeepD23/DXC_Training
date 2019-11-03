import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent implements OnInit {

  //@Input("uname") uname:string;    //retrieving value from parent, import input from angular/core

  @Input("sum") sum:string;

  constructor() { }

  ngOnInit() {
  }

}
