package org.example.calculadoracleber;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.ArrayList;

/**
 * Controller para a aplicação de calculadora JavaFX.
 * Gerencia a lógica de entrada, cálculo e exibição.
 */
public class CalculadoraController {

    // --- Variáveis FXML (Vinculadas ao arquivo .fxml) ---

    /** Label principal que mostra os números sendo digitados e os resultados. */
    @FXML private Label tela;
    /** Label para mostrar o histórico de cálculo mais antigo. */
    @FXML private Label historico1;
    /** Label para mostrar o histórico de cálculo intermediário. */
    @FXML private Label historico2;
    /** Label para mostrar o histórico de cálculo mais recente. */
    @FXML private Label historico3;
    /** Label para exibir mensagens de erro (ex: divisão por zero). */
    @FXML private Label erro;

    // --- Variáveis de Estado da Calculadora ---

    /** Lista para armazenar as strings das operações concluídas (para o histórico). */
    ArrayList<String> resultadosAnteriores = new ArrayList<>();
    /** Flag para controlar se o número na tela é um resultado final. */
    private boolean resultadoMostrado = false;
    /** Armazena a operação pendente (ex: "somar", "dividir"). */
    String tipoOperaçao;
    /** Armazena o primeiro operando da equação. */
    Double primeiroNumero = 0.0;
    /** Armazena o segundo operando da equação. */
    Double segundoNumero = 0.0;
    /** Armazena o resultado do último cálculo. */
    Double resultado = 0.0;
    /** String que constrói o número sendo digitado atualmente na tela. */
    String numeroNaTela = "";


    // --- Métodos de Ação (Botões Numéricos) ---

    /**
     * Manipula o clique no botão '0'.
     * @param actionEvent O evento do clique.
     */
    public void numero0OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }

        if (tela.getText().equals("0")) {
            tela.setText("0");
            numeroNaTela = "0";
        } else {
            numeroNaTela = tela.getText() + "0";
            tela.setText(numeroNaTela);
        }
    }

    /**
     * Manipula o clique no botão '1'.
     * @param actionEvent O evento do clique.
     */
    public void numero1OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }

        if (tela.getText().equals("0")) {
            tela.setText("1");
            numeroNaTela = "1";
            return;
        }
        numeroNaTela = tela.getText() + "1";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '2'.
     * @param actionEvent O evento do clique.
     */
    public void numero2OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }

        if (tela.getText().equals("0")) {
            tela.setText("2");
            numeroNaTela = "2";
            return;
        }
        numeroNaTela = tela.getText() + "2";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '3'.
     * @param actionEvent O evento do clique.
     */
    public void numero3OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }

        if (tela.getText().equals("0")) {
            tela.setText("3");
            numeroNaTela = "3";
            return;
        }
        numeroNaTela = tela.getText() + "3";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '4'.
     * @param actionEvent O evento do clique.
     */
    public void numero4OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("4");
            numeroNaTela = "4";
            return;
        }
        numeroNaTela = tela.getText() + "4";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '5'.
     * @param actionEvent O evento do clique.
     */
    public void numero5OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("5");
            numeroNaTela = "5";
            return;
        }
        numeroNaTela = tela.getText() + "5";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '6'.
     * @param actionEvent O evento do clique.
     */
    public void numero6OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("6");
            numeroNaTela = "6";
            return;
        }
        numeroNaTela = tela.getText() + "6";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '7'.
     * @param actionEvent O evento do clique.
     */
    public void numero7OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("7");
            numeroNaTela = "7";
            return;
        }
        numeroNaTela = tela.getText() + "7";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '8'.
     * @param actionEvent O evento do clique.
     */
    public void numero8OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("8");
            numeroNaTela = "8";
            return;
        }
        numeroNaTela = tela.getText() + "8";
        tela.setText(numeroNaTela);
    }

    /**
     * Manipula o clique no botão '9'.
     * @param actionEvent O evento do clique.
     */
    public void numero9OnAction(ActionEvent actionEvent) {
        erro.setText("");
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultado = 0.0;      // <<< adicione esta linha
            resultadoMostrado = false;
        }
        if (tela.getText().equals("0")) {
            tela.setText("9");
            numeroNaTela = "9";
            return;
        }
        numeroNaTela = tela.getText() + "9";
        tela.setText(numeroNaTela);
    }

    // --- Métodos de Ação (Operações Básicas) ---

    /**
     * Prepara a operação de SOMA.
     * Armazena o primeiro número e define a operação pendente.
     * @param actionEvent O evento do clique.
     */
    public void somarOnAction(ActionEvent actionEvent) {
        if (tela.getText().isEmpty()) return;
        if (numeroNaTela.equals("")) {
            return;
        }
        resultadoMostrado = false; // ✅ <-- linha adicionada para corrigir o bug
        atualizerHistorico();

        tipoOperaçao = "somar";
        if (resultado > 0.0) {
            // Se já houver um resultado, usa ele como primeiro número
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "+";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "+");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "+");
    }

    /**
     * Prepara a operação de SUBTRAÇÃO.
     * @param actionEvent O evento do clique.
     */
    public void subtrairOnAction(ActionEvent actionEvent) {
        if (tela.getText().isEmpty()) return;
        if (numeroNaTela.equals("")) {
            return;
        }
        resultadoMostrado = false;
        atualizerHistorico();

        tipoOperaçao = "subtrair";
        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "-";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "-");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "-");
    }

    /**
     * Prepara a operação de MULTIPLICAÇÃO.
     * @param actionEvent O evento do clique.
     */
    public void multiplicarOnAction(ActionEvent actionEvent) {
        if (tela.getText().isEmpty()) return;
        if (numeroNaTela.equals("")) {
            return;
        }
        resultadoMostrado = false;
        atualizerHistorico();

        tipoOperaçao = "multiplicar";
        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "x";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "x");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "x");
    }

    /**
     * Prepara a operação de DIVISÃO.
     * @param actionEvent O evento do clique.
     */
    public void dividirOnAction(ActionEvent actionEvent) {
        if (tela.getText().isEmpty()) return;
        if (numeroNaTela.equals("")) {
            return;
        }
        resultadoMostrado = false;
        atualizerHistorico();

        tipoOperaçao = "dividir";
        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "÷";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "÷");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "÷");
    }

    // --- Métodos de Ação (Operações Especiais) ---

    /**
     * Configura a operação de raiz quadrada.
     * @param actionEvent O evento do clique.
     */
    public void raizOnAction(ActionEvent actionEvent) {
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultadoMostrado = false;
        }
        atualizerHistorico();
        tipoOperaçao = "raizquadrada";

        // Define primeiroNumero apenas se houver algum número digitado antes do símbolo
        String textoAtual = tela.getText().trim();
        if (!textoAtual.isEmpty() && !textoAtual.equals("0")) {
            primeiroNumero = Double.valueOf(textoAtual);
            numeroNaTela = textoAtual + "√";
            tela.setText(numeroNaTela);
        } else {
            primeiroNumero = 0.0;
            numeroNaTela = "√";
            tela.setText(numeroNaTela);
        }
    }

    /**
     * Configura a operação de módulo (resto da divisão).
     * @param actionEvent O evento do clique.
     */
    public void modOnAction(ActionEvent actionEvent) {
        if (numeroNaTela.equals("")) {
            return;
        }
        atualizerHistorico();
        tipoOperaçao = "mod";

        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + " mod ";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + " mod ");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + " mod ");
    }

    /**
     * Configura a operação de potência (x^y).
     * @param actionEvent O evento do clique.
     */
    public void potenciaOnAction(ActionEvent actionEvent) {
        if (numeroNaTela.equals("")) {
            return;
        }
        atualizerHistorico();
        tipoOperaçao = "potencia";

        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "^";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "^");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "^");
    }

    /**
     * Adiciona um ponto decimal ao número atual.
     * @param actionEvent O evento do clique.
     */
    public void pontoOnAction(ActionEvent actionEvent) {
        atualizerHistorico();

        if (tela.getText().equals("0")) {
            tela.setText("0.");
            numeroNaTela = "0.";
        } else {
            numeroNaTela = tela.getText() + ".";
            tela.setText(numeroNaTela);
        }
    }

    /**
     * Reseta a calculadora para o estado inicial (Clear).
     * @param actionEvent O evento do clique.
     */
    public void limparOnAction(ActionEvent actionEvent) {
        erro.setText("");
        tela.setText("0");
        numeroNaTela = "";
        primeiroNumero = 0.0;
        segundoNumero = 0.0;
        resultado = 0.0;
        historico1.setText("");
        historico2.setText("");
        historico3.setText("");
        resultadosAnteriores.clear();
    }

    /**
     * Configura a operação de porcentagem.
     * @param actionEvent O evento do clique.
     */
    public void porcentagemOnAction(ActionEvent actionEvent) {
        if (numeroNaTela.equals("")) {
            return;
        }
        atualizerHistorico();
        tipoOperaçao = "porcentagem";

        if (resultado > 0.0) {
            if (resultado % 1 == 0) {
                numeroNaTela = String.valueOf(resultado.intValue()) + "%";
                tela.setText(numeroNaTela);
                return;
            }
            numeroNaTela = String.valueOf(resultado);
            tela.setText(numeroNaTela + "%");
        }
        primeiroNumero = Double.valueOf(tela.getText().trim());
        tela.setText(numeroNaTela + "%");
    }

    /**
     * Remove o último caractere da tela (Backspace).
     */
    public void backspaceOnAction() {
        if (tela.getText().length() > 0) {
            String textoAtual = tela.getText();
            String novoTexto = textoAtual.substring(0, textoAtual.length() - 1);
            tela.setText(novoTexto);
            numeroNaTela = novoTexto;
        }
        // Se apagar tudo, volta para "0"
        if (tela.getText().isEmpty()) {
            tela.setText("0");
            numeroNaTela = "0";
        }
    }

    /**
     * Configura a operação de logaritmo (base 10).
     */
    public void logOnAction() {
        if (resultadoMostrado) {
            tela.setText("");
            numeroNaTela = "";
            resultadoMostrado = false;
        }
        atualizerHistorico();
        tipoOperaçao = "log";

        // Define primeiroNumero apenas se houver algum número digitado antes do símbolo
        String textoAtual = tela.getText().trim();
        if (!textoAtual.isEmpty() && !textoAtual.equals("0")) {
            primeiroNumero = Double.valueOf(textoAtual);
            numeroNaTela = textoAtual + " log ";
            tela.setText(numeroNaTela);
        } else {
            primeiroNumero = 0.0;
            numeroNaTela = " log ";
            tela.setText(numeroNaTela);
        }
    }


    /**
     * Executa o cálculo pendente com base no 'tipoOperaçao'.
     * Este é o método principal da lógica da calculadora.
     * @param actionEvent O evento do clique.
     */
    public void igualOnAction(ActionEvent actionEvent) {
        try {
            // Executa a lógica baseada na operação armazenada
            switch (tipoOperaçao) {
                case "somar": {
                    if (resultado > 0.0) {
                        // Lógica para operações contínuas (ex: 5 + 5 + ...)
                        resultado = resultado + Double.valueOf(tela.getText().split("\\+")[1]);

                        // Formata o histórico
                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        // Formata a tela (remove .0 se for inteiro)
                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                    } else {
                        // Lógica para a primeira operação (ex: 10 + 5)
                        segundoNumero = Double.valueOf(tela.getText().split("\\+")[1]);
                        resultado = primeiroNumero + segundoNumero;

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));
                    }
                    break;
                }

                case "subtrair": {
                    if (resultado > 0.0) {
                        resultado = resultado - Double.valueOf(tela.getText().split("-")[1]);

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                    } else {
                        segundoNumero = Double.valueOf(tela.getText().split("-")[1]);
                        resultado = primeiroNumero - segundoNumero;

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));
                    }
                    break;
                }

                case "multiplicar": {
                    if (resultado > 0.0) {
                        resultado = resultado * Double.valueOf(tela.getText().split("x")[1]);

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                    } else {
                        segundoNumero = Double.valueOf(tela.getText().split("x")[1]);
                        resultado = primeiroNumero * segundoNumero;

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }
                    }
                    break;
                }

                case "dividir": {
                    double divisor = Double.valueOf(tela.getText().split("÷")[1]);

                    // Tratamento de erro para divisão por zero
                    if (divisor == 0.0) {
                        tela.setText("0");
                        erro.setText("Erro: Não é possível dividir por zero.");
                        resultado = 0.0;
                        resultadoMostrado = true;
                        return;
                    }

                    if (resultado > 0.0) {
                        resultado = resultado / divisor;
                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));
                    } else {
                        segundoNumero = divisor;
                        resultado = primeiroNumero / segundoNumero;

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));
                    }
                    break;
                }

                case "potencia": {
                    if (resultado > 0.0) {
                        resultado = Math.pow(resultado, Double.valueOf(tela.getText().split("\\^")[1]));

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));
                    } else {
                        segundoNumero = Double.valueOf(tela.getText().split("\\^")[1]);
                        resultado = Math.pow(primeiroNumero, segundoNumero);

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }
                    }
                    break;
                }

                case "mod": {
                    if (resultado > 0.0) {
                        resultado = resultado % Double.valueOf(tela.getText().split(" mod ")[1]);

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                    } else {
                        segundoNumero = Double.valueOf(tela.getText().split(" mod ")[1]);
                        resultado = primeiroNumero % segundoNumero;

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }
                    }
                    break;
                }

                case "porcentagem": {
                    if (resultado > 0.0) {
                        resultado = (resultado / 100) * Double.valueOf(tela.getText().split("%")[1]);

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                    } else {
                        segundoNumero = Double.valueOf(tela.getText().split("%")[1]);
                        resultado = (primeiroNumero / 100) * segundoNumero;

                        if (resultado % 1 == 0) {
                            tela.setText(String.valueOf(resultado.intValue()));
                            resultadoMostrado = true;
                            return;
                        }
                        tela.setText(String.valueOf(resultado));

                        if (resultado % 1 == 0) {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                            resultadosAnteriores.add(numeroNaTela);
                        } else {
                            numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                            resultadosAnteriores.add(numeroNaTela);
                        }
                    }
                    break;
                }

                case "raizquadrada": {
                    segundoNumero = Double.valueOf(tela.getText().split("√")[1]);

                    if (primeiroNumero == 0.0) {
                        // Se for só "√9"
                        resultado = Math.sqrt(segundoNumero);
                    } else {
                        // Se for "5√9" (5 * sqrt(9))
                        resultado = primeiroNumero * (Math.sqrt(segundoNumero));
                    }

                    if (resultado % 1 == 0) {
                        tela.setText(String.valueOf(resultado.intValue()));
                        resultadoMostrado = true;
                        return;
                    }
                    tela.setText(String.valueOf(resultado));

                    if (resultado % 1 == 0) {
                        numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                        resultadosAnteriores.add(numeroNaTela);
                    } else {
                        numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                        resultadosAnteriores.add(numeroNaTela);
                    }
                    break;
                }

                case "log": {
                    segundoNumero = Double.valueOf(tela.getText().split(" log ")[1]);

                    if (primeiroNumero == 0.0) {
                        // Se for só "log 100"
                        resultado = Math.log10(segundoNumero);
                    } else {
                        // Se for "5 log 100" (5 * log10(100))
                        resultado = primeiroNumero * (Math.log10(segundoNumero));
                    }

                    if (resultado % 1 == 0) {
                        tela.setText(String.valueOf(resultado.intValue()));
                        resultadoMostrado = true;
                        return;
                    }
                    tela.setText(String.valueOf(resultado));

                    if (resultado % 1 == 0) {
                        numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado.intValue());
                        resultadosAnteriores.add(numeroNaTela);
                    } else {
                        numeroNaTela = numeroNaTela + "=" + String.valueOf(resultado);
                        resultadosAnteriores.add(numeroNaTela);
                    }
                    break;
                }

                default:
                    break;
            }

            // Marca que o cálculo foi concluído
            resultadoMostrado = true;

        } catch (Exception e) {
            // Captura genérica para entradas malformadas (ex: 5 + =)
            tela.setText("0");
            erro.setText("Erro: Operação inválida");
            resultadoMostrado = true;
        }
    }


    // --- Métodos Utilitários ---

    /**
     * Atualiza os três labels de histórico com os resultados mais recentes
     * da lista 'resultadosAnteriores'.
     */
    private void atualizerHistorico() {
        if (resultadosAnteriores.size() == 1) {
            historico3.setText(resultadosAnteriores.get(0));
        } else if (resultadosAnteriores.size() == 2) {
            historico3.setText(resultadosAnteriores.get(1));
            historico2.setText(resultadosAnteriores.get(0));
        } else if (resultadosAnteriores.size() == 3) {
            historico3.setText(resultadosAnteriores.get(2));
            historico2.setText(resultadosAnteriores.get(1));
            historico1.setText(resultadosAnteriores.get(0));
        } else if (resultadosAnteriores.size() >= 3) {
            // Se houver mais de 3, mostra os 3 últimos
            historico1.setText(resultadosAnteriores.get(resultadosAnteriores.size() - 3));
            historico2.setText(resultadosAnteriores.get(resultadosAnteriores.size() - 2));
            historico3.setText(resultadosAnteriores.get(resultadosAnteriores.size() - 1));
        }
    }
}