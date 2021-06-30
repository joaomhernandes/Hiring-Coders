// Utilizando os conceitos que estudamos, vamos criar um programa que irá nos informar os dias de aula para a nossa turma.

let diaDaSemana = "Quarta"

switch(diaDaSemana.toUpperCase()){
    case("SEGUNDA"):
    console.log(`Hoje é ${diaDaSemana} então teremos aula!`)
    break
    case("TERÇA"):
    console.log(`Hoje é ${diaDaSemana} então teremos aula!`)
    break
    case("QUARTA"):
    console.log(`Hoje é ${diaDaSemana} então teremos aula!`)
    break
    case("QUINTA"):
    console.log(`Hoje é ${diaDaSemana} então teremos aula!`)
    break
    case("SEXTA"):
    console.log(`Hoje é ${diaDaSemana} então teremos aula!`)
    break
    default:
    console.log(`Hoje é ${diaDaSemana} então não teremos aula. Bom fim de semana!`)
}