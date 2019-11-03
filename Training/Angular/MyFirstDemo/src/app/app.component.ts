import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //   title = 'MyFirstDemo';
  //   mynum:number = 10;
  //
  //   fruits=['apple','orange','mango'];
  //   // test():string{
  //   //   return "TESTING FUNCTION";
  //   // }
  // //------------------------------NO METHOD OVERLOADING IN TYPESCRIPT------------------------------
  //   test(n1:number, n2:number):number{
  //     return n1*n2;
  //   }
  //
  //   testAlert(){
  //     alert('test');
  //   }
  //
  //   countries=['Select Country','India','USA','UK'];
  //   cities=[['Select City'],['Agartala','Kashmir','Bangalore'],['Boston','Manhattan','NY'],['London','Manchester','Birmingham']];
  //
  //   fillData(){
  //     //selectedidx=document.getElementById('country');
  //     alert(document.getElementById('country'));
  //   }

  num1ToChild;
  num2ToChild;
  sum;
  sendChild() {
    this.sum = parseInt(this.num1ToChild)+parseInt(this.num2ToChild);
  }
}
