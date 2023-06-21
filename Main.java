public class Main {
            public static void main(String[] args) {
            Pessoa pessoa = new Pessoa("Joao", 30);
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Idade: " + pessoa.getIdade());
                    UsuarioComum usuario = new UsuarioComum("Maria", 25, "maria123", "senha123");
                System.out.println("Nome: " + usuario.getNome());
                System.out.println("Idade: " + usuario.getIdade());
                System.out.println("Username: " + usuario.getUsername());
                System.out.println("Senha: " + usuario.getSenha());

                Promotor promotor = new Promotor("Joao", 35, "EmpresaXYZ");
                System.out.println("Nome: " + promotor.getNome());
                System.out.println("Idade: " + promotor.getIdade());
                System.out.println("Empresa: " + promotor.getEmpresa());

                Evento evento = new Evento("Concerto");
                Ingresso ingresso1 = new Ingresso("VIP");
                Ingresso ingresso2 = new Ingresso("CAMAROTE");
                Ingresso ingresso3 = new Ingresso("PISTA");
                evento.addIngresso(ingresso1);
                evento.addIngresso(ingresso2);
                evento.addIngresso(ingresso3);

                System.out.println("Nome do evento: " + evento.getNome());
                System.out.println("Ingressos disponiveis:");
                for (Ingresso ingresso : evento.getIngressos()) {
                    System.out.println("Tipo: " + ingresso.getTipo());
                }

                VendaSite vendaSite = new VendaSite(5);
                vendaSite.cadastrarIngresso(ingresso1); // Ingresso cadastrado com sucesso!
                vendaSite.cadastrarIngresso(ingresso2); // Ingresso cadastrado com sucesso!
                vendaSite.cadastrarIngresso(ingresso3); // Ingresso cadastrado com sucesso!
                vendaSite.cadastrarIngresso(new Ingresso("VIP")); // Ingresso cadastrado com sucesso!
                vendaSite.cadastrarIngresso(new Ingresso("CAMAROTE")); // Ingresso cadastrado com sucesso!
                vendaSite.cadastrarIngresso(new Ingresso("PISTA")); // Quantidade máxima de ingressos atingida!
            }
}

