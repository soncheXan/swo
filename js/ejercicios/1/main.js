// 1
// Crea una función en javascript que pida un nombre a través de una ventana de entrada
// de datos y que imprima en el html dicho nombre pero transformado a mayúsculas a través de
// una función predefinida.

const transUpperCase = () => {
    let textUC = document.getElementById("text").value;
    document.write(textUC.toUpperCase());
}