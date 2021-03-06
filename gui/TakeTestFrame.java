
package TechQuizApp.gui;

import TechQuizApp.dao.PerformanceDao;
import TechQuizApp.dao.QuestionDao;
import TechQuizApp.pojo.AnswerPojo;
import TechQuizApp.pojo.AnswerStore;
import TechQuizApp.pojo.ExamPojo;
import TechQuizApp.pojo.PerformancePojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import TechQuizApp.pojo.UserProfile;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepesh Dasani
 */
public class TakeTestFrame extends javax.swing.JFrame {

    /**
     * Creates new form TakeTestFrame
     */
    
    AnswerStore astore;
    QuestionStore qstore;
    int pos;
    int qno=1;
    
    ExamPojo exam;
    public TakeTestFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        lblusername.setText("Hello "+UserProfile.getUsername());
        qstore=new QuestionStore();
        astore=new AnswerStore();
    }

    TakeTestFrame(ExamPojo exam) {
        this();
        this.exam=exam;
        this.loadQuestion();
        this.showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel20 = new javax.swing.JPanel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        lbllogout = new javax.swing.JLabel();
        lblusername = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        txtQuestion = new javax.swing.JTextArea();
        btnNext = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        jrbOp1 = new javax.swing.JRadioButton();
        jrbOp3 = new javax.swing.JRadioButton();
        jrbOp4 = new javax.swing.JRadioButton();
        jrbOp2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel20.setBackground(new java.awt.Color(0, 0, 0));

        jLabel192.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 153, 0));
        jLabel192.setText("Attemping Java Paper");

        lbllogout.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbllogout.setForeground(new java.awt.Color(255, 153, 0));
        lbllogout.setText("Logout");

        lblusername.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblusername.setForeground(new java.awt.Color(255, 153, 0));
        lblusername.setText("Hello User");

        lblQno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 0));
        lblQno.setText("Questions no :1");

        txtQuestion.setColumns(20);
        txtQuestion.setRows(5);
        jScrollPane20.setViewportView(txtQuestion);

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnDone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jButton80.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton80.setText("Cancel");
        jButton80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton80ActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPrevious.setText("Previous");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        jrbOp1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOp1);
        jrbOp1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrbOp1.setForeground(new java.awt.Color(255, 153, 0));
        jrbOp1.setText("Option 1");

        jrbOp3.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOp3);
        jrbOp3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrbOp3.setForeground(new java.awt.Color(255, 153, 0));
        jrbOp3.setText("Option 3");

        jrbOp4.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOp4);
        jrbOp4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrbOp4.setForeground(new java.awt.Color(255, 153, 0));
        jrbOp4.setText("Option 4");
        jrbOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOp4ActionPerformed(evt);
            }
        });

        jrbOp2.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrbOp2);
        jrbOp2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrbOp2.setForeground(new java.awt.Color(255, 153, 0));
        jrbOp2.setText("Option 2");
        jrbOp2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbOp2ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\JAVA Folder\\Java Project ppt\\TECH QUIZ APP\\onlineexam\\good luck2.jpg")); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblusername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbllogout)
                .addGap(28, 28, 28))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbOp1)
                            .addComponent(jrbOp3))
                        .addGap(171, 171, 171)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrbOp4)
                            .addComponent(jrbOp2)))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnPrevious)
                        .addGap(51, 51, 51)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addComponent(lblQno)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel193))))
                        .addGap(519, 519, 519)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbllogout)
                    .addComponent(lblusername))
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQno))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel193)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jrbOp1))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jrbOp2)))
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jrbOp3))
                            .addGroup(jPanel20Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jrbOp4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(154, 154, 154))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                                .addComponent(btnDone, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))))
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newAnswer=new AnswerPojo(exam.getExamId(),qno,chosenAnswer,correctAnswer,exam.getLanguage());
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(answer);
            else{
                if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(apos,answer);
                }
            }
        }
        pos--;
        if(pos<0)
            pos=qstore.getCount()-1;
        qno--;
        if(qno<=0)
            qno=qstore.getCount();
        lblQno.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void jButton80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton80ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton80ActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
        // TODO add your handling code here:
        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newAnswer=new AnswerPojo(exam.getExamId(),qno,chosenAnswer,correctAnswer,exam.getLanguage());
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(newAnswer);
            else{
                if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(apos,newAnswer);
                }
            }
        }
        int right=0,wrong=0;
        for(QuestionPojo question:qstore.getAllQuestions()){
            int qno=question.getQno();
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                continue;
            else{
                String chosenAnswer1=answer.getChosenAnswer();
                System.out.println("anand"+chosenAnswer1);
                String correctAnswer=answer.getCorrectAnswer();
                System.out.println("hemant"+correctAnswer);
                if(chosenAnswer1.equals(correctAnswer)==true)
                    ++right;
                else
                    ++wrong;
            }
        }
        try{
        String reportCard="total Questions: "+qstore.getCount();
        reportCard+="\nRight Answer: "+right;
        reportCard+="\nWrong Answer: "+wrong;
        reportCard+="\nUnAttempted: "+(qstore.getCount()-(right+wrong));
        JOptionPane.showMessageDialog(null, reportCard,"Your Result!",JOptionPane.INFORMATION_MESSAGE);
        PerformancePojo performance=new PerformancePojo(exam.getExamId(),exam.getLanguage(),UserProfile.getUsername(),right,wrong,(qstore.getCount()-(right+wrong)),(double)right/qstore.getCount()*100);
        PerformanceDao.addPerformance(performance);
        JOptionPane.showMessageDialog(null, "Your Performance have been Successfully added to the database","Performance Added!",JOptionPane.INFORMATION_MESSAGE);
       StudentsOptionFrame optionFrame=new StudentsOptionFrame();
        optionFrame.setVisible(true);
        this.dispose();
    }
    catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error accessing database","Error!",JOptionPane.ERROR_MESSAGE);
    ex.printStackTrace();
    }//GEN-LAST:event_btnDoneActionPerformed
    }
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed

        String chosenAnswer=getUserAnswer();
        if(chosenAnswer!=null){
            QuestionPojo question=qstore.getQuestion(pos);
            String correctAnswer=question.getCorrectAnswer();
            AnswerPojo newAnswer=new AnswerPojo(exam.getExamId(),qno,chosenAnswer,correctAnswer,exam.getLanguage());
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                astore.addAnswer(newAnswer);
            else{
                if(newAnswer.getChosenAnswer().equals(answer.getChosenAnswer())==false){
                    int apos=astore.removeAnswer(answer);
                    astore.setAnswerAt(apos,newAnswer);
                }
            }
        }
        pos++;
        if(pos>=qstore.getCount())
            pos=0;
        qno++;
        if(qno>qstore.getCount())
            qno=1;
        lblQno.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void jrbOp2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOp2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOp2ActionPerformed

    private void jrbOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbOp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrbOp4ActionPerformed

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
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TakeTestFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TakeTestFrame().setVisible(true);
            }
        });
        }
    
    
    public void loadQuestion(){
        try{
            ArrayList<QuestionPojo> questionList=QuestionDao.getQuestionsByExamId(exam.getExamId());
            for(QuestionPojo qp:questionList){
                qstore.addQuestion(qp);
                System.out.println(qp);
            }
        } catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "Error retriving data from database","Database Error!!",JOptionPane.ERROR_MESSAGE);
        }
    }
    public void showQuestion(){
            QuestionPojo question=qstore.getQuestion(pos);
            buttonGroup1.clearSelection();
            txtQuestion.setText(question.getQuestion());
            jrbOp1.setText(question.getAnswer1());
            jrbOp2.setText(question.getAnswer2());
            jrbOp3.setText(question.getAnswer3());
            jrbOp4.setText(question.getAnswer4());
            AnswerPojo answer=astore.getAnswerByQno(qno);
            if(answer==null)
                return;
            String chosenAnswer=answer.getChosenAnswer();
            switch(chosenAnswer){
                case "Answer1":
                    jrbOp1.setSelected(true);
                    break;
                case "Answer2":
                    jrbOp2.setSelected(true);
                    break;
                case "Answer3":
                    jrbOp3.setSelected(true);
                    break;
                case "Answer4":
                    jrbOp4.setSelected(true);
                    break;
            }
        }
    
    public String getUserAnswer(){
        if(jrbOp1.isSelected())
            return "Answer1";
        else if(jrbOp2.isSelected())
            return "Answer2";
        else if(jrbOp3.isSelected())
            return "Answer3";
        else if(jrbOp4.isSelected())
            return "Answer4";
        else 
            return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton80;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JRadioButton jrbOp1;
    private javax.swing.JRadioButton jrbOp2;
    private javax.swing.JRadioButton jrbOp3;
    private javax.swing.JRadioButton jrbOp4;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lbllogout;
    private javax.swing.JLabel lblusername;
    private javax.swing.JTextArea txtQuestion;
    // End of variables declaration//GEN-END:variables
}
