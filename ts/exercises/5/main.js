"use strict";
var color;
(function (color) {
    color[color["BLANCO"] = 0] = "BLANCO";
    color[color["NEGRO"] = 1] = "NEGRO";
    color[color["ROJO"] = 2] = "ROJO";
})(color || (color = {}));
;
let array;
let objeto1 = {
    preferencias: color.BLANCO,
    nombre: "Iria"
};
let objeto2 = {
    preferencias: color.ROJO,
    nombre: "Juan"
};
array = [objeto1, objeto2];
document.write("<ul>");
for (const element of array) {
    for (let key in element) {
        if (key === "preferencias")
            document.write("<li>" + element[key] + " => ");
        else
            document.write(element[key] + "</li>");
    }
}
document.write("</ul>");
