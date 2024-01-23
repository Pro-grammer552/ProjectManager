import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private http:HttpClient) { }

  add_project(obj:any)
  {
    return this.http.post('http://localhost:8765/projectcatogory/save',obj);
  }
  project_lists()
  {
    return this.http.get('http://localhost:8765/projectcatogory/getAllinfo');
  }
  order_project_list(obj: any) {

    console.log(obj)
    const apiUrl = `http://localhost:8765/projectcatogory/sort?sortBy=${obj}`;
   
    return this.http.get(apiUrl, obj);
  }
  

  change_status(id: number, status: any) {
    const obj = { 'psid': id, 'psname': status }; 
    return this.http.post('http://localhost:8765/projectcatogory/changeStatus', obj);
  }
  project_count(){
    return this.http.get('http://localhost:8765/projectcatogory/projectcount');
  }
  chart_count(): Observable<any[][]> {
    return this.http.get<any[][]>('http://localhost:8765/projectcatogory/summary');
  }
} 


