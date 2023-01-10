const input:HTMLInputElement = document.querySelector('#entrada')!;

input.addEventListener('keyup', function(){
    let div:any = document.querySelector('#salida');
    div != null ? (div.textContent = input.value) : '';
});