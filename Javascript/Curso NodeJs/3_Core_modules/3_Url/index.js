const url = require('url')
const address ='https://www.meusite.com.br/catalago?produtos=cadeira'
const parsedUrl = new url.URL(address)

console.log(parsedUrl)
console.log('host',parsedUrl.host)
console.log('pathname',parsedUrl.pathname)
console.log('search',parsedUrl.search)
console.log('searchParams',parsedUrl.searchParams)
console.log('Get',parsedUrl.searchParams.get('produtos'))