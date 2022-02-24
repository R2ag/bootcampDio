import com.rlag.bootcamp.model.Bootcamp;
import com.rlag.bootcamp.model.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso teste 1");
        curso1.setCargaHoraria(10);
        curso1.setDescricao("curso de teste");
        Curso curso2 = new Curso();
        curso2.setTitulo("curso teste 2");
        curso2.setCargaHoraria(10);
        curso2.setDescricao("curso de teste 2");
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java teste");
        bootcamp.setDescricao("desc teste");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);

    }
}
