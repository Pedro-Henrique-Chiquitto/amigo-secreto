const apiUrl = "http://localhost:8080/api/amigos";

function adicionarNome() {
    const nome = document.getElementById("nome").value.trim();
    if (nome === "") {
        alert("Digite um nome válido.");
        return;
    }

    fetch(`${apiUrl}/adicionar?nome=${nome}`, { method: "POST" })
        .then(() => {
            document.getElementById("nome").value = "";
            carregarLista();
        })
        .catch(() => alert("Erro ao adicionar o nome."));
}

function carregarLista() {
    fetch(apiUrl)
        .then(response => response.json())
        .then(data => {
            const lista = document.getElementById("listaAmigos");
            lista.innerHTML = "";
            data.forEach(nome => {
                const li = document.createElement("li");
                li.classList.add("list-group-item");
                li.textContent = nome;
                lista.appendChild(li);
            });
        });
}

function sortear() {
    fetch(`${apiUrl}/sortear`)
        .then(response => response.json())
        .then(data => {
            const resultadoLista = document.getElementById("resultado");
            resultadoLista.innerHTML = "";
            data.forEach(par => {
                const li = document.createElement("li");
                li.classList.add("list-group-item", "list-group-item-info");
                li.textContent = par;
                resultadoLista.appendChild(li);
            });
        })
        .catch(() => alert("É necessário pelo menos 2 amigos para o sorteio."));
}

// Carrega a lista ao abrir a página
carregarLista();
