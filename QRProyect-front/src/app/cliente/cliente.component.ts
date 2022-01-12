import { Component, OnInit } from '@angular/core';
import { Cliente } from './cliente';

@Component({
  selector: 'cliente-app',
  templateUrl: './cliente.component.html'
})
export class ClienteComponent implements OnInit {

  clientes: Cliente[] = [
    {id: 1, pais: 'colombia', departamento: 'quindio', ciudad: 'armenia',
     nombreMascota: 'franchesco', especie: 'perro', raza: 'pequeña',
     sexo: 'hembra'}
  ]

  constructor() { }

  ngOnInit() {

  }
}
