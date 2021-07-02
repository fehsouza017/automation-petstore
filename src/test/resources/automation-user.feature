#language: pt
@users
Funcionalidade: Ciar Usuarios

  @create-users
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira criar um usuario 
    Quando eu preencher os dados necessarios "<username>", "<firstName>", "<lastName>", "<email>", "<password>", "<phone>"
    E clicar em send
    Então o meu usuario é criado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario   | username | firstName | lastName  | email             | password | phone       |
      | CN001.CT001 | criar usuario um     | user001  | usuario01 | test      | user001@uorak.com | u001001  | 11961511222 |
      | CN001.CT002 | criar usuario dois   | user002  | usuario02 | teste     | user002@uorak.com | u002002  | 11987463463 |
      | CN001.CT003 | criar usuario tres   | user003  | usuario03 | testando  | user003@uorak.com | u003003  | 11988163212 |
      | CN001.CT004 | criar usuario quatro | user004  | usuario04 | testeuser | user004@uorak.com | u004004  | 11987462571 |
      | CN001.CT005 | criar usuario cinco  | user005  | usuario05 | userteste | user005@uorak.com | u005005  | 11963625267 |

  @list-users
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira criar uma lista de usuarios "<username>"
    Quando eu informar todos os meus dados necessarios "<firstName>", "<lastName>", "<email>", "<password>", "<phone>"
    E enviar em send
    Então tenho minha lista de usuarios criada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario            | username | firstName | lastName | email            | password | phone       |
      | CN001.CT001 | criar lista de usuario um     | user01   | usuario1  | junin    | user01@uorak.com | a001b002 | 11961246571 |
      | CN001.CT002 | criar lista de usuario dois   | user02   | usuario2  | junior   | user02@uorak.com | a002b002 | 11987432187 |
      | CN001.CT003 | criar lista de usuario tres   | user03   | usuario3  | junon    | user03@uorak.com | a003b003 | 11987117754 |
      | CN001.CT004 | criar lista de usuario quatro | user04   | usuario4  | jurnio   | user04@uorak.com | a004b004 | 11987675129 |
      | CN001.CT005 | criar lista de usuario cinco  | user05   | usuario5  | junio    | user05@uorak.com | a005b005 | 11963675297 |

  @user-login
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu esteja na home
    E queira fazer login
    Quando eu digitar meus dados de acesso "<usuario>", "<senha>"
    E utilizar o botao send
    Então meu acesso a plataforma é permitido com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | usuario  | senha   |
      | CN001.CT001 | login do usuario   | fersouza | 1234567 |

  @find-user
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um usuario
    Quando eu digitar meu usuario "<usuario>"
    E mandar com o botao send
    Então tenho meu usuario encontrado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | usuario  |
      | CN001.CT001 | buscar um usuario  | fersouza |

  @update-data
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira atualizar meus dados
    Quando eu informar os dados que desejo alterar "<username>", "<firstName>", "<lastName>", "<email>", "<password>", "<phone>"
    E enviar o request
    Então tenho meus dados atualizados com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario         | username  | firstName | lastName | email             | password | phone       |
      | CN001.CT001 | atualizar dados do usuario | juniooor1 | junioor   | test     | juju001@uorak.com | j1234567 | 11988624317 |

  @logout-user
  Cenário: fazer logout
    Dado que eu queira fazer logout
    Quando eu clicar no botao de logout
    Então tenho meu logout feito com sucesso

  @delete-user
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira deletar um usuario
    Quando eu informar meu usuario "<usuary>"
    E mandar a request
    Então meu usuario é deletado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | usuary |
      | CN001.CT001 | deletar um usuario | lk01   |
