"use strict";
const nidoCallbacks = (Uno, Dos) => {
    Uno();
    Dos();
};
nidoCallbacks(function () { alert('Primer Callback'); }, function () { alert('Segundo Callback'); });
