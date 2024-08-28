let vetor = [10]
let maior, menor

for(let i = 0 ; i < 10; i++){ 
    vetor[i] = Number(prompt("Insira 10 numeros"))
}

for(i = 0; i < 10; i++){ 
    maior = vetor[0]
    menor = vetor[0]

    if(vetor[i] > maior){ 
        maior = vetor[i]
    }
    if(vetor[i] < menor){ 
        menor = vetor[i]
    }
}

console.log(maior)
console.log(menor)
console.log((maior + menor)/2)
