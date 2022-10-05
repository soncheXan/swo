
enum color { BLANCO, NEGRO, ROJO };

let array:Object[];

let objeto1: {
    preferencias: color,
    nombre: string
} = {
    preferencias: color.BLANCO,
    nombre: "Iria"
}

let objeto2: {
    preferencias: color;
    nombre: string
} = {
    preferencias: color.ROJO,
    nombre: "Juan"
}

array = [objeto1, objeto2];

document.write("<ul>");
for (const element of array) {
    for (let key in element) {
        if(key === "preferencias")
            document.write("<li>" + element[key] + " => ");
        else
            document.write(element[key] + "</li>");
    }
}

document.write("</ul>");