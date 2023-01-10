let nombre:string | null = prompt("Introduzca su nombre:");
let apellido:string | null = prompt("Introduzca su primer apellido:");
let email:string | null = prompt("Introduzca su dirección email:");

function imprimir(nombre:string | null, apellido:string | null, email:string | null) : void{
    document.write("<p>"+nombre+" "+apellido+" tiene la dirección de email: "+email+"</p>");
}

imprimir(nombre, apellido, email);