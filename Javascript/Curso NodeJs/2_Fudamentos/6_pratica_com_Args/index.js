//externo
const minimist = require ('minimist')
//interno
const soma = require('./soma')

const args = minimist(process.argv.slice(2))

console.log('args',args)

const a = parseInt(args['a'])
const b = parseInt(args['b'])

soma(a,b)

