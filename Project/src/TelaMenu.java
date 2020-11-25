import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaMenu extends javax.swing.JFrame {

    double vetor[][];
    String[] letras = null;
    String equacoes = "";
    String[][] variaveis = null;
    int qtdEquacoes = 0;
    ArrayList<String> equacoesEntrada = new ArrayList<>();

    public TelaMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgDecisao = new javax.swing.ButtonGroup();
        fillerTituloDir = new javax.swing.Box.Filler(new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 0), new java.awt.Dimension(30, 32767));
        lblBaseInicial = new javax.swing.JLabel();
        fillerTituloEsq = new javax.swing.Box.Filler(new java.awt.Dimension(300, 1), new java.awt.Dimension(300, 1), new java.awt.Dimension(300, 32767));
        lblTitulo = new javax.swing.JLabel();
        txtEquacao = new javax.swing.JTextField();
        lblBaseDesejada = new javax.swing.JLabel();
        btnSim = new javax.swing.JRadioButton();
        btnNao = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableEquacoes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableValores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        fillerTituloDir.setBackground(new java.awt.Color(0, 0, 0));
        fillerTituloDir.setOpaque(true);

        lblBaseInicial.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBaseInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBaseInicial.setText("Insira a Equação:");

        fillerTituloEsq.setBackground(new java.awt.Color(0, 0, 0));
        fillerTituloEsq.setOpaque(true);

        lblTitulo.setFont(new java.awt.Font("AR JULIAN", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Método de Eliminação de Gauss");

        txtEquacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtEquacao.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEquacao.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEquacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEquacaoActionPerformed(evt);
            }
        });

        lblBaseDesejada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblBaseDesejada.setText("Deseja inserir outra equação?");

        btgDecisao.add(btnSim);
        btnSim.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSim.setText("Sim");
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });

        btgDecisao.add(btnNao);
        btnNao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnNao.setText("Não");
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });

        tableEquacoes.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tableEquacoes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EXPRESSÕES ENTRADAS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableEquacoes);

        tableValores.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        tableValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VALORES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableValores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(fillerTituloEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBaseInicial, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblBaseDesejada)
                                .addGap(18, 18, 18)
                                .addComponent(btnSim)
                                .addGap(18, 18, 18)
                                .addComponent(btnNao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fillerTituloDir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(fillerTituloDir, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(fillerTituloEsq, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseInicial)
                    .addComponent(txtEquacao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBaseDesejada)
                    .addComponent(btnSim)
                    .addComponent(btnNao))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
        txtEquacao.setText("");
        txtEquacao.requestFocus();
    }//GEN-LAST:event_btnSimActionPerformed

    private void txtEquacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEquacaoActionPerformed
        equacoesEntrada.add(txtEquacao.getText());
        equacoes = quebrarString();

        System.err.println("equacoes: " + equacoes);
    }//GEN-LAST:event_txtEquacaoActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        inserirValorNoVetor();
        resolverVetor();
        imprimirVetor();
    }//GEN-LAST:event_btnNaoActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgDecisao;
    private javax.swing.JRadioButton btnNao;
    private javax.swing.JRadioButton btnSim;
    private javax.swing.Box.Filler fillerTituloDir;
    private javax.swing.Box.Filler fillerTituloEsq;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBaseDesejada;
    private javax.swing.JLabel lblBaseInicial;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tableEquacoes;
    private javax.swing.JTable tableValores;
    private javax.swing.JTextField txtEquacao;
    // End of variables declaration//GEN-END:variables

    public boolean validarCamposObrigatorios() {

        if (txtEquacao.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Insira a equação desejada!");
            txtEquacao.requestFocus();
            return false;
        }

        return true;
    }

    
    // Método para pegar a expressão entrada e separar-la de duas maneiras: num vetor ficam os números, em outro ficam as variáveis
    public String quebrarString() {
        String[] numeros = null;
        String valEquaNum = "";

        for (int i = 0; i < equacoesEntrada.size(); i++) {

            System.err.println("Equação " + (i + 1) + ": " + equacoesEntrada.get(i));

            numeros = equacoesEntrada.get(i).replace("a", "").replace("b", "").replace("c", "").replace("d", "")
                    .replace("e", "").replace("f", "").replace("x", "").replace("y", "").replace("z", "").split(" ");

            letras = equacoesEntrada.get(i).replace("0", "").replace("1", "").replace("2", "").replace("3", "")
                    .replace("4", "").replace("5", "").replace("6", "").replace("7", "").replace("8", "").replace("9", "")
                    .replace("+", "").replace("-", "").replace("=", "").replace(" ", ";").replace(";", "").split("");

            for (int j = 1; j <= numeros.length; j++) {

                if (numeros[j - 1].equals("-")) {
                    numeros[j] = numeros[j - 1] + numeros[j];
                }

                if (!numeros[j - 1].equals("-") && !numeros[j - 1].equals("+") && !numeros[j - 1].equals("=")) {
                    valEquaNum += numeros[j - 1] + "/";
                }
            }

            valEquaNum += "; ";

        }

        for (int c = 0; c < letras.length; c++) {
            System.err.println("letras[" + c + "]: " + letras[c]);
        }

        return valEquaNum;
    }

    
    // Método que realiza a inserção dos valores obtidos no método quebrarString() dentro de vetores para poder realizar o
    // cálculo necessário para obter os valores do sistema de equações lineares
    public void inserirValorNoVetor() {

        String[] equa = null, v = null;
        String[][] vet = null;

        equa = equacoes.replace("/", " ").split(" ");
        int virgulas = 0, qtdNumeros = 0, incrementador = 0;
        double valorMult = 0.00;

        for (String e : equa) {

            if (e.equals(";")) {
                virgulas++;
            } else {
                qtdNumeros++;
            }

        }

        int tamColuna = qtdNumeros / virgulas;
        qtdEquacoes = virgulas;

        vetor = new double[qtdEquacoes][tamColuna];
        vet = new String[qtdEquacoes][tamColuna];

        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet[i].length; j++) {

                if (equa[incrementador].equals(";")) {
                    incrementador++;
                }
                vet[i][j] = equa[incrementador];
                incrementador++;

            }
        }

        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length; j++) {
                vetor[i][j] = Double.parseDouble(vet[i][j]);
            }
        }

        // laço que realiza o pivoteamento, ou seja, vai zerando os termos abaixo do pivô
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length - 1; j++) {
                if (vetor[j][i] != 0.00 && j == i) {
                    int cont = j + 1;
                    while (cont < vetor[i].length - 1) {

                        valorMult = vetor[cont][i] / vetor[i][i];

                        for (int c = 0; c < vetor[i].length; c++) {
                            double numero = vetor[cont][c] - valorMult * vetor[i][c];
                            vetor[cont][c] = numero;
                        }

                        cont++;
                    }
                }
            }
        }
    }

    // Método que resolve o vetor para descobrir os valores do sistema de equações lineares
    public double resolverVetor() {

        int tamVet = letras.length;
        variaveis = new String[tamVet][2];
        double x = 0.00, y = 0.00, resultado = 0.0;

        // Neste laço é pego as variáveis e seus valores e armazenados em um vetor
        for (int i = 0; i < tamVet; i++) {
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    variaveis[i][j] = letras[i];
                } else {
                    variaveis[i][j] = Double.toString(0.00);
                }

            }
        }

        double valorSoma = 0.00, vet = 0.00;

        // Neste laço é realizado a operação das expressões do sistema linear
        for (int i = vetor.length - 1; i >= 0; i--) {
            int cont = variaveis.length;
            for (int j = 0; j < vetor[i].length; j++) {
                if (vetor[i][j] != 0) {
                    if (j == vetor[i].length - 1 && i == vetor.length - 1) {
                        valorSoma = vetor[vetor.length - 1][vetor[i].length - (1)] / vetor[vetor.length - 1][vetor[i].length - 2];
                        variaveis[i][1] = arredondar(valorSoma);

                    } else if (i < vetor.length - 1) {
                        if (j < cont && Double.parseDouble(variaveis[j][1]) != 0) {
                            if ((vetor[i][j] * Double.parseDouble(variaveis[j][1])) > 0) {
                                vet = (vetor[i][j] * Double.parseDouble(variaveis[j][1])) * (-1);
                                valorSoma = (vetor[i][vetor[i].length - 1] + vet) / vetor[i][i];

                            } else {
                                vet += (vetor[i][j] * Double.parseDouble(variaveis[j][1])) * -1;
                                valorSoma = (vetor[i][vetor[i].length - 1] + vet) / vetor[i][i];

                            }
                        }
                    }
                    variaveis[i][1] = arredondar(valorSoma);
                }
            }
            vet = 0;
        }

        return 0.00;
    }

    // Este método é responsável por imprivir os valores obtidos através da resolução do Sistema Linear
    public void imprimirVetor() {

        String valores = "", expressoes = "";
        

        for (int i = 0; i < variaveis.length; i++) {
            for (int j = 0; j < 1; j++) {
                DefaultTableModel modelo = (DefaultTableModel) tableEquacoes.getModel();
                DefaultTableModel model = (DefaultTableModel) tableValores.getModel();
                
                expressoes = equacoesEntrada.get(i);
                valores = variaveis[i][0] + " = " + variaveis[i][1];
                
                modelo.addRow(new String[]{expressoes});
                model.addRow(new String[]{valores});
                tableEquacoes.setModel(modelo);
                tableValores.setModel(model);
            }
        }
    }

    // Este método é responsável pelo arredondamento de valores double
    public String arredondar(double valor) {

        DecimalFormat formatter = new DecimalFormat("#0.00");

        return formatter.format(valor).replace(",", ".");
    }

}
