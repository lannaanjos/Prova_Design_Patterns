public class ComprovanteMatriculaBr extends AbsComprovanteMatricula {
    protected String cpf;
    
    @Override
    public String informarComprovante(){
        return String.format("Comprovante de Matrícula Brasileiro | CPF: %s", cpf);
    }
}