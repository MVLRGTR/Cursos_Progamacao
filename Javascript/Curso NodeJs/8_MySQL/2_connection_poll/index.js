const express = require('express')
const exphbs = require('express-handlebars')
const pool = require('./db/conection')
const port = 3010

const app = express()

//O professor também falou de preparação de queries para se proteger de sql injection

const hbs = exphbs.create({
    partialsDir : ['views/partials']
})

app.use(express.urlencoded({
    extended:true
}))
app.use(express.json())
app.engine('handlebars',hbs.engine)
app.set('view engine' ,'handlebars')
app.use('/public',express.static('public'))



app.listen(port,()=>{
    console.log(`App rodando na porta  ${port}`)
})

app.get('/',(req,res)=>{
    res.render('home')
})


app.get('/books',(req,res)=>{
    const query = 'SELECT * FROM books'

    pool.query(query,(erro, data)=>{
        if(erro){
            console.log(erro)
            return
        }

        const books = data
        console.log(books)
        res.render('books',{books})
    })
})

app.get('/book/:id_book',(req,res)=>{
    const id_book = req.params.id_book
    const query = 'SELECT * FROM books WHERE idbooks = ? '
    
    pool.query(query,[id_book],(erro,data)=>{
        if(erro){
            console.log(erro)
            return
        }

        const book = data[0]
        console.log(book)
        res.status(201).render('bookfilter',{book})
    })

})

app.get('/book/edit/:id_book',(req,res)=>{
    const id_book = req.params.id_book
    const query = `SELECT * FROM books WHERE idbooks = ?`

    pool.query(query,[id_book],(erro,data)=>{
        if(erro){
            console.log(erro)
            return
        }

        const book = data[0]
        res.status(201).render('editbook',{book})

    })


})

app.post('/book/edit',(req,res)=>{
    const id_book = req.body.idbook
    const title = req.body.title
    const pages = req.body.pagesqty

    const query = `UPDATE books SET title = ?, pages = ? WHERE idbooks = ?`

    pool.query(query,[title,pages,id_book],(erro,data)=>{
        if(erro){
            console.log(erro)
            return
        }

        res.status(201).redirect('/books')

    })
})

app.post('/book/delete/:id_book',(req,res)=>{
    const id_book = req.params.id_book

    const query = `DELETE FROM books WHERE idbooks = ?`

    pool.query(query,[id_book],(erro,data)=>{
        if(erro){
            console.log(erro)
            return
        }

        res.status(201).redirect('/books')
    })
})

app.post('/books/insertbook',(req,res)=>{
    const title = req.body.title
    const pagesqty = req.body.pagesqty
    const values = ['title','pages',title,pagesqty]

    console.log(`titulo ${title} e paginas ${pagesqty}`)

    const query = `INSERT INTO books (?? ,??) VALUES (?,?)`

    pool.query(query,values,(erro)=>{
        if(erro){
            console.log(erro)
        }
        console.log('inserido com sucesso')
        res.status(201).redirect('/books')
    })
})

