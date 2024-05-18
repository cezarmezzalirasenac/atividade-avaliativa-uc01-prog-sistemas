# Atividade Avaliativa - UC1 - Programador de Sistemas - Senac Pato Branco



Situação problema:

Uma companhia aérea está adquirindo uma nova aeronave do tipo widebody, que possui dois corredores com 3 fileiras cada, sendo que as fileiras das janelas possuem 3 assentos e a fileira do meio possui 5 poltronas. A aeronave possui um total de 20 fileiras.

Vamos criar um programa no qual o usuário possa informar a fileira e a poltrona desejadas. As fileiras devem ser identificadas de 1 a 20 e as poltronas de 1 a 11. O usuário deverá informar a posição, por exemplo 5 10, e então o programa deverá: se o assento estiver livre, reservar o assento e imprimir o valor, em reais, da reserva; ou se o assento já estiver ocupado, imprimir que ele está ocupado.

Os assentos das cinco primeiras fileiras são assentos de primeira classe, cujo valor é diferenciado dos outros assentos, que são assentos econômicos. Os assentos devem ser representados por objetos de classes que implementam a interface Assento, que possui o método abstrato ‘reservar’, de forma que AssentoEconomico e AssentoPrimeiraClasse sejam classes diferentes.

## Tarefas

Criar um programa em Java para resolver o problema apresentado anteriormente.

## Dicas
Para armazenar os assentos, usar uma matriz do tipo Assento e representar fileiras como linhas e poltronas como colunas.

O método abstrato deve ser criado na classe abstrata Assento e pode ser usada uma interface para obrigar a implementação do método.


## Algoritmo
1- Obter o número da fileira
2- Obter o número da poltrona
3- Validar se na matriz de assentos, na fileira (linha) e a poltrona (coluna) existe um objeto ou não
4- Se existir um objeto naquela posição da matriz, deve imprimir uma mensagem que o assento está ocupado
5- Senão, deve criar um novo objeto assento, levando em consideração a fileira. 
6- Se a fileira for menor ou igual a cinco, deve criar um objeto AssentoPrimeiraClasse
7- Senão, deve criar um objeto AssentoEconomico
8- Após criar o objeto, deverá chamar o método reservar do mesmo, acessando o ojeto pela sua posição na matriz
9- O método reservar deve apenas imprimir o valor da passagem com a poltrona e a fileira