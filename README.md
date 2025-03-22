🏗️ Padrão Abstract Factory - Exemplo Prático
Este projeto demonstra o uso do padrão de projeto Abstract Factory, conforme descrito no livro Design Patterns: Elements of Reusable Object-Oriented Software, de Erich Gamma e outros membros da Gang of Four (GoF).

📌 Visão Geral
O Abstract Factory é um padrão criacional que permite criar famílias de objetos relacionados sem especificar suas classes concretas. Neste projeto, ele é utilizado para criar componentes gráficos (Button e Checkbox) de maneira independente do sistema operacional.

A principal vantagem desse padrão é permitir que a aplicação suporte diferentes implementações (MacOS e Windows) sem modificar seu código principal.

🏛️ Estrutura do Projeto
📂 src/
├── 📂 App/
│ ├── Application.java (Classe principal que utiliza os componentes criados pela fábrica)
│ ├── Demo.java (Classe de execução que detecta o SO e instancia a fábrica correspondente)
│
├── 📂 Factories/
│ ├── GUIFactory.java (Interface da fábrica)
│ ├── MacOSFactory.java (Fábrica para MacOS)
│ ├── WindowsFactory.java (Fábrica para Windows)
│
├── 📂 Buttons/
│ ├── Button.java (Interface de um botão)
│ ├── MacOSButton.java (Implementação do botão para MacOS)
│ ├── WindowsButton.java (Implementação do botão para Windows)
│
├── 📂 Checkbox/
│ ├── Checkbox.java (Interface de um checkbox)
│ ├── MacOSCheckbox.java (Implementação do checkbox para MacOS)
│ ├── WindowsCheckbox.java (Implementação do checkbox para Windows)

🛠️ Como Funciona?
O programa verifica qual é o sistema operacional do usuário (System.getProperty("os.name")).

Com base nisso, escolhe a fábrica correspondente (MacOSFactory ou WindowsFactory).

A fábrica cria os componentes adequados (Button e Checkbox) para o SO detectado.

A classe Application recebe os componentes e os utiliza sem saber de sua implementação específica.

O método paint() exibe os componentes gráficos.

🖥️ Execução
Para executar o projeto, compile e rode o arquivo Demo.java:

sh
Copiar
Editar
javac Demo.java
java Demo
Se estiver no Windows, a saída será:

arduino
Copiar
Editar
Renderizando botão do Windows
Renderizando checkbox do Windows
Se estiver no MacOS, a saída será:

arduino
Copiar
Editar
Renderizando botão do MacOS
Renderizando checkbox do MacOS
📚 Benefícios do Abstract Factory
✔️ Flexibilidade → Permite criar objetos sem amarrar a aplicação a classes específicas.
✔️ Facilidade de manutenção → Se um novo sistema operacional for adicionado, basta criar uma nova fábrica sem modificar o código existente.
✔️ Código desacoplado → A lógica da aplicação não precisa saber os detalhes de implementação dos componentes.

✨ Referências
Design Patterns: Elements of Reusable Object-Oriented Software – Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides (Gang of Four).

Padrão Abstract Factory (Refactoring.Guru)
