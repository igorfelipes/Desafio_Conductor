import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        CadastroDeUsuarios cadastroDeUsuarios = new CadastroDeUsuarios();

        cadastroDeUsuarios.setId(9873);
        cadastroDeUsuarios.setCpf("11122244477");
        cadastroDeUsuarios.setNome("José Bonifácio");
        cadastroDeUsuarios.setDataNascimento("2019-11-26");
        cadastroDeUsuarios.setRenda("987.35");
        cadastroDeUsuarios.setNumeroDeDependentes(2);

        Gson gson = new Gson();

        String response = gson.toJson(cadastroDeUsuarios);

        try {
            FileWriter fileCadastroDeUsuarios = new FileWriter("/home/igor/Documentos/Desafio_Conductor/cadastro_de_usuarios.json");
            fileCadastroDeUsuarios.write(response);
            fileCadastroDeUsuarios.close();
        } catch (IOException error) {
            error.printStackTrace();
        }


        System.out.println(response);
    }


}
