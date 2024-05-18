const express = require('express')
const router = express.Router()
const path = require('path')
const basepath = decodeURIComponent(path.resolve('templates'));

router.get('/add',(req,res)=>{
    res.sendFile(`${basepath}/userform.html`)
})

router.get('/:id', (req, res) => {
    const id = req.params.id

    console.log('Estamos Buscando o Usuario :',id)

    res.status(200).sendFile(`${basepath}/users.html`);
})

router.post('/save',(req,res)=>{
    console.log(req.body)

    const nome = req.body.name
    const idade = req.body.age

    console.log(`O nome do usuario é ${nome} e a sua idade é ${idade} anos`)

    res.status(200).sendFile(`${basepath}/userform.html`)
})

module.exports = router