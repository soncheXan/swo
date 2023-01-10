"use strict";
const randomNumber = (input1, input2) => {
    const minimo = parseFloat(input1.value);
    const maximo = parseFloat(input2.value);
    const diferencia = maximo - minimo;
    console.log("<h4>El número random es: " +
        (Math.random() * diferencia + minimo) +
        "</h4>");
};
const formulario = document.querySelector("form");
formulario.addEventListener('submit', function (e) {
    const input1 = document.querySelector('#numUno');
    const input2 = document.querySelector('#numDos');
    e.preventDefault();
    randomNumber(input1, input2);
});
