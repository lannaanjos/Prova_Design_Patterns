public class ComprovanteMatriculaCh extends AbsComprovanteMatricula {
    protected String rut;
    
    @Override
    public String informarComprovante(){
        return String.format("Comprovante de Matrícula Chileno | RUT: %s", rut);
    }
}