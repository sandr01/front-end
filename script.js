// let botao = document.querySelector('a#add');
// botao.addEventListener('click', funcaoA);
// botao.addEventListener('click', funcaoB);

// function funcaoA(){
//     alert('A')
// }
// function funcaoB(){
//     alert('B')
// }

//---------------------Trocando o tema da página---------------------------
let selectTema = document.querySelector('select#tema');
selectTema.addEventListener('change', evento => {
    let temaSelecionado = evento.target.value;
    //console.log(temaSelecionado); verificando no console se está buscando o tema selecionado
    if(temaSelecionado){
        mudaTema(temaSelecionado);
    }
});

const mudaTema = (temaSelecionado) => {
    let linkTema = document.querySelector('#link-tema');
    let url = "/css/estilo-tema-"+temaSelecionado+".css"
    linkTema.href = url;
}

let tema = localStorage.getItem('tema');
if(tema){
    mudaTema(tema);
}
//-------------------------------------------------------------------------