"use strict";
function init() {
    const newName = document.querySelector('#names');
    const add = document.querySelector('#add');
    let namesArray = [];
    add.addEventListener('click', function () {
        namesArray.push(newName.value);
        newName.value = '';
        if (namesArray.length == 3) {
            alert("Ya ha agregado tres nombres");
            namesArray.forEach((value, index) => document.write("<h4>" + index + " " + value + "<br></h4>"));
        }
    });
}
