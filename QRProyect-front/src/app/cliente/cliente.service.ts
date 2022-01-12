import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/Observable';
import { of } from 'rxjs/Observable/of';
import { HttpClient } from '@angular/common/http'

@Injectable()
export class ClienteService {

  constructor(private http: HttpClient) { }

  getClientes (): Observable<Object[]> {

  }

}
