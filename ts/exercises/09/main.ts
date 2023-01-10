const formulario:HTMLFormElement = document.querySelector('form')!;
const numeroUno:HTMLInputElement = document.querySelector('#numeroUno')!;
const numeroDos:HTMLInputElement = document.querySelector('#numeroDos')!;

formulario.addEventListener('submit', function(e){
    e.preventDefault();
    alert(parseFloat(numeroUno.value)+parseFloat(numeroDos.value));
});