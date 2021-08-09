import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { LoginService } from 'app/login.service';
import { UserService } from 'app/user.service';
import { HomeService} from '../../helpers/services/home.service';
// import { PipeTransform, Pipe } from '@angular/core';
// import { KeysPipe } from '../../helpers/services/pipes';

@Component({
  selector: 'app-player',
  templateUrl: './player.component.html',
  styleUrls: ['./player.component.css']
})
export class PlayerComponent implements OnInit {
  user: any = {};
  loading = false;

  constructor(
      private route: ActivatedRoute,
      private router: Router,
      private loginService: LoginService,
      private userService: UserService
  ) {
  }

  ngOnInit() {
  }

  // login service
  login() {
      this.loading = true;
      this.loginService.login(this.user)
          .subscribe(
              data => {
                  this.userService.userId = data.userId;
                  this.userService.token = data.token;
                  this.userService.isAdmin = data.isAdmin;
                  sessionStorage.setItem('accessToken', data.token);
                  sessionStorage.setItem('userId', data.firstName);
                  sessionStorage.setItem('isAdmin', data.isAdmin);
                  this.router.navigate(['dashboard']);
              },
              error => {
                  // this.alertService.error(error.error.message);
                  alert('Invalid Credentials');
                  this.loading = false;
              });
  }

}
