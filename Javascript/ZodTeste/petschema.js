const z = require('zod')

let name = 'lo'
let age = 2.5
let weight = 8
let color = 'branco'
let images = ['122131']

let pet = {
    name,
    age,
    weight,
    color,
    images
}

const petSchema = z.object({
    name : z.string().min(3, { message: 'O nome precisa ter pelo menos 3 caracteres' }).max(25, { message: 'O nome pode ter no máximo 25 caracteres' }),
    age : z.number().min(1,{message : "A idade minima é 1 ano"}).max(30,{message:"A idade maxima para animais é 30 anos"}),
    weight: z.number().min(1,{message:"O peso deve ser no minimo 1kg"}).max(80,"O peso maximo é 80kg"),
    color: z.string().min(4, { message: "A cor precisa ter pelo menos 4 caracteres" }),
    images: z.array(z.string()).min(1, { message: "Pelo menos uma imagem é obrigatória" })
})

// try{
//     petSchema.parse(pet)

// }catch(erro){
//     console.log(`Erro da requisição  :${erro.message}`)
// }

try {
    petSchema.parse(pet);
} catch (erro) {
    if (erro instanceof z.ZodError) {
        console.log("Erro da requisição: ");
        erro.errors.forEach(err => {
            console.log(err.message);  // Exibindo apenas a mensagem de erro
        });
    }
}