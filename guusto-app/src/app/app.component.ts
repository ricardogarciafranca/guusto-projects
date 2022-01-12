import {Component} from '@angular/core';
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {environment} from "../environments/environment";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'guusto-app';

  merchants: any = [];
  merchantsName: any = [];
  merchantsCountry: any = [];

  private headers = new HttpHeaders({'Content-Type': 'application/json', 'Access-Control-Allow-Origin': '*'});

  constructor(private http: HttpClient) {

    this.http.get(environment.api, {headers: this.headers}).subscribe(data => {
      this.merchants = data;
    }, (error) => {
        if(error.url.includes('login')) {
          window.open(environment.login);
        }
    });

    this.http.get(environment.api + '/name/amazon', {headers: this.headers}).subscribe(data => {
      this.merchantsName = data;
    }, (error) => {
      if(error.url.includes('login')) {
        window.open(environment.login);
      }
    });

    this.http.get(environment.api + '/country/usa', {headers: this.headers}).subscribe(data => {
      this.merchantsCountry = data;
    }, (error) => {
      if(error.url.includes('login')) {
        window.open(environment.login);
      }
    });

  }


}
