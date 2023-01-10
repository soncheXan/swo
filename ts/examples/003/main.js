"use strict";
// Funciones Anónimas
// Almacenar las funciones en variables
let message = function () {
    alert('Hola :)');
};
// message();
// Constructor Función
let prueba = new Function('a', 'b', 'return a+b');
// alert(prueba(4, 5));
// Tres posibles formas de control de errores:
// let boton = document.querySelector('button');
// if(boton != null){
//     boton.addEventListener('click', function(){
//         alert('Has hecho click!')
//     });
// }
// 2
// boton?.addEventListener('click', function(){
//     alert('Has hecho click!')
// });
// 3
let boton = document.querySelector('button');
boton.addEventListener('click', function () {
    alert('Has hecho click!');
});
let cajaTexto = document.querySelector('input');
cajaTexto.addEventListener('keyup', function () {
    console.log(cajaTexto.value);
});
// Funcion Autoejecutable
-function () {
    alert('Testing ...');
}();
// Callbacks (es una función pasada como parámetro a otra)
function suma(num1, num2, cb) {
    cb();
    return num1 + num2;
}
alert(suma(5, 6, function () { alert('Ejecutando el Callback'); }));
// Funciones Predefinidas Temporizadoras
setTimeout(function () {
    console.log('Ejecuntando la primera función');
}, 1000);
setTimeout(function () {
    console.log('Ejecuntando la primera función');
}, 2000);
setInterval(function () {
    console.log(new Date().toLocaleTimeString());
}, 1500);
// Funciones Flecha (sin parametros y sin retorno)
const mensaje = () => {
    console.log('Creando una Arrow Function');
};
// mensaje();
// Funciones Flecha (con parametros y sin retorno)
const pruebita = (texto) => {
    console.log(texto);
};
// pruebita('Creando una Arrow Function con parametros')
// Funciones Flecha (con parametros y con retorno)
const demo = (message) => message;
console.log(demo('Hola qué tal?'));
// Trabajar con formularios
const formulario = document.querySelector('form');
const username = document.querySelector('#username');
const email = document.querySelector('#email');
formulario.addEventListener('submit', function (e) {
    e.preventDefault();
    console.log(username.value);
    console.log(email.value);
});
