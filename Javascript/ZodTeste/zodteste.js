const z = require('zod')

const mySchema = z.string()

console.log(`mySchema x: ${mySchema.parse('x')} myShema 3 : ${mySchema.parse(3)}`)

