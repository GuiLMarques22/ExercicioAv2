public class UsuarioComum extends Pessoa {
        private String username;
        private String senha;

        public UsuarioComum(String nome, int idade, String username, String senha) {
            super(nome, idade);
            this.username = username;
            this.senha = senha;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha) {
            this.senha = senha;
        }
    }

