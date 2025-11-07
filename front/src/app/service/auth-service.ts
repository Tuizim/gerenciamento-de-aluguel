import { inject, Injectable } from '@angular/core';
import { LoginFormValue } from '../pages/login/interface/loginInterface';
import { Router } from '@angular/router';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  private route = inject(Router)
  KEY = "token"

  public getToken(): string | null {
    return localStorage.getItem(this.KEY);
  }

  public authenticateLogin(loginForm: LoginFormValue) {
    if (loginForm.username && loginForm.password) {
      localStorage.setItem(this.KEY, "foi")
      this.route.navigate(["/welcome"])
    }
  }

  public logout() {
    localStorage.removeItem(this.KEY);
    this.route.navigate(["/login"])
  }
}
