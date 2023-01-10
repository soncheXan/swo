"use strict";
const formulario = document.querySelector('form');
const numeroUno = document.querySelector('#numeroUno');
const numeroDos = document.querySelector('#numeroDos');
formulario.addEventListener('submit', function (e) {
    e.preventDefault();
    alert(parseFloat(numeroUno.value) + parseFloat(numeroDos.value));
});
