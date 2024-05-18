const express = require('express')
const exphbs = require('express-handlebars')

const app = express()

const hbs = exphbs.create({
    partialsDir: ['views/partials'] //informo ao handlebars aonde fica o partials
})

// app.engine('handlebars', exphbs.engine()) código antigo até a aula 7
app.engine('handlebars', hbs.engine)
app.set('view engine', 'handlebars')      //obrigatoriamente preciso ter uma pasta chamada views e fazer essas duas configurções
app.use('/public',express.static('public'))// torno essa rota publica


app.get('/blog', (req, res) => {
    const posts = [
        {
            titulo: 'Aprendendo Javascript',
            categoria: 'Progamação',
            conteudo: 'Este artigo ira te ajudar a aprender node js'
        },
        {
            titulo:'Aprendendo Java',
            categoria:'Progamação',
            conteudo:'Este artigo ira te ajudar a aprender em Java Springdboot'
        },
        {
            titulo:'Aprendendo c#',
            categoria:'Progamação',
            conteudo:'Este artigo ira te ajudar a aprender c# e dotnet'
        }
    ]

    res.render('blogpost',{posts})
})

app.get('/dashboard', (req, res) => {

    const items = ['carro', 'casa', 'celular']

    res.render('dashboard', { items })
})

app.get('/post', (req, res) => {
    const post = {
        titulo: 'Aprendendo Javascript',
        categoria: 'Progamação',
        conteudo: 'Este artigo ira te ajudar a aprender node js'
    }

    res.render('blog', { post })
})

app.get('/', (req, res) => {

    const user = {
        nome: 'Marcos',
        idade: '25',
        profissao: 'Progamador'
    }

    const palavra = 'teste'

    const auth = true

    const aprovado = true

    res.render('home', { usuario: user, palavra, auth, aprovado })
})

app.listen(3010, () => {
    console.log('App funcionando !!!')
})