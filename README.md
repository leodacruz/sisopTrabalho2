# Trabalho 1 - SISOP 

# Como executar 1
abaixo a forma de como executar, da forma normal. Deste jeito ele executa com base nos processos que estão no arquivo cenarioExemplo.json, que está na pasta
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
#### gradlew run --args='cenario1'     
sendo o cenario1 o arquivo localizado  app -> src -> main -> resources com o nome de cenario1.json, não é necessario colocar o .json no argumento

## linux
#### ./gradlew run --args='cenario1'     
sendo o cenario1 o arquivo localizado  app -> src -> main -> resources com o nome de cenario1.json, não é necessario colocar o .json no argumento

#Todos os cenarios de testes estão dentra da planilha