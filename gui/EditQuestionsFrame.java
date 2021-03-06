/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.gui;

import TechQuizApp.dao.QuestionDao;
import TechQuizApp.pojo.AnswerPojo;
import TechQuizApp.pojo.ExamPojo;
import TechQuizApp.pojo.QuestionPojo;
import TechQuizApp.pojo.QuestionStore;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Deepesh Dasani
 */
public class EditQuestionsFrame extends javax.swing.JFrame {

     private ExamPojo newExam;
     
    private QuestionStore qstore;
    private HashMap<String,String> options;
    private int qno=1;
    private int pos=0;
    private String question,option1,option2,option3,option4,correct_option;
    private ArrayList<QuestionPojo> questionList;

    /**
     * Creates new form EditQuestionsFrame
     */
    public EditQuestionsFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
          qstore=new QuestionStore();
        options=new HashMap<>();
        options.put("Option 1","Anwer1");
        options.put("Option 2","Anwer2");
        options.put("Option 3","Anwer3");
        options.put("Option 4","Anwer4");
        qno=1;
        pos=0;
       
    }

    EditQuestionsFrame(ExamPojo exm) {
        this();
         this.newExam=exm;
         System.out.println(newExam);
         
         loadQuestion();
       showQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblQnos = new javax.swing.JLabel();
        lblQno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtQuestions = new javax.swing.JTextArea();
        jcCorrect = new javax.swing.JComboBox<>();
        btnNext = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnDone = new javax.swing.JButton();
        jrOption1 = new javax.swing.JLabel();
        jrOption2 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtOption1 = new javax.swing.JTextField();
        txtOption2 = new javax.swing.JTextField();
        txtOption3 = new javax.swing.JTextField();
        txtOption4 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));

        lblUsername.setForeground(new java.awt.Color(255, 153, 51));
        lblUsername.setText("Hello User");

        lblLogout.setForeground(new java.awt.Color(255, 153, 51));
        lblLogout.setText("LogOut");

        lblQnos.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        lblQnos.setForeground(new java.awt.Color(255, 153, 51));
        lblQnos.setText("Editing Java Paper");

        lblQno.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblQno.setForeground(new java.awt.Color(255, 153, 51));
        lblQno.setText("Question no:1");

        txtQuestions.setColumns(20);
        txtQuestions.setRows(5);
        jScrollPane1.setViewportView(txtQuestions);

        jcCorrect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option1", "Option2", "Option3", "Option4" }));
        jcCorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCorrectActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrev.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnPrev.setText("Prev");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCancel.setText("Cancel");

        btnDone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnDone.setText("Done");
        btnDone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoneActionPerformed(evt);
            }
        });

        jrOption1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrOption1.setForeground(new java.awt.Color(255, 102, 51));
        jrOption1.setText("Option 1");

        jrOption2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jrOption2.setForeground(new java.awt.Color(255, 102, 51));
        jrOption2.setText("Option 2");

        jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 102, 51));
        jLabel34.setText("Option 3");

        jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 102, 51));
        jLabel35.setText("Option 4");

        txtOption1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption1ActionPerformed(evt);
            }
        });

        txtOption4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOption4ActionPerformed(evt);
            }
        });

        jLabel36.setForeground(new java.awt.Color(255, 153, 51));
        jLabel36.setText("Corect Answer");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLogout)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblQno)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jrOption1)
                                .addGap(83, 83, 83))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel34)
                                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jrOption2)
                            .addComponent(jLabel35)
                            .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQnos)
                .addGap(94, 94, 94))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnNext)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel36)
                    .addComponent(btnPrev))
                .addGap(46, 46, 46)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnDone)
                .addGap(35, 35, 35))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(lblLogout))
                .addGap(18, 18, 18)
                .addComponent(lblQnos)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblQno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrOption1)
                    .addComponent(jrOption2))
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOption1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOption2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtOption4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcCorrect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtOption3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel36)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNext)
                    .addComponent(btnPrev)
                    .addComponent(btnCancel)
                    .addComponent(btnDone))
                .addGap(71, 71, 71))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOption4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption4ActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
         qstore.removeQuestion(pos);
        QuestionPojo obj=new QuestionPojo(newExam.getExamId(),qno,txtQuestions.getText(),txtOption1.getText().trim(),txtOption2.getText().trim(),txtOption3.getText().trim(),txtOption4.getText().trim(),jcCorrect.getSelectedItem().toString(),newExam.getLanguage());
        System.out.println("anand"+obj);
        qstore.setQuestionAt(pos,obj);
         pos--;
        if(pos<0)
            pos=qstore.getCount()-1;
        qno--;
        if(qno<=0)
            qno=qstore.getCount();
        lblQno.setText("Question no: "+qno);
        showQuestion();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void txtOption1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOption1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOption1ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
     
       // pos++;  
//        QuestionPojo qlist=qstore.getQuestion(pos);
//        System.out.println(qlist);
           // QuestionPojo quest=qstore.getQuestion(pos);
              String optionName=jcCorrect.getSelectedItem().toString();
      //  QuestionPojo obj=new QuestionPojo(newExam.getExamId(),qno,qlist.getQuestion(),qlist.getAnswer1(),qlist.getAnswer2(),qlist.getAnswer3(),qlist.getAnswer4(),qlist.getCorrectAnswer(),newExam.getLanguage());
      //  qstore.addQuestion(obj);
       qstore.removeQuestion(pos);
        QuestionPojo obj=new QuestionPojo(newExam.getExamId(),qno,txtQuestions.getText(),txtOption1.getText().trim(),txtOption2.getText().trim(),txtOption3.getText().trim(),txtOption4.getText().trim(),jcCorrect.getSelectedItem().toString(),newExam.getLanguage());
        System.out.println("anand"+obj);
        qstore.setQuestionAt(pos,obj);
        pos++;
        if(pos>=qstore.getCount()){
            pos=0;  
        }
          qno++;
        if(qno>qstore.getCount())
            qno=1;
        lblQno.setText("Question no: "+qno);
        
        showQuestion();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoneActionPerformed
         if(!this.validateInput()){
            JOptionPane.showMessageDialog(null,"Please provide all the Inputs","Cannot add Exam",JOptionPane.ERROR_MESSAGE);
            return;
        }
       // String optionName=options.get(correct_option);
      
        try{ 
        QuestionDao.updateQuestion(questionList);
        {
            JOptionPane.showMessageDialog(null,"Paper setted Successfully","DONE",JOptionPane.INFORMATION_MESSAGE);
            AdminsOptionFrames aof=new AdminsOptionFrames();
            aof.setVisible(true);
            this.dispose();
        }
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error writing to DATABASE!","Cannot add Exam",JOptionPane.ERROR_MESSAGE);
            
        }
    }//GEN-LAST:event_btnDoneActionPerformed

    private void jcCorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCorrectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcCorrectActionPerformed

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
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditQuestionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditQuestionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDone;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcCorrect;
    private javax.swing.JLabel jrOption1;
    private javax.swing.JLabel jrOption2;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblQno;
    private javax.swing.JLabel lblQnos;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtOption1;
    private javax.swing.JTextField txtOption2;
    private javax.swing.JTextField txtOption3;
    private javax.swing.JTextField txtOption4;
    private javax.swing.JTextArea txtQuestions;
    // End of variables declaration//GEN-END:variables

     public void loadQuestion(){
      try{
           questionList=QuestionDao.getQuestionsByExamId(newExam.getExamId());
           for(QuestionPojo question:questionList){
              System.out.println(question.getQuestion());
                qstore.addQuestion(question);    
           }      
      }  
         catch (SQLException ex) {
           ex.printStackTrace();
           JOptionPane.showMessageDialog(null, "Error retriving data from database","Database Error!!",JOptionPane.ERROR_MESSAGE);
       }
     }
        public void showQuestion(){
            QuestionPojo qlist=qstore.getQuestion(pos);
            txtQuestions.setText(qlist.getQuestion());
            txtOption1.setText(qlist.getAnswer1());
            txtOption2.setText(qlist.getAnswer2());
            txtOption3.setText(qlist.getAnswer3());
            txtOption4.setText(qlist.getAnswer4());
          
           }
        
          public Boolean validateInput(){
        question=txtQuestions.getText().trim();
        option1=txtOption1.getText().trim();
        option2=txtOption2.getText().trim();
        option3=txtOption3.getText().trim();
        option4=txtOption4.getText().trim();
        correct_option=jcCorrect.getSelectedItem().toString();
        if(question.isEmpty()||option1.isEmpty()||option2.isEmpty()||option3.isEmpty()||option4.isEmpty()||correct_option.isEmpty())
            return false;
        
        else
            return true;
    }
   
    

}