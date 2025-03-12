package projeto.biblioteca;

public class Usuario {
    
        private String nome;
        private String cpf;
        private String endereco;
        private String telefone;
        private String email;
        private boolean emprestado;
    
        public Usuario(String nome, String cpf, String endereco, String telefone, String email, boolean emprestado) {
            this.nome = nome;
            this.cpf = cpf;
            this.endereco = endereco;
            this.telefone = telefone;
            this.email = email;
            this.emprestado = false;
        }
    
        public String getNome() {
            return nome;
        }
    
        public String getCpf() {
            return cpf;
        }
    
        public String getEndereco() {
            return endereco;
        }

        public boolean isEmprestado() {
            return emprestado;
        }
    
        public String getTelefone() {
            return telefone;
        }
    
        public String getEmail() {
            return email;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    
        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }
    
        public void setEmail(String email) {
            this.email = email;
        }

        public void setEmprestado(boolean emprestado) {
            this.emprestado = emprestado;
        }
}
