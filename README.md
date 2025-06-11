# Trabalho 2 - SISOP 

# Como executar 1
abaixo a forma de como executar, da forma normal. Deste jeito ele executa com base nos processos que estão no arquivo arquivo_entrada.txt, que está na pasta
resources, caminho:  app -> src -> main -> resources

## windows
### gradlew run
Basta fazer o comando: gradlew run

## linux
### ./gradlew run
caso ele reclame de permissão faça o comando:  chmod +x gradlew 
que depois ele deixa rodar o comando normal

# Como executar 2
Está forma de executar é para quando quer executar um cenario especifico, assim basta colocar o nome do cenario como argumento

## windows
#### gradlew run --args='arquivo_entrada.txt'     
sendo o arquivo_entrada.txt o arquivo localizado  app -> src -> main -> resources

## linux
#### ./gradlew run --args='arquivo_entrada.txt'     
sendo o arquivo_entrada.txt o arquivo localizado  app -> src -> main -> resources