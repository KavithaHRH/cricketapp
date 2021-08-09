import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class LoginService {

  private loginUrl: string;
  constructor(
      private http: HttpClient
  ) {
      this.loginUrl = 'http://localhost:8082/user/login';
  }
  login(user: any): Observable<any> {
      return this.http.post<any>(this.loginUrl, user);
  }
}



