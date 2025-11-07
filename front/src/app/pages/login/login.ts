import { Component } from '@angular/core';
import { LoginFormComponent } from "./login-form/login-form.component";

@Component({
  selector: 'app-login',
  imports: [LoginFormComponent],
  templateUrl: './login.html',
  styleUrl: './login.less',
})
export class Login {
}
