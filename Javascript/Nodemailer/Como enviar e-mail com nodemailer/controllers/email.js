const send = require('../service/email/nodemailer')

const sendEmail = async (req,res)=>{

    const  {to,subject,body} =req.body
    
        send(to,subject,body)

        if(send.messageId != undefined){
            return res.json('Eroo ao processar envio do e-mail !!!')
        }
        
        console.log(`E-mail enviado com sucesso !!!`)
        return res.json(`E-mail enviado com sucesso !!!`)

}

module.exports = {
    sendEmail
}


