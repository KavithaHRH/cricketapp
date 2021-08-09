import { ActivatedRoute, Router } from '@angular/router';
import { Component, EventEmitter, Input, OnInit } from '@angular/core';
import { CRICKET } from '../../app.constants';
import {HomeService} from '../../helpers/services/home.service';
import {PlayerFilterPipe } from '../../helpers/services/pipes';
import { RegisterService } from 'app/register.service';


@Component({
  selector: 'app-player-list',
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.css'],
  providers: [HomeService],
})
export class PlayerListComponent implements OnInit {
  user: any = {};
  loading = false;

  constructor(
      private route: ActivatedRoute,
      private router: Router,
      private registerService: RegisterService
  ) {
  }

  ngOnInit() {
  }

  // Register Service
  register() {
      this.loading = true;
      if (this.user.isAdmin == null) {
          this.user.isAdmin = false;
      }
      this.registerService.register(this.user)
          .subscribe(
              data => {
                  //this.alertService.success('Registration successful', true);
                  this.router.navigate(['login']);
              },
              error => {
                  console.log(error.error.message);
                  //this.alertService.error(error.error.message);
                  if (error.error.message.includes('User already exist')) {
                      this.router.navigate(['login']);
                  }

                  this.loading = false;
              });
  }
}
