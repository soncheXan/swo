let tupla : [string, number, string];
let cadena1:string = "Hoy es ";
let dia:number = 4;
let cadena2:string = " de Octubre.";

tupla = [cadena1, dia, cadena2];

tupla.forEach(element => {
    console.log(element);
});
