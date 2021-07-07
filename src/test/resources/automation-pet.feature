#language: pt
@Pets
Funcionalidade: Automação Pet

  @add-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu adicionar um novo pet
    Quando eu inserir todas as informaçoes do pet "<category>", "<name>", "<photoUrl>", "<tags>", "<status>"
    E mandarr um send
    Então o novo pet é adicionado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | category | name   | photoUrl | tags    | status  |
      | CN001.CT001 | adicionar pet      | cachorro | caxoro |          | pitbull | pending |

  @update-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira atualizar os dados do pet na loja
    Quando eu inserir o id do pet <idPet>
    E os dados que desejo alterar "<name>", "<status>"
    E enviar a request
    Então tenho os dados do pet atualizado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario     | idPet | name         | status |
      | CN002.CT001 | atualizar dados do pet |    11 | cachorroloco | sold   |

  @upload-image-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira adicionar uma imagem
    Quando eu inserir a url da imagem  <id>, "<url>"
    E clicar no send
    Então tenho minha imagem adicionada com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | id | url              |
      | CN003.CT001 | adicionar imagem   | 11 | c:\\CRGY3511.jpg |

  @find-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um pet pelo id
    Quando eu passar o id do pet <petId>
    E mandar a request
    Então tenho meu pet encontrado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario    | petId |
      | CN004.CT001 | buscar um pet pelo id |    11 |

  @find-pet-status
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira buscar um pet pelo status
    Quando eu inserir o status do pet "<status>"
    E dar um clique no send
    Então minha busca por pet via status é concluida com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario       | status  |
      | CN005.CT001 | busca por pet via status | pending |

  @delete-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira deletar um pet
    Quando eu passar o id do pett <id>
    E enviar com o send
    Então pet é deletado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario | id |
      | CN006.CT001 | deletar pet por id | 11 |

  @update-exist-pet
  Esquema do Cenário: "<Cenario>" - "<DescricaoDoCenario>"
    Dado que eu queira adicionar um objeto ao pet existente na loja
    Quando eu inserir o objeto do pet <id>, <categoryId> "<category>", "<name>", "<photoUrl>", <tagId> "<tags>", "<status>"
    E usar o send
    Então objeto do pet é adicionado com sucesso

    Exemplos: 
      | Cenario     | DescricaoDoCenario              | id | categoryId | category | name | photoUrl | tagId | tags | status  |
      | CN007.CT001 | adicionar objeto do pet na loja | 15 |          5 |          | gato | catnoir  |     7 | cat  | pending |
