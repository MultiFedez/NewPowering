import { Component, OnInit } from '@angular/core';
import { Filiali } from 'src/app/interfaces/filiali';
import { FlilaliServicesService } from './flilali-services.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-filiali',
  templateUrl: './filiali.component.html',
  styleUrls: ['./filiali.component.scss']
})
export class FilialiComponent implements OnInit {
  filiali: Filiali[] = [];
  filiale: Filiali = {
    id: 0,
    indirizzo: '',
    citta: '',
    cap: ''
  };
  form!: FormGroup;

  constructor(private filialiSvc:FlilaliServicesService) {}

  ngOnInit() {
    this.getFiliali();
    this.form = new FormGroup({
      indirizzo:new FormControl("",Validators.required),
      citta:new FormControl("",Validators.required),
      cap:new FormControl("",Validators.required)
     })
   }

   onRefresh() {
    // Refresh the page
    location.reload();
  }

   getFiliali(){
     this.filialiSvc.getFiliali().subscribe(
       (resp) => {
         this.filiali = resp;
       },(err) =>{
         console.log(err.error.message);
       }
     )
   }

   deleteFiliale(id:number){
    this.filialiSvc.deleteFiliale(id)
    .subscribe(
      data => {
        let f = this.filiali.findIndex(f => f.id === id)
        this.filiali.splice(f,1)
    })
  }

  CreaFiliale(){
    this.filialiSvc.creaFiliale(this.form.value).subscribe(
    )
  }
}
