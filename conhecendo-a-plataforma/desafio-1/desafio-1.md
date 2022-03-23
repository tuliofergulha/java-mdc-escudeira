# Conhecendo a Plataforma - Desafio 1
***Questão**: O Java possui vários tipos de dados primitivos para resolvermos diversos problemas e, para cada tipo primitivo, existe uma classe WRAPPER. Pontue:*
<br/>
* **Diferença entre os tipos primitivos e as classes Wrapper**:
  Para cada tipo primitivo existe uma classe que a representa no mundo orientado a objeto. Sendo assim, variáveis primitivas armazenam valor, enquanto as classes Wrapper são objetos que armazenam referência.

* **Quais são os tipos primitivos e suas classes Wrapper**:<br/>
  • **Primitivo**: boolean | **Classe Wrapper**: Boolean<br/>
  • **Primitivo**: byte    | **Classe Wrapper**: Byte<br/>
  • **Primitivo**: char    | **Classe Wrapper**: Character<br/>
  • **Primitivo**: int     | **Classe Wrapper**: Integer<br/>
  • **Primitivo**: float   | **Classe Wrapper**: Float<br/>
  • **Primitivo**: double  | **Classe Wrapper**: Double<br/>
  • **Primitivo**: long    | **Classe Wrapper**: Long<br/>
  • **Primitivo**: short   | **Classe Wrapper**: Short<br/>

* **Qual o valor default de cada tipo primitivo e de cada classe Wrapper**:<br/>
  • boolean: false<br/>
  • byte   : 0<br/>
  • char   : \u0000 (null)<br/>
  • int    : 0<br/>
  • float  : 0.0<br/>
  • double : 0.0<br/>
  • long   : 0<br/>
  • short  : 0

* **Como consigo converter cada tipo primitivo em uma classe Wrapper e como consigo converter cada classe Wrapper em um tipo primitivo**:<br/>
  A partir do Java 5, foi introduzida funcionalidade de Autoboxing, que converte automaticamente o tipo primitivo em Wrapper. Além disso existem ainda os conceitos de Boxing e Unboxing conversion, que utiliza a seguinte sintaxe:<br/>
  **Boxing (primitivos para Wrappers):<br/>**
    • Boolean   a = true;<br/>
    • Byte      b = 1;<br/>
    • Character c = 'a';<br/>
    • Integer   d = 10;<br/>
    • Float     e = 2.4334f;<br/>
    • Double    f = 3.4;<br/>
    • Long      g = 3L;<br/>
    • Short     h = 4;<br/>
**Unboxing (Wrappers para primitivos):<br/>**
    • boolean a = new Boolean("True");<br/>
    • byte    b = new Byte("1");<br/>
    • char    c = new Character('c');<br/>
    • int     d = new Integer("200");<br/>
    • float   e = new Float(1.32f);<br/>
    • double  f = new Double(12.12);<br/>
    • long    g = new Long(1L);<br/>
    • short   h = new Short("2");<br/>

* **Um exemplo de utilização de cada tipo durante o desenvolvimento de software**:
[Clique aqui para ver os exemplos](https://github.com/tuliofergulha/java-mdc-escudeiro/blob/main/conhecendo-a-plataforma/desafio-1/WrapperExample.java)
