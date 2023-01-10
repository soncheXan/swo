"use strict";
const funcionFlecha = () => alert('Ejecutando una Arrow Function');
const llamada = document.querySelector('button');
llamada.addEventListener('click', function () {
    funcionFlecha();
});
