"use strict";
const emptyFieldValidator = (value) => {
    if (value.value == '')
        alert('El campo username es obligatorio');
    else
        notANumberValidator(value);
};
const notANumberValidator = (input) => {
    const numbers = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"];
    let invalido = true;
    input.value.split('').forEach((value) => {
        let coincidencias = 0;
        numbers.forEach((numero) => {
            if (value !== numero)
                coincidencias++;
        });
        if (coincidencias == 10)
            invalido = false;
    });
    if (invalido)
        alert('El campo username no puede ser un número');
};
const form = document.querySelector('form');
const username = document.querySelector('#username');
form.addEventListener('submit', function () {
    emptyFieldValidator(username);
});
