let array:string[];
array = [
    "Martín",
    "Marcos",
    "Pedro",
    "Edu",
    "Agus",
    "Jeremy"
];

for (const nombre of array) {
    document.write(
        "<li>"+nombre+"</li>"
    );
}