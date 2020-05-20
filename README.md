# Api 
Test E-commerce

## Sumário

* [Introdução](#introdução)
  + [Objetivo](#objetivo)
  + [Evolução](#evolução)
* [Instalação](#instalação)
  + [Pré-requisitos](#pré-requisitos)
  + [Configuração da Aplicação](#configuração-da-aplicação)
    - [Perfil `default`](#perfil-default)
    - [Perfil `local`](#perfil-local)
* [Utilização](#utilização)
  + [Compilação](#compilação)
  + [Execução da Aplicação](#execução-da-aplicação)
* [Licença](#licença)

## Introdução
Projeto E-commerce utilizando as tecnologias abaixo:

Java 11;
Spring Boot;
Spring Security;
Autenticação JWT;
Spring Data JPA;
Hibernate;
PostgreSQL;
Maven;
Docker;
Docker Compose;


## Instalação

Baixe o código-fonte desse repositório usando `git clone` ou de forma manual (.zip).
Para prosseguir com a instação deste projeto é necessário atender a tabela de pré-requisitos com componentes na versão
especificada ou superior.

### Pré-requisitos

| Componente   | Versão       | Descrição                      |
|--------------|--------------|--------------------------------|
| OpenJDK      | 11.0.3 (LTS) | Plataforma Java                |
| Apache Maven | 3.6.1        | Build e Gestão de Dependências |

Banco POSTGRESQL


## Utilização

Abaixo seguem instruções de uso do projeto. Os comandos devem ser executados no terminal, ou diretamente na IDE de preferência

### Compilação

Para fazer o download de dependências e compilar o código-fonte da aplicação, navegue até o diretório raiz do projeto execute:

```bash
mvn clean package
```

### Execução da Aplicação

Para executar a aplicação

```bash
mvn spring-boot:run -Dspring-boot.run.profiles=local
```

A aplicação estará executando no endereço http://localhost:8080/api


## Licença
Lucas Zampoli
