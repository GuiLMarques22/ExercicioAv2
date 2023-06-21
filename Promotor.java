public class Promotor extends Pessoa {
            private String empresa;

        public Promotor(String nome, int idade, String empresa) {
            super(nome, idade);
            this.empresa = empresa;
        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }
    }


