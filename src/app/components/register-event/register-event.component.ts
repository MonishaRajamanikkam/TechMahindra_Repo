import { Component } from '@angular/core';

@Component({
  selector: 'app-register-event',
  templateUrl: './register-event.component.html',
  styleUrls: ['./register-event.component.css']
})
export class RegisterEventComponent {
  user = { username: '', password: '' };
  registrationError: boolean = false;
  registrationSuccess: boolean = false;

  registerUser() {
    // Simulated API call response (replace with real API call)
    if (this.user.username && this.user.password) {
      this.registrationSuccess = true;
      this.registrationError = false;
    } else {
      this.registrationError = true;
      this.registrationSuccess = false;
    }
  }
}
