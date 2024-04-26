const objetodom = document.getElementsByTagName('div') //No caso estamos retornando um coleção com os elemtos div dentro dessa variavel
const objetodom2 = [...document.getElementsByTagName('div')]


objetodom2.forEach(element => {
    element.innerHTML = 'Texte Funcionou'
});

console.log(objetodom)
console.log(objetodom2)
//Na coleção HTML representado pelo primeiro console log temos que o mesmo só aceita objetos html diferetne do array , podendo ter elementos variados