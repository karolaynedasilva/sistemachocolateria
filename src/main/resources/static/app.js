const urlUF = "https://servicodados.ibge.gov.br/api/v1/localidades/estados"
const uf = document.getElementById("uf")
const cidade = document.getElementById("cidade")
const mysql = require('../static/mysql').pool;


uf.addEventListener('change', async () => {
    const urlCidades = 'https://servicodados.ibge.gov.br/api/v1/localidades/estados/'+uf.value+'/municipios'
    const request = await fetch(urlCidades)
    const response= await request.json()
    let options = ''   
    
    response.forEach( (uf) => {
        options += '<option>'+ uf.nome + '</option>'
    })
    cidade.innerHTML= options
})

window.addEventListener('load', async () =>{
    //await pq minha função é assincrona - espera resposta do servidor
    const request = await fetch(urlUF)
    const response = await request.json()
    const options = document.createElement("optgroup")
   
    response.forEach(function(uf){
        options.innerHTML += '<option>' + uf.sigla + '</option>'
    })
    uf.append(options)
});


