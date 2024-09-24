const toNumber = (value) => {
    const number = Number(value)
    return isNaN(number) ? value : number
}

console.log(`toNumber : ${toNumber('we')}`)