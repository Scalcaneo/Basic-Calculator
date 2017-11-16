
package calculadora;
import java.math.*;

public class CalculadoraGrafica extends javax.swing.JFrame {

    String primerNumero;
    String segundoNumero;
    String signo;
    static String ans;
    
    public CalculadoraGrafica() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        pantallaDeCalculadora = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton20.setBackground(new java.awt.Color(0, 0, 0));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("-");
        jButton20.setToolTipText("");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("÷");
        jButton21.setToolTipText("");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("×");
        jButton22.setToolTipText("");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(255, 102, 0));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("AC");
        jButton23.setToolTipText("");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(255, 102, 0));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("DEL");
        jButton24.setToolTipText("");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("4");
        jButton1.setToolTipText("");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("7");
        jButton3.setToolTipText("");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("5");
        jButton4.setToolTipText("");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton27.setBackground(new java.awt.Color(0, 0, 0));
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("√ ");
        jButton27.setToolTipText("");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("2");
        jButton5.setToolTipText("");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton29.setBackground(new java.awt.Color(0, 0, 0));
        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setText("X²");
        jButton29.setToolTipText("");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("8");
        jButton6.setToolTipText("");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton30.setBackground(new java.awt.Color(0, 0, 0));
        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setText("X°");
        jButton30.setToolTipText("");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("6");
        jButton7.setToolTipText("");
        jButton7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton31.setBackground(new java.awt.Color(102, 102, 102));
        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setText("Ln");
        jButton31.setToolTipText("");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("3");
        jButton8.setToolTipText("");
        jButton8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton32.setBackground(new java.awt.Color(0, 0, 0));
        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setText("1/X");
        jButton32.setToolTipText("");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("9");
        jButton9.setToolTipText("");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("1");
        jButton10.setToolTipText("");
        jButton10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText(".");
        jButton11.setToolTipText("");
        jButton11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("=");
        jButton14.setToolTipText("");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("0");
        jButton15.setToolTipText("");
        jButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Ans");
        jButton16.setToolTipText("");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Sin");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Cos");
        jButton17.setToolTipText("");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Tan");
        jButton18.setToolTipText("");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("+");
        jButton19.setToolTipText("");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        jLabel1.setText("Casi CASIO");

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("π");
        jButton12.setToolTipText("");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton30)
                            .addComponent(jButton32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton29)
                            .addComponent(jButton27))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton12)
                        .addGap(42, 42, 42)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton3))
                                        .addComponent(jButton10)
                                        .addComponent(jButton15))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton5)
                                        .addComponent(jButton4)
                                        .addComponent(jButton6)
                                        .addComponent(jButton11))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7)
                                        .addComponent(jButton8)
                                        .addComponent(jButton9))
                                    .addGap(104, 104, 104)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(14, 14, 14))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton24)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton23))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addComponent(pantallaDeCalculadora))
                    .addGap(3, 3, 3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton30)
                        .addComponent(jButton29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton27)
                            .addComponent(jButton32))))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(pantallaDeCalculadora, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton31))
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(27, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static String resultado(String numero1, String numero2, String signo){
        Double resultado=0.0;
        String respuesta;
        
        if(signo.equals("+")){
            resultado=Double.parseDouble(numero1)+Double.parseDouble(numero2);
        }
        if(signo.equals("-")){
            resultado=Double.parseDouble(numero1)-Double.parseDouble(numero2);
        }
        if(signo.equals("÷")){
            resultado=Double.parseDouble(numero1)/Double.parseDouble(numero2);
        }
        if(signo.equals("×")){
            resultado=Double.parseDouble(numero1)*Double.parseDouble(numero2);
        }
        if(signo.equals("^")){
            resultado=Math.pow(Double.parseDouble(numero1),Double.parseDouble(numero2));
        }
        respuesta= resultado.toString();
        ans=respuesta;
        return respuesta;
    }
    
    
    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        if(!pantallaDeCalculadora.getText().equals("")){
           primerNumero=pantallaDeCalculadora.getText();
           signo="×";
           pantallaDeCalculadora.setText("");
       }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        pantallaDeCalculadora.setText("");
        primerNumero="0";
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        String cadena=pantallaDeCalculadora.getText();
        if(cadena.length()>0){
            cadena=cadena.substring(0,cadena.length()-1);
            pantallaDeCalculadora.setText(cadena);
        }

    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "4");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "7");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "5");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "2");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "8");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "6");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "3");
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        String cadena=pantallaDeCalculadora.getText();
        Double num;
        if(cadena.length()>0){
            num=1/(Double.parseDouble(cadena));
            pantallaDeCalculadora.setText(num.toString());
            ans=num.toString();
        }
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "9");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "1");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        String cadena;
        cadena=pantallaDeCalculadora.getText();
        
        if(cadena.length()<=0){
            pantallaDeCalculadora.setText("0.");
        }
        else{
            if(!verificarPunto(pantallaDeCalculadora.getText())){
                pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + ".");
            }
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "0");
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.sin(resultado);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
       if(!pantallaDeCalculadora.getText().equals("")){
           primerNumero=pantallaDeCalculadora.getText();
           signo="-";
           pantallaDeCalculadora.setText("");
       }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      if(!pantallaDeCalculadora.getText().equals("")){
           primerNumero=pantallaDeCalculadora.getText();
           signo="+";
           pantallaDeCalculadora.setText("");
       }
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
           if(!pantallaDeCalculadora.getText().equals("")){
           primerNumero=pantallaDeCalculadora.getText();
           signo="÷";
           pantallaDeCalculadora.setText("");
       }
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String resultado;
        segundoNumero=pantallaDeCalculadora.getText();
        if(!segundoNumero.equals("")){
            resultado=resultado(primerNumero,segundoNumero,signo);
            pantallaDeCalculadora.setText(resultado);
        }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        pantallaDeCalculadora.setText(ans);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.log(resultado);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.sqrt(resultado);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.cos(resultado);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.tan(resultado);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        Double resultado=(Double.parseDouble(pantallaDeCalculadora.getText()));
        resultado=Math.pow(resultado,2);
        pantallaDeCalculadora.setText(resultado.toString());
        ans=resultado.toString();
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
         if(!pantallaDeCalculadora.getText().equals("")){
           primerNumero=pantallaDeCalculadora.getText();
           signo="^";
           pantallaDeCalculadora.setText("");
         }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        pantallaDeCalculadora.setText(pantallaDeCalculadora.getText() + "3.141592653589793238462643383279502884197169399375105820974944592307816406286" +
"208998628034825342117067982148086513282306647093844609550582231725359408128481" +
"117450284102701938521105559644622948954930381964428810975665933446128475648233" +
"786783165271201909145648566923460348610454326648213393607260249141273724587006" +
"606315588174881520920962829254091715364367892590360011330530548820466521384146" +
"951941511609433057270365759591953092186117381932611793105118548074462379962749" +
"567351885752724891227938183011949129833673362440656643086021394946395224737190" +
"702179860943702770539217176293176752384674818467669405132000568127145263560827" +
"785771342757789609173637178721468440901224953430146549585371050792279689258923" +
"542019956112129021960864034418159813629774771309960518707211349999998372978049" +
"951059731732816096318595024459455346908302642522308253344685035261931188171010" +
"003137838752886587533208381420617177669147303598253490428755468731159562863882" +
"353787593751957781857780532171226806613001927876611195909216420198938095257201" +
"065485863278865936153381827968230301952035301852968995773622599413891249721775" +
"283479131515574857242454150695950829533116861727855889075098381754637464939319" +
"255060400927701671139009848824012858361603563707660104710181942955596198946767" +
"837449448255379774726847104047534646208046684259069491293313677028989152104752" +
"162056966024058038150193511253382430035587640247496473263914199272604269922796" +
"782354781636009341721641219924586315030286182974555706749838505494588586926995" +
"690927210797509302955321165344987202755960236480665499119881834797753566369807" +
"426542527862551818417574672890977772793800081647060016145249192173217214772350" +
"141441973568548161361157352552133475741849468438523323907394143334547762416862" +
"518983569485562099219222184272550254256887671790494601653466804988627232791786" +
"085784383827967976681454100953883786360950680064225125205117392984896084128488" +
"626945604241965285022210661186306744278622039194945047123713786960956364371917" +
"287467764657573962413890865832645995813390478027590099465764078951269468398352" +
"595709825822620522489407726719478268482601476990902640136394437455305068203496" +
"252451749399651431429809190659250937221696461515709858387410597885959772975498" +
"930161753928468138268683868942774155991855925245953959431049972524680845987273" +
"644695848653836736222626099124608051243884390451244136549762780797715691435997" +
"700129616089441694868555848406353422072225828488648158456028506016842739452267" +
"467678895252138522549954666727823986456596116354886230577456498035593634568174" +
"324112515076069479451096596094025228879710893145669136867228748940560101503308" +
"617928680920874760917824938589009714909675985261365549781893129784821682998948" +
"722658804857564014270477555132379641451523746234364542858444795265867821051141" +
"354735739523113427166102135969536231442952484937187110145765403590279934403742" +
"007310578539062198387447808478489683321445713868751943506430218453191048481005" +
"370614680674919278191197939952061419663428754440643745123718192179998391015919" +
"561814675142691239748940907186494231961567945208095146550225231603881930142093" +
"762137855956638937787083039069792077346722182562599661501421503068038447734549" +
"202605414665925201497442850732518666002132434088190710486331734649651453905796" +
"268561005508106658796998163574736384052571459102897064140110971206280439039759" +
"515677157700420337869936007230558763176359421873125147120532928191826186125867" +
"321579198414848829164470609575270695722091756711672291098169091528017350671274" +
"858322287183520935396572512108357915136988209144421006751033467110314126711136" +
"990865851639831501970165151168517143765761835155650884909989859982387345528331" +
"635507647918535893226185489632132933089857064204675259070915481416549859461637" +
"180270981994309924488957571282890592323326097299712084433573265489382391193259" +
"746366730583604142813883032038249037589852437441702913276561809377344403070746" +
"921120191302033038019762110110044929321516084244485963766983895228684783123552" +
"658213144957685726243344189303968642624341077322697802807318915441101044682325" +
"271620105265227211166039666557309254711055785376346682065310989652691862056476" +
"931257058635662018558100729360659876486117910453348850346113657686753249441668" +
"039626579787718556084552965412665408530614344431858676975145661406800700237877" +
"659134401712749470420562230538994561314071127000407854733269939081454664645880" +
"797270826683063432858785698305235808933065757406795457163775254202114955761581" +
"400250126228594130216471550979259230990796547376125517656751357517829666454779" +
"174501129961489030463994713296210734043751895735961458901938971311179042978285" +
"647503203198691514028708085990480109412147221317947647772622414254854540332157" +
"185306142288137585043063321751829798662237172159160771669254748738986654949450" +
"114654062843366393790039769265672146385306736096571209180763832716641627488880" +
"078692560290228472104031721186082041900042296617119637792133757511495950156604" +
"963186294726547364252308177036751590673502350728354056704038674351362222477158" +
"915049530984448933309634087807693259939780541934144737744184263129860809988868" +
"741326047215695162396586457302163159819319516735381297416772947867242292465436" +
"680098067692823828068996400482435403701416314965897940924323789690706977942236" +
"250822168895738379862300159377647165122893578601588161755782973523344604281512" +
"627203734314653197777416031990665541876397929334419521541341899485444734567383" +
"162499341913181480927777103863877343177207545654532207770921201905166096280490" +
"926360197598828161332316663652861932668633606273567630354477628035045077723554" +
"710585954870279081435624014517180624643626794561275318134078330336254232783944" +
"975382437205835311477119926063813346776879695970309833913077109870408591337464" +
"144282277263465947047458784778720192771528073176790770715721344473060570073349" +
"243693113835049316312840425121925651798069411352801314701304781643788518529092" +
"854520116583934196562134914341595625865865570552690496520985803385072242648293" +
"972858478316305777756068887644624824685792603953527734803048029005876075825104" +
"747091643961362676044925627420420832085661190625454337213153595845068772460290" +
"161876679524061634252257719542916299193064553779914037340432875262888963995879" +
"475729174642635745525407909145135711136941091193932519107602082520261879853188" +
"770584297259167781314969900901921169717372784768472686084900337702424291651300" +
"500516832336435038951702989392233451722013812806965011784408745196012122859937" +
"162313017114448464090389064495444006198690754851602632750529834918740786680881" +
"833851022833450850486082503930213321971551843063545500766828294930413776552793" +
"975175461395398468339363830474611996653858153842056853386218672523340283087112" +
"328278921250771262946322956398989893582116745627010218356462201349671518819097" +
"303811980049734072396103685406643193950979019069963955245300545058068550195673" +
"022921913933918568034490398205955100226353536192041994745538593810234395544959" +
"778377902374216172711172364343543947822181852862408514006660443325888569867054" +
"315470696574745855033232334210730154594051655379068662733379958511562578432298" +
"827372319898757141595781119635833005940873068121602876496282");    
    }//GEN-LAST:event_jButton12ActionPerformed

     public static boolean verificarPunto(String cadena){
        boolean resultado=false;
        int i;
        for(i=0;i<cadena.length(); i++){
            if(cadena.substring(i, i+1).equals(".")){
                resultado=true;
                break;
            }
        }
        return resultado;
    }
    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField pantallaDeCalculadora;
    // End of variables declaration//GEN-END:variables
}
