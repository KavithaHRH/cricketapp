import { Component, OnInit } from '@angular/core';
import { HomeService } from 'app/helpers/services/home.service';

@Component({
  selector: 'app-old-matches',
  templateUrl: './old-matches.component.html',
  styleUrls: ['./old-matches.component.css']
})
export class OldMatchesComponent implements OnInit {
  oldMatches:any[];
  constructor(private homeservice: HomeService) { }

  ngOnInit() {
    //get new matches
    this.homeservice.getOldMaches().subscribe((resp)=>{
      console.log("old match",resp);
      this.oldMatches = resp.data;

    },

    (err)=>{
      console.log("falied to get response from the srever !");
    })
    
  }

}
