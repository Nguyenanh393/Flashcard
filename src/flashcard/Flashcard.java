/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package flashcard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ACER
 */
public class Flashcard extends javax.swing.JFrame {

    /**
     * Creates new form Flashcard
     */
    private Map<String, String> flashcardsMap = new HashMap<>();
    private Iterator<String> flashcardIterator;
    public Flashcard() {
        initComponents();
        setTitle("Flashcard");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ArrayList<String[]> flashcards = FlashcardMenu.getFlashcards();

        for (String[] flashcard : flashcards) {
            flashcardsMap.put(flashcard[0], flashcard[1]);
        }

        flashcardIterator = flashcardsMap.keySet().iterator();
        showNextFlashcard();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nextCardButt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        upSide = new javax.swing.JButton();
        downSide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nextCardButt.setText("Tiếp theo");
        nextCardButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCardButtActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        upSide.setFont(new java.awt.Font("SimSun", 0, 48)); // NOI18N
        upSide.setText("jButton4");
        upSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upSideActionPerformed(evt);
            }
        });
        jPanel1.add(upSide, "card2");

        downSide.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        downSide.setText("jButton5");
        downSide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downSideActionPerformed(evt);
            }
        });
        jPanel1.add(downSide, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(nextCardButt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(nextCardButt)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void upSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upSideActionPerformed
        jPanel1.removeAll();
        jPanel1.add(downSide);
        jPanel1.repaint();
        jPanel1.revalidate();

    }//GEN-LAST:event_upSideActionPerformed

    public void showFlashcard(String key) {
        upSide.setText(key);
        downSide.setText(flashcardsMap.get(key));
    }

    public void showNextFlashcard() {
        if (flashcardIterator.hasNext()) {
            String nextKey = flashcardIterator.next();
            showFlashcard(nextKey);
        } else {
            flashcardIterator = flashcardsMap.keySet().iterator();
            showNextFlashcard(); 
        }
    }

    private void downSideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downSideActionPerformed
        jPanel1.removeAll();
        jPanel1.add(upSide);
        jPanel1.repaint();
        jPanel1.revalidate();
    }//GEN-LAST:event_downSideActionPerformed

    private void nextCardButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCardButtActionPerformed
        showNextFlashcard();

    }//GEN-LAST:event_nextCardButtActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Flashcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Flashcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Flashcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Flashcard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Flashcard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton downSide;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextCardButt;
    private javax.swing.JButton upSide;
    // End of variables declaration//GEN-END:variables
}
