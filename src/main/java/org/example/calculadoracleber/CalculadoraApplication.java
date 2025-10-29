package org.example.calculadoracleber;

// Importações necessárias do JavaFX
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Classe principal da aplicação JavaFX.
 * Esta classe é responsável por carregar a interface gráfica e iniciar a janela.
 */
public class CalculadoraApplication extends Application {

    /**
     * O método 'start' é o ponto de entrada principal para todas as aplicações JavaFX.
     * @param stage O "palco" principal (a janela da aplicação)
     * @throws IOException Se o arquivo FXML não puder ser carregado
     */
    @Override
    public void start(Stage stage) throws IOException {

        // 1. Carrega o arquivo FXML que define a estrutura da interface do usuário
        FXMLLoader fxmlLoader = new FXMLLoader(CalculadoraApplication.class.getResource("calculadora.fxml"));

        // 2. Cria uma nova "Cena" (Scene)
        // O FXML é carregado (.load()) e as dimensões iniciais (360x673) são definidas.
        Scene scene = new Scene(fxmlLoader.load(), 360  , 673);

        // 3. Vincula a folha de estilo CSS (style.css) à cena
        scene.getStylesheets().add(getClass().getResource("/css/style.css").toExternalForm());

        // 4. Define as dimensões mínimas da janela
        // (Impede que o usuário redimensione a janela para um tamanho menor que o definido)
        stage.setMinWidth(360);
        stage.setMinHeight(673);

        // 5. Define o título que aparecerá na barra da janela
        stage.setTitle("Calculadora");

        // 6. Coloca a cena (com o FXML e CSS) dentro do palco (janela)
        stage.setScene(scene);

        // 7. Exibe a janela para o usuário
        stage.show();

    }

    /**
     * O método main() é frequentemente usado para lançar a aplicação JavaFX.
     * (Embora IDEs modernas possam fazer isso automaticamente)
     */
    // public static void main(String[] args) {
    //     launch(args);
    // }
}