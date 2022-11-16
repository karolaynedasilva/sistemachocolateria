const urlUF = "https://servicodados.ibge.gov.br/api/v1/localidades/estados"
window.addEventListener('load', async () =>{ 
    //await pq minha função é assincrona - espera resposta do servidor 
    const request = await fetch(urlUF)
    const response = await request.json()

    const options = document.createElement("optgroup")
   

    response.forEach(function(uf){
        options.innerHTML = '<option>' + uf.sigla + '</option>'
        
    })
});