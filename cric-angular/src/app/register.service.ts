import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class RegisterService {

  private registerUrl: string;

  constructor(
      private http: HttpClient
  ) {
      this.registerUrl = 'http://localhost:8082/user/register';
  }

  register(user: any): Observable<any> {
      return this.http.post<any>(this.registerUrl, user);
  }
}



