📚 Literalura é um projeto desenvolvido como challenge do LiterAlura, promovido pela Alura em parceria com o programa Oracle Next Education.

Este aplicativo em Java permite buscar e registrar livros utilizando a API Gutendex, armazenando os dados em um banco de dados PostgreSQL. A interface é simples e interativa via terminal.

🚀 Funcionalidades
🔍 Buscar livros pelo título diretamente na API Gutendex.

💾 Registrar livros buscados no banco de dados PostgreSQL.

📖 Listar todos os livros cadastrados.

✍️ Listar todos os autores cadastrados.

🕰️ Listar autores que estavam vivos em um ano específico.

🌐 Listar livros disponíveis em um idioma escolhido.

🛠️ Tecnologias Utilizadas
Java — Linguagem de programação.

Spring Boot — Framework para simplificar o desenvolvimento.

Maven — Gerenciamento de dependências e build.

Spring Data JPA — Para facilitar o acesso e persistência no banco.

PostgreSQL — Banco de dados relacional para armazenar os livros.

API Gutendex — Fonte dos dados dos livros.

⚙️ Como Rodar o Projeto
Clone este repositório:

bash
Copiar
Editar
git clone https://github.com/Matheus-2700/LiterAlura.git
cd LiterAlura
Configure o banco PostgreSQL e atualize as credenciais no arquivo application.properties do Spring Boot.

Execute o projeto com Maven:

bash
Copiar
Editar
mvn spring-boot:run
Use o menu interativo no terminal para buscar livros e explorar os dados cadastrados.

📚 Sobre a API Gutendex
A API Gutendex oferece acesso gratuito a uma coleção gigante de livros de domínio público, permitindo buscas por título, autor, idioma, entre outros.

🧑‍💻 Contato
Desenvolvido por Matheus Karvat
GitHub: github.com/Matheus-2700
LinkedIn: linkedin.com/in/matheus-karvat

🎉 Agradecimentos
Obrigado à Alura e ao Oracle Next Education pelo desafio e suporte para este projeto!

