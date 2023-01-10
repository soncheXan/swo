// Metodos para arrays

let nombres:string[] = ['Ana', 'Pepe', 'Juan', 'Alicia'];
let nombres2:string[] = ['Eva', 'Tomas', 'Jorge', 'Clara'];
let numeros:number[] = [2, 100, 120, 130];

// 1) forEach() - Recorrer arrays
// nombres.forEach((nombre:string) : void => {
//     console.log(nombre);
// });

// nombres.forEach(function(nombre:string):void{
//     console.log(nombre);
// });

// nombres.forEach(nombre =>{
//     if(nombre == 'Ana')
//         console.log(nombre)
// });

// numeros.forEach(numero => {
//     if(numero >= 100)
//         console.log(numero);
// });

// nombres.forEach( (value, index) => {
//     console.log(index+' '+value);
// });


// 2) concat() - Concatena arrays
// console.log((nombres2.concat(nombres2)));

// 3) filter() - Devuelve un array filtrado bajo unas condiciones
// console.log(numeros.filter((numero:number):boolean => numero >= 100));

// 4) push() - Agrega elementos a un array
// numeros.push(12,23,50);

// 5) join() - Modificar el separador que viene por defecto en los arrays
// console.log(numeros.join('.'));

// 6) slice() - Devuelve un array segmentado bajo unas condiciones
// console.log(nombres.slice(0, nombres.length));

// 7) pop() - Elimina el último elemento de un array
// nombres.pop();

// shift() - Elimina el primer elemento de un array
// nombres.shift();