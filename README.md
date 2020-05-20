#### Introdução

Para executar o projeto é necessario fazer o download do mesmo e seguir o readme de cada um.
Abaixo como executar via docker.

#### Star no Docker
 
Executar o arquivo app-ecommerce onde esta o back-end
```bash
cd app-ecommerce
mvn package
```
Executar o arquivo ecommerce-front onde esta o front-end
```bash
cd ecommerce-front
npm install
ng build --prod
```
Para executar via docker-compose
```bash
docker-compose up --build
```