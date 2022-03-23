# Conhecendo a Plataforma - Desafio 2
***Questão**: Qualquer programa de computador precisa manter informações de alguma forma. Assim, as linguagens de programação permitem a criação de variáveis. Pontue:*
<br/>

* **Declaração de variáveis com inicialização implícita**: Para escopo de classe, quando uma variável primitiva de instância ou de classe não é inicializada explicitamente pelo desenvolvedor, a mesma assume um valor padrão implicitamente, por exemplo, no caso do tipo "int" seria "0", no caso de "double" seria "0.0".<br/>
As variáveis do tipo referência (objetos) também são inicializadas, porém com valor padrão "null".<br/>

* **Declaração de variáveis com inicialização explícita**: Qualquer variável local definida no construtor ou em métodos não possui valor padrão, para usá-la, é necessário inicializá-la explicitamente.

* **Obrigatoriedade de inicialização de variáveis no Java**: Sempre que utilizamos o modificador "final" é obrigatório iniciar o valor da váriavel, seja no momento em que é declarada ou no construtor da classe.

* **Como funciona o escopo de variáveis no Java**: Escopo de variável é todo lugar onde ela pode ser referenciada (chamada, manipulada). No Java, esse escopo é sempre o mesmo lugar em que ela é decalara, ou seja, fora desse escopo a variável não pode ser referênciada.<br/>
Por exemplo: Uma variável declarada dentro de uma condicional "if" só é válida dentro do "if". Variáveis recebidas como parâmetros em métodos, só são válidas dentro do método.

* **Quando utilizar a palavra reservada final na declaração de uma variável**: O modificador final é utilizado quando queremos imutabilidade. Quando aplicado na classe, não permite estende-la, nos métodos impede que que o mesmo seja sobreescrito (overriding), e nos valores de variáveis, não permite alterar o valor da mesma após a inicialização.
