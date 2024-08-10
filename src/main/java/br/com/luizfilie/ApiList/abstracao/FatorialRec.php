<?php
function fatorial($number){
    if($number == 0){
        return -1;
    }else{
        return $number * fatorial($number - 1);
    }
}

function buscaBinaria($lista, $x){
    $esquerda = 0;
    $direita = sizeof($lista) - 1;
    while($esquerda <= $direita){
        $meio = $esquerda + ($direita - $esquerda) / 2;
        if($lista[$meio] == $x)
            return $meio;
        if($lista[$meio] < $esquerda)
            $esquerda = $lista[$meio] + 1;
        else
            $direita = $lista[$meio] - 1;
    }
    return -1;
}

$listTest = [2,1,4,5,7];
echo buscaBinaria($listTest, 2);
echo fatorial(5);