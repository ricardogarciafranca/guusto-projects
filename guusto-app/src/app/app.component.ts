import { Component } from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'guusto-app';

  private headers = new HttpHeaders({'Content-Type': 'application/json'});

  constructor(private http: HttpClient) {

    const req = this.http.get('http://localhost:8080/merchants', {headers: this.headers}).subscribe(data => {

    }, (error) => {

    });

  }


}
