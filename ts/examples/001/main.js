"use strict";
// Tipo de dato tupla (array con valores fijos)
let usuarios;
usuarios = [1, 'Pepe', true];
// Tipo de dato enum (sucesión de valores contantes). Podemos cambiar su orden, o asignarlo a un string
var rol;
(function (rol) {
    rol[rol["ADMIN"] = 0] = "ADMIN";
    rol[rol["USER"] = 3] = "USER";
    rol[rol["GESTOR"] = 4] = "GESTOR";
})(rol || (rol = {}));
let personas = {
    nombre: 'Pepe',
    rol: rol.USER
};
// console.log(personas.rol);
// Tipo de dato unión (permite que las variables puedan se de tipos alternativos)
let individuo;
individuo = "Gentil";
individuo = 1;
// Tipo de dato any (admite cualquier tipo de dato)
let coches = [12, 'Seat', 'Ferrari'];
// Tipo de dato undefiend
let numero;
// Tipo de dato null
let boton = document.getElementById('bt');
// console.log(boton);
// Tipo de dato void (indicar que una función no tiene un retorno)
function mensage() {
    return 'Saludos...';
}
let persona = {
    nombre: 'Paco',
    navegador: 'firefox'
};
