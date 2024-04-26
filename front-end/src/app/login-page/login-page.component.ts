import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent {
  constructor(private router: Router) {}

  openHomePage() {
    // Navigate to the home page using Angular routing
    this.router.navigateByUrl('/getfood');
  }
}
