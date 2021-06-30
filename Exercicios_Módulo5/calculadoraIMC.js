// Vamos criar uma função que calcula o IMC de uma pessoa, dado a altura em m e a massa em kg.

function calculoIMC(altura,peso){
return peso/Math.pow(altura,2)
}

let peso = 80;
let altura = 1.75;
let imc = calculoIMC(altura,peso);
console.log(`Uma pessoas com ${altura} m de altura e ${peso} Kg, tem um IMC de ${imc}`);