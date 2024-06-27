const minimist = require ('minimist')

const args = minimist(process.argv.slice(2))

console.log(args)

console.log(args['Nome'])
console.log(args['Profissão'])