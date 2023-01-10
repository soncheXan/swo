let sueldoBruto:number = Number(prompt("Introduzca el sueldo bruto:"));
let irpf:number = Number(prompt("Introduzca el porcentaje (%) del IRPF:"));
let ss:number = Number(prompt("Introduzca el porcentaje (%) de la cuota de la SS:"));

function calcularSalario(sueldoBruto:number, irpf:number, ss:number):number{
    return (sueldoBruto - (irpf + ss) * sueldoBruto/100);
}

let salario:number = calcularSalario(sueldoBruto, irpf, ss);
document.write("<h3>Su salario es de "+salario+" €</h3>");