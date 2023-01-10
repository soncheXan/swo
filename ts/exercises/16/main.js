"use strict";
const showArray = (array) => {
    var _a;
    const ul = document.createElement("ul");
    array.forEach((element) => {
        const li = document.createElement("li");
        const nombre = document.createTextNode(element);
        ul.appendChild(li);
        li.appendChild(nombre);
    });
    (_a = document.getElementById("body")) === null || _a === void 0 ? void 0 : _a.appendChild(ul);
};
function init() {
    const arrayName = ["Rafa", "Carlos", "Raquel"];
    const button = document.querySelector("#remove");
    showArray(arrayName);
    button.addEventListener('click', function () {
        let arrayNameCopy = ["Rafa", "Carlos", "Raquel"];
        let randomNumber = Math.round(Math.random() * (arrayName.length - 1));
        arrayNameCopy.splice(randomNumber, 1);
        showArray(arrayNameCopy, randomNumber);
    });
}
