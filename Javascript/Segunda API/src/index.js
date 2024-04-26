const express = require('express')
const mongoose = require('mongoose')

const app = express()
app.use(express.json())
const port = 3332

app.listen(port, () => {
    console.log(`Serve is running or port ${port}`)
    mongoose.connect('mongodb+srv://admin:kb35ZvzhksVzkWSD@segundaapi.o4w5grq.mongodb.net/SegundaAPI?retryWrites=true&w=majority', {
        useNewUrlParser: true,
        useUnifiedTopology: true
    })
        .then(() => console.log('Conectado ao MongoDB com sucesso!'))
        .catch(err => console.error('Erro ao conectar ao MongoDB:', err))
})




const Film = mongoose.model('Film', {
    title: String,
    description: String,
    image_url: String,
    trailer_url: String
})

app.get('/', async(req, res) => {
    const filmes = await Film.find()
    return res.send(filmes)    
})

app.delete('/:id',async(req,res)=>{
    const filmedelet = await Film.findByIdAndDelete(req.params.id)
    return res.send(filmedelet)
})

app.put('/:id',async (req,res)=>{
    const filmeupdate = await Film.findByIdAndUpdate(req.params.id,
    {
        title: req.body.title,
        description: req.body.description,
        image_url: req.body.image_url,
        trailer_url: req.body.trailer_url
    },{
        new : true
    })
    return res.send(filmeupdate)
})

app.post('/', async (req, res) => {
    const film = new Film({
        title: req.body.title,
        description: req.body.description,
        image_url: req.body.image_url,
        trailer_url: req.body.trailer_url
    })
    await film.save()
    return res.send(film)
})



// const express = require('express')
// const mongoose = require('mongoose')

// const app = express()
// const port = 3332


// mongoose.connect('mongodb+srv://admin:kb35ZvzhksVzkWSD@segundaapi.o4w5grq.mongodb.net/SegundaAPI?retryWrites=true&w=majority', {
//   useNewUrlParser: true,
//   useUnifiedTopology: true
// })
// .then(() => console.log('Conectado ao MongoDB com sucesso!'))
// .catch(err => console.error('Erro ao conectar ao MongoDB:', err))

// const Film = mongoose.model('Film', {
//   title: String,
//   description: String,
//   image_url: String,
//   trailer_url: String
// })

// app.get('/', (req, res) => {
//   res.send('Hello World')
// })

// app.post('/', (req, res) => {
//   const film = new Film({
//     title: req.body.title,
//     description: req.body.description,
//     image_url: req.body.image_url,
//     trailer_url: req.body.trailer_url
//   })

//   film.save()
//     .then(savedFilm => res.send(savedFilm))
//     .catch(err => res.status(500).send('Erro ao salvar filme: ' + err))
// })

// app.listen(port, () => console.log(`Servidor rodando na porta ${port}`))
