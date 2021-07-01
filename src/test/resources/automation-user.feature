#language: pt
@users
Funcionalidade: Ciar Usuarios

  @create-users
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira criar um usuario "<username>"
    Quando eu preencher os dados necessarios "<firstName>", "<lastName>", "<email>", "<password>", "<phone>"
    E clicar em send
    Então tenho meu usuario criado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | username | firstName | lastName | email             | password | phone       |
      | CN001.CT001 | criar usuario 01   | user001  | usuario01 | test     | user001@uorak.com | u001001  | 11961560588 |
