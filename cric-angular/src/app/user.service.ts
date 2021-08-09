import { Injectable } from '@angular/core';

@Injectable()
export class UserService {

  constructor() {
  }

  public userId: string;
  public token: string;
  public isAdmin: boolean;
}



