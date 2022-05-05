# AMBIENTE
```
1- sudo apt upgrade 
```
## UPDATE SERVE/HOST
```
2- docker info 
```
```
3- docker ps -a
```
## Mostra as informaçoes do containes 
## Lista todos os containes 
``` 
________________________________________________________________
```

## AMBIENTE DOCKER PARA BANCOS DE DADOS

*SITES*

https://docs.docker.com/get-started/

**Commandos**

```
docker run --name some-postgres -e POSTGRES_PASSWORD=mysecretpassword -d postgres
```
## ACESSAR BASH DO CONTAINER

``` 
docker exec -it some-postgres bash
```
## LOGANDO NO POSTGRES
```
psql -U postgres

``` 
## Criando Data base
```
createdb POO
```
## Lista data base
```
poo \l
```


