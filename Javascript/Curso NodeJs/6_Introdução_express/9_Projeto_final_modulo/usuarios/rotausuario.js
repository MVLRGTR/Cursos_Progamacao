const express = require('express')
const router = express.Router()
const path = require('path')
const basepath = decodeURIComponent(path.resolve('templates'));

router.get('/add',(req,res)=>{
    res.status(200).sendFile(`${basepath}/userform.html`)
})

router.get('/:id',(req,res)=>{
    const id  = req.params.id
    console.log(`Estamos buscando o usuario :${id}`)
    res.status(200).sendFile(`${basepath}/usuario.html`)
})

module.exports = router