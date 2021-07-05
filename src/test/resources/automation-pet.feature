#language: pt
@Pets
Funcionalidade: Automação Pet

  @update-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira atualizar os dados do pet na loja
    Quando eu inserir o id do pet <idPet>
    E os dados que desejo alterar "<name>", "<status>"
    E enviar a request
    Então tenho os dados do pet atualizado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario     | idPet | name    | status     |
      | CN001.CT001 | atualizar dados do pet |   157 | pitbull | aguardando |

  @find-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um pet pelo id
    Quando eu inserir o id do pet <petId>
    E mandar a request
    Então tenho meu pet encontrado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario    | petId |
      | CN002.CT001 | buscar um pet pelo id |   155 |

  @find-pet-status
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um pet pelo status
    Quando eu inserir o status do pet "<status>"
    E clicar em send
    Então minha busca por pet via status é concluida com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario       | status   |
      | CN003.CT001 | busca por pet via status | dormindo |
