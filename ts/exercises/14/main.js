"use strict";
const input = document.querySelector('#entrada');
input.addEventListener('keyup', function () {
    let div = document.querySelector('#salida');
    div != null ? (div.textContent = input.value) : '';
});
