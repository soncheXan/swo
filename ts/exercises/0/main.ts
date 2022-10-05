let nombre:string ="Pepe";
console.log(nombre);
let numero:number = 100;
console.log(numero);
let verdad:boolean = true;
console.log(verdad);

let empleados:{
    nombre:string,
    edad: number,
    status: boolean,
    idiomas:[
        {
            materno:string,
            otros:[string, string]
        }
    ]
} = {
    nombre: "Juan",
    edad: 22,
    status: true,
    idiomas:[
        {
            materno:"Castellano",
            otros:["Inglés", "Chino"]
        }
    ]
}
console.log(empleados.idiomas[0].materno);
