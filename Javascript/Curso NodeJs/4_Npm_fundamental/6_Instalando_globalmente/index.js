const _ = require('lodash')

const arr = [1,2,2,2,3,3,5,6,8,99,8,9,7,2,3,4,5,6,7,8,9]
console.log(_.sortedUniq(arr))
//alguns pacotes como o lodash preciso fazer a importação via link mesmo que ele tenha sido instalado globalmente