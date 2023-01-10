const funcionFlecha = ():void => alert('Ejecutando una Arrow Function');

const llamada:HTMLButtonElement = document.querySelector('button')!;

llamada.addEventListener('click', function(){
    funcionFlecha();
});