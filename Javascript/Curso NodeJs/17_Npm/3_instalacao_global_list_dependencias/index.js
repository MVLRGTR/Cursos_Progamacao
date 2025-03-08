var request = require('request')

request('https://www.google.com',function(error,response,body){
    console.log(`Error : ${error}`)
    console.log(`statusCode : ${response && response.statusCode}`)
    console.log(`Body : ${body}`)
})