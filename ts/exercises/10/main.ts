const randomNumber = (input1:HTMLInputElement, input2:HTMLInputElement):void => {
    
    const minimo:number = parseFloat(input1.value);
    const maximo:number = parseFloat(input2.value);
    const diferencia:number = maximo - minimo;
    
    console.log("El número random es: "+
                   (Math.random()*diferencia + minimo));
  
}

const formulario:HTMLFormElement = document.querySelector("form")!;

formulario.addEventListener('submit', function(e){
    const input1:HTMLInputElement = document.querySelector('#numUno')!;
    const input2:HTMLInputElement = document.querySelector('#numDos')!;
    e.preventDefault();
    randomNumber(input1, input2);
});

