
import { Automezzi } from './../../interfaces/automezzi';
import { HttpClient } from '@angular/common/http';
//import { AutomezziServicesService } from './automezzi-services.service';
import { Component, Input, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { AutomezziServicesService } from './automezzi-services.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';


@Component({
  selector: 'app-automezzi',
  templateUrl: './automezzi.component.html',
  styleUrls: ['./automezzi.component.scss']
})
export class AutomezziComponent implements OnInit {

  automezzi: Automezzi[] = [];
  automezzo: Automezzi = {
    id: 0,
    targa: '',
    marca: '',
    modello: ''
  };
  form!: FormGroup;

  constructor(private autoSvc:AutomezziServicesService) {}

  ngOnInit() {
   this.getAutomezzi();
   this.form = new FormGroup({
    targa:new FormControl("",Validators.required),
    marca:new FormControl("",Validators.required),
    modello:new FormControl("",Validators.required)
   })
  }

  onRefresh() {
    // Refresh the page
    location.reload();
  }

  getAutomezzi(){
    this.autoSvc.getAutomezzi().subscribe(
      (resp) => {
        this.automezzi = resp;
      },(err) =>{
        console.log(err.error.message);
      }
    )
  }

  deleteAutomezzo(id:number){
    this.autoSvc.deleteAutomezzo(id)
    .subscribe(
      data => {
        let a = this.automezzi.findIndex(a => a.id === id)
        this.automezzi.splice(a,1)
    })
  }

  CreaAutomezzo(){
    this.autoSvc.creaAutomezzo(this.form.value).subscribe(
    )
  }
}
