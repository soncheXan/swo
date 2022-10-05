// Funciones sin retorno y sin parametros

function message():void{
    console.log('Hola');
}
// message();

// Funciones sin retorno y con parametro

function dameNOmbre(nombre:string): void{
    console.log(nombre);
}

function demo(numero:number): number{
    return numero;
}

// Variables como funciones

function demostracion(nombre:string):string{
    return nombre;
}
let prueba:Function = demostracion;
// console.log(prueba('Juan'));