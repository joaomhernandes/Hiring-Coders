//FizzBuzz
//Divisivel por 3 => 'Fizz'.
//Divisivel por 5 => 'Buzz'.
//Divisivel por 3 e 5 =>'FizzBuzz'.
//Se não for um número => 'Não é um numero'.
//Se não for divisivel nem por 3 nem por 5 => Entrada

let resultado = fizzBuzz(11);
console.log(resultado)

function fizzBuzz(entrada){
    if (typeof entrada != 'number')
        return 'Não é um número'
    if ((entrada % 3 ===0) && (entrada % 5 ===0))
        return 'FizzBuzz'
    if (entrada % 3 === 0)
        return 'Fizz'
    if (entrada % 5 ===0)
        return 'Buzz';
    return entrada
}


//Reverse a string

let newStr = "";


function reverseAString(str){
    for (let i = str.length - 1; i>=0; i--){
        newStr += str[i];
    }
    console.log(newStr);
}
let result = reverseAString('Hello Gama Academy')


//Convert Celcius to Fahrenheit

function convertToFahrenheit(value){
    return value * 1.8 + 32
};

let fahrenheit = convertToFahrenheit(-20);
console.log(`O valor em fahrenheit é: ${fahrenheit}`);