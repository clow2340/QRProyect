export class Cliente {
  id:Number;
  pais: string;
  departamento: string;
  ciudad:string;
  nombreMascota:string;
  //fechaNacimiento:Date;
  especie:string;
  raza:string;
  sexo:string;

  /**
  Construtor del modelo cliente en frontend
  **/
  constructor(id:number, pais: string, departamento: string, ciudad:string,
  nombreMascota:string, especie:string, raza:string, sexo:string){
    this.id=id;
    this.pais=pais;
    this.departamento=departamento;
    this.ciudad=ciudad;
    this.nombreMascota=nombreMascota;
    this.especie=especie;
    this.raza=raza;
    this.sexo=sexo;
  }

}
