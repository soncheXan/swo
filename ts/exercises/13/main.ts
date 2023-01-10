const emptyFieldValidator:Function = (value:HTMLInputElement):void => {
    if(value.value == '')
        alert('El campo username es obligatorio');
    else
    notANumberValidator(value);
}

const notANumberValidator:Function = (input:HTMLInputElement):void => {
    const numbers:string[] = ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    let invalido:boolean = true;

    input.value.split('').forEach((value:string):void => {
        let coincidencias:number = 0;
        numbers.forEach((numero:string):void => {
            if(value !== numero) coincidencias ++;
            }
        );

        if(coincidencias == 10) invalido = false;
    });

    if(invalido)    alert('El campo username no puede ser un número');
};

const form:HTMLFormElement = document.querySelector('form')!;
const username:HTMLInputElement = document.querySelector('#username')!;

form.addEventListener('submit', function():void{
    emptyFieldValidator(username);
});
