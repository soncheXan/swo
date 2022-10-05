// Tipo de dato tupla (array con valores fijos)

let usuarios: [number, string, boolean];

usuarios = [1, 'Pepe', true];

// Tipo de dato enum (sucesión de valores contantes). Podemos cambiar su orden, o asignarlo a un string

enum rol{'ADMIN' = 0, 'USER' = 3, 'GESTOR' = 4}

let personas:{
    nombre:string,
    rol:rol
} = {
    nombre: 'Pepe',
    rol: rol.USER
}
// console.log(personas.rol);

// Tipo de dato unión (permite que las variables puedan se de tipos alternativos)

let individuo: number | string;

individuo = "Gentil";
individuo = 1;

// Tipo de dato any (admite cualquier tipo de dato)

let coches:any[] = [12, 'Seat', 'Ferrari'];

// Tipo de dato undefiend

let numero:number;

// Tipo de dato null

let boton = document.getElementById('bt');
// console.log(boton);

// Tipo de dato void (indicar que una función no tiene un retorno)

function mensage() : string{
    return 'Saludos...';
}
// console.log(mensage());

// Varibles de tipo literal

type browser = 'chrome' | 'firefox' | 'edge';

let persona: {
    nombre:string,
    navegador:browser
} = {
    nombre:'Paco',
    navegador:'firefox'
}

