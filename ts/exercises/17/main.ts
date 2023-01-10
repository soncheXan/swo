interface ITaller {
    cantidad: number,
    diametro: number,
    peso: number,
    setProperties(cantidad: number, diametro: number, peso: number): void;
}

const input: HTMLFormElement = document.querySelector("#submit")!;
const cantidad: HTMLInputElement = document.querySelector("#cantidad")!;
const diametro: HTMLInputElement = document.querySelector("#diametro")!;
const peso: HTMLInputElement = document.querySelector("#peso")!;

let taller1: ITaller = {
    cantidad: 10,
    diametro: 40,
    peso: 500,
    setProperties(cantidad: number, diametro: number, peso: number) {
        this.cantidad = cantidad,
            this.diametro = diametro,
            this.peso = peso;
    }
}

input.addEventListener('click', function (): void {

    taller1.setProperties(parseInt(cantidad.value), parseInt(diametro.value), parseInt(peso.value));

    console.log("Cantidad: " + taller1.cantidad +
        "\nDiametro: " + taller1.diametro +
        "\nPeso: " + taller1.peso);
});
