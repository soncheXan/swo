"use strict";
let nombre = prompt("Introduzca su nombre:");
let apellido = prompt("Introduzca su primer apellido:");
let email = prompt("Introduzca su dirección email:");
function imprimir(nombre, apellido, email) {
    document.write("<p>" + nombre + " " + apellido + " tiene la dirección de email: " + email + "</p>");
}
imprimir(nombre, apellido, email);
