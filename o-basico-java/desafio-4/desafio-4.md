# Desafio 4
**Questão**: *Durante muito tempo, uma das maiores dificuldades na hora de programar era o gerenciamento de memória. Os desenvolvedores eram responsáveis pela sua alocação e liberação manualmente, o que levava a muitos erros e memory leaks. Hoje, em todas as plataformas modernas (incluindo Java), temos gerenciamento de memória automático através de algoritmos de coleta de lixo. Pesquise sobre Garbage Collector e faça uma explanação de como este algoritmo funciona na plataforma Java. Também implemente dois algoritmos em Java: um que exemplifique um possível erro de OutOfMemoryError e outro que mostre os cuidados tomados para não acontecer este tipo de erro durante o desenvolvimento de software.*

* Programas Java executam automaticamente o gerenciamento de memória a partir do Java Garbage Collection. Após da compilação e execução dos programas na JVM, os objetos são criados no heap, que é uma parte da memória dedicada ao programa. Eventualmente, objetos que não serão mais necessários são localizados e excluídos para liberação de memória.</br>
Não é necessário que o programador "marque" objetos a serem excluídos, a implementação do Garbage Collection está na própria JVM.</br>
Cada JVM pode implementar da forma que julgar necessário, o único requisito é que atenda as especificações. Como exemplo, o HotSpot da Oracle é um dos mais utilizados.

* [Exemplo 1 - Possível erro de OutOfMemoryError]()
* [Exemplo 2 - Cuidados tomados para evitar o problema]()
