const nidoCallbacks = (Uno:Function, Dos:Function):void =>{
    Uno();
    Dos();
}

nidoCallbacks(
    function(){alert('Primer Callback')},
    function(){alert('Segundo Callback')}
    );