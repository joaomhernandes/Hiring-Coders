// Crie um programa que me diga quanto cobrar para vender um notebook usado: 
//o seu custo foi R$3000, por quanto devo vendê-lo descontando 25%?
let valorNotebook = 3000;
let valorDesconto = 25;
console.log(`Devo vender o notebook porR$${valorNotebook*(1-valorDesconto/100)},00`);