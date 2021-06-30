//pegar o input 

//Se não, mostra todos os livros em ordem crescente pela quantidade de páginas

const livros = require('./database')
const readline = require('readline-sync')

const entradaInicial = readline.question('Deseja buscar um livro? S/N: ')

if (entradaInicial.toLocaleUpperCase() === 'S') {
    //Se for Sim, mostra as categorias disponiveis, pergunta qual categoria ela escolhe
    console.log('Essas são as categorias disponiveis:')
    console.log('Produtividade', '/Historia brasileira','/Americas','/Estilo de vida','/Tecnologia')

    const entradaCategoria = readline.question('Qual categoria você escolhe:')

    const retorno = livros.filter(livro => livro.categoria === entradaCategoria.toLocaleUpperCase())

    console.table(retorno)
}else{
    //Se não, mostra todos os livros em ordem crescente pela quantidade de páginas
    const livrosOrdenados = livros.sort((a,b) => a.paginas - b.paginas)
    console.log('Esses são todos os livros disponíveis')
    console.table(livrosOrdenados)
}