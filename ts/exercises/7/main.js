"use strict";
let sueldoBruto = Number(prompt("Introduzca el sueldo bruto:"));
let irpf = Number(prompt("Introduzca el porcentaje (%) del IRPF:"));
let ss = Number(prompt("Introduzca el porcentaje (%) de la cuota de la SS:"));
function calcularSalario(sueldoBruto, irpf, ss) {
    return (sueldoBruto - (irpf + ss) * sueldoBruto / 100);
}
let salario = calcularSalario(sueldoBruto, irpf, ss);
document.write("<h3>Su salario es de " + salario + " €</h3>");
