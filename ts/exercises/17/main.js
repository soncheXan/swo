"use strict";
const input = document.querySelector("#submit");
const cantidad = document.querySelector("#cantidad");
const diametro = document.querySelector("#diametro");
const peso = document.querySelector("#peso");
let taller1 = {
    cantidad: 10,
    diametro: 40,
    peso: 500,
    setProperties(cantidad, diametro, peso) {
        this.cantidad = cantidad,
            this.diametro = diametro,
            this.peso = peso;
    }
};
input.addEventListener('click', function () {
    taller1.setProperties(parseInt(cantidad.value), parseInt(diametro.value), parseInt(peso.value));
    console.log("Cantidad: " + taller1.cantidad +
        "\nDiametro: " + taller1.diametro +
        "\nPeso: " + taller1.peso);
});
