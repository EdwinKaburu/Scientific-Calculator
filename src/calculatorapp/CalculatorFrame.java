/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorapp;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

/**
 *
 * @author pierrethomas
 */
public class CalculatorFrame extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorFrame
     */
    List<String> numbers = new ArrayList<String>(){};
    int result =0;
    float pointto =0;
    public CalculatorFrame() {
        initComponents();
        
        List<JButton> numbersLetters = Arrays.asList(btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, btnZero,
                btnAdd, btnDecimal, btnDivide, btnPoistiveNeg, btnSubstract, btnPercentage,btnMult);
        for (JButton buttons : numbersLetters) {

            buttons.addActionListener(new java.awt.event.ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    numbers.add(buttons.getText());
                    String word = "";
                    for (String num : numbers) {
                        word += num;
                    }
                    jLabel1.setText(word);
                   
                }

            });
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton23 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnPoistiveNeg = new javax.swing.JButton();
        btnPercentage = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnSubstract = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();

        jButton23.setText("jButton13");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("CANNOT DIVIDE BY ZERO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("HISTORY");
        jLabel2.setToolTipText("");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        btnPoistiveNeg.setBackground(new java.awt.Color(255, 0, 0));
        btnPoistiveNeg.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPoistiveNeg.setText("+/-");

        btnPercentage.setBackground(new java.awt.Color(255, 0, 0));
        btnPercentage.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPercentage.setText("%");

        btnAC.setBackground(new java.awt.Color(255, 0, 0));
        btnAC.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(255, 0, 0));
        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSeven.setText("7");

        btnEight.setBackground(new java.awt.Color(255, 0, 0));
        btnEight.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEight.setText("8");

        btnNine.setBackground(new java.awt.Color(255, 0, 0));
        btnNine.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNine.setText("9");

        btnFour.setBackground(new java.awt.Color(255, 0, 0));
        btnFour.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFour.setText("4");

        btnFive.setBackground(new java.awt.Color(255, 0, 0));
        btnFive.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFive.setText("5");

        btnSix.setBackground(new java.awt.Color(255, 0, 0));
        btnSix.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSix.setText("6");

        btnOne.setBackground(new java.awt.Color(255, 0, 0));
        btnOne.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnOne.setText("1");

        btnTwo.setBackground(new java.awt.Color(255, 0, 0));
        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTwo.setText("2");

        btnThree.setBackground(new java.awt.Color(255, 0, 0));
        btnThree.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnThree.setText("3");

        btnMult.setBackground(new java.awt.Color(255, 0, 0));
        btnMult.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMult.setText("*");

        btnDivide.setBackground(new java.awt.Color(255, 0, 0));
        btnDivide.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnDivide.setText("/");

        btnSubstract.setBackground(new java.awt.Color(255, 0, 0));
        btnSubstract.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSubstract.setText("-");

        btnAdd.setBackground(new java.awt.Color(255, 0, 0));
        btnAdd.setText("+");

        btnZero.setBackground(new java.awt.Color(255, 0, 0));
        btnZero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnZero.setText("0");

        btnDecimal.setBackground(new java.awt.Color(255, 0, 0));
        btnDecimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDecimal.setText(".");

        btnEqual.setBackground(new java.awt.Color(255, 0, 0));
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSeven, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPoistiveNeg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPercentage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSubstract, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPoistiveNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivide, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPercentage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSubstract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        jList1.setToolTipText("");
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACActionPerformed
        // TODO add your handling code here:
        String history = "";
        DefaultListModel memory = new DefaultListModel();

        for(String s : numbers) 
        {
            history = history.concat(s);
        }
        memory.addElement(history.concat(" = " + Float.toString(pointto)));
        jList1.setModel(memory);
        numbers.clear();
        jLabel1.setText("");
    }//GEN-LAST:event_btnACActionPerformed

    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualActionPerformed
        Results();
    }//GEN-LAST:event_btnEqualActionPerformed

     private void Results()
    {
       int count = 0;
       //int pointto = 0;
      
      for(int i = 0; i < Equation(numbers).size(); i++)
      {
          if(Equation(numbers).get(i).equals("+"))
          {
                count++;
                if(count <= 1)
                {
                  //  System.out.println("Less Add Ins\t" + Equation(numbers).get(i - 1));
                   // System.out.println("LessAdd Ins\t" + Equation(numbers).get(i + 1));
                    pointto += Float.parseFloat(Equation(numbers).get(i - 1)) + Float.parseFloat(Equation(numbers).get(i + 1));
                }
                else 
                {
                    //System.out.println("Great Add Ins\t" + Equation(numbers).get(i - 1));
                    //System.out.println("Else Great Add Ins\t" + Equation(numbers).get(i + 1));
                    pointto += Float.parseFloat(Equation(numbers).get(i + 1));
                }
               
               // System.out.println("Count Add\t" + count);
          }
          else if(Equation(numbers).get(i).equals("*"))
          {
               count++;
               if(count <= 1)
               {
                  //  System.out.println("Less Multi Ins\t" + Equation(numbers).get(i - 1));
                   // System.out.println("Less Multi Ins\t" + Equation(numbers).get(i + 1));
                    pointto += Float.parseFloat(Equation(numbers).get(i - 1)) * Float.parseFloat(Equation(numbers).get(i + 1));
               }
               else
               {
                    //System.out.println("Great Multi Ins\t" + Equation(numbers).get(i - 1));
                  //  System.out.println("Else Great Multi Ins\t" + Equation(numbers).get(i + 1));
                    pointto *=  Float.parseFloat(Equation(numbers).get(i + 1));
               }
              
               // System.out.println("Count Multi\t" + count);
          } 
          else if(Equation(numbers).get(i).equals("/"))
          {
               count++;
               if(count <= 1)
               {
                   // System.out.println("Less Divide Ins\t" + Equation(numbers).get(i - 1));
                   // System.out.println("Less Divide Ins\t" + Equation(numbers).get(i + 1));
                    pointto += Float.parseFloat(Equation(numbers).get(i - 1)) / Float.parseFloat(Equation(numbers).get(i + 1));
               }
               else
               {
                   //System.out.println("Great Divide Ins\t" + Equation(numbers).get(i - 1));
                   //System.out.println("Else Great Divide Ins\t" + Equation(numbers).get(i + 1));
                   pointto /= Float.parseFloat(Equation(numbers).get(i + 1));
               }
               
              // System.out.println("Count Divide\t" + count);
          }
          else if(Equation(numbers).get(i).equals("-"))
          {
               count++;
               if(count <= 1)
               {
                  // System.out.println("Less Sub Ins\t" + Equation(numbers).get(i - 1));
                  // System.out.println("Less Sub Ins\t" + Equation(numbers).get(i + 1));
                   pointto += Float.parseFloat(Equation(numbers).get(i - 1)) - Float.parseFloat(Equation(numbers).get(i + 1));
               }
               else
               {
                    //System.out.println("Great Sub Ins\t" + Equation(numbers).get(i - 1));
                   // System.out.println("Else Great Sub Ins\t" + Equation(numbers).get(i + 1));
                    pointto -= Float.parseFloat(Equation(numbers).get(i + 1));
               }
              
              // System.out.println("Count Sub\t" + count);
          }
       
      }
         //System.out.println("Result\t" + pointto);
        jLabel1.setText(Float.toString(pointto));
    }
    private static List<String> Equation(List<String>numbers)
    {
        List<String> setIn_Point = new ArrayList<String>() {};
        List<String> setIn_Point2 = new ArrayList<String>() {};
        
        
        for (Map.Entry<String, List<Integer>> entry : CheckValue(numbers).entrySet()) {
            if (entry.getKey().equals("Plus_Sign"))
            {
                //System.out.println("Size\t" +entry.getValue().size());
                if (entry.getValue().size() <= 1) 
                {
                    String testing2 = "";
                    String testing = "";
                    for (int a = 0; a < entry.getValue().size(); a++) 
                    {
                       // System.out.println("Values \t" + entry.getValue().get(a));
                        for (int ab = a; ab < entry.getValue().get(a); ab++)
                        {
                            testing2 = testing2.concat(numbers.get(ab));
                            //System.out.println("Testing2\t" + testing2);
                        }
                        setIn_Point.add(testing2);
                        
                       if (entry.getValue().indexOf(Collections.max(entry.getValue())) == a) 
                            {
                                for (int ab = Collections.max(entry.getValue()); ab < numbers.size(); ab++) {
                                    testing = testing.concat(numbers.get(ab));
                                }
                               // System.out.println("Testing3\t" + testing);
                                setIn_Point.add(testing);
                            }
                    }
                }
                else 
                {
                    for (int a = 0; a < entry.getValue().size(); a++) {
                        String testing = "";
                        String testing2 = "";
                        String testing3 = "";
                        if (a > 0) 
                        {
                            for (int ab = entry.getValue().get(a - 1); ab < entry.getValue().get(a); ab++) {
                                testing = testing.concat(numbers.get(ab));
                                //System.out.println("Testing\t" + testing);
                            }
                            setIn_Point.add(testing);
                            if (entry.getValue().indexOf(Collections.max(entry.getValue())) == a) 
                            {
                                for (int ab = Collections.max(entry.getValue()); ab < numbers.size(); ab++) {
                                    testing3 = testing3.concat(numbers.get(ab));
                                }
                               // System.out.println("Testing3\t" + testing3);
                                setIn_Point.add(testing3);
                            }
                        } 
                        else if (a < 1) 
                        {

                            for (int ab = a; ab < entry.getValue().get(a); ab++) {
                                testing2 = testing2.concat(numbers.get(ab));
                               // System.out.println("Testing2\t" + testing2);
                            }
                            setIn_Point.add(testing2);
                        }
                    }
                }

            }
        }
         //System.out.println("---------------------------");
        for(String Item : setIn_Point)
        {
           //System.out.println(Item);
            if(Item.contains("+"))
            {
                String parts[] = Item.split("\\+");
                setIn_Point2.add("+");
                setIn_Point2.add(parts[1]);
               // System.out.print(parts[1]);
            }
            else if(Item.contains("-"))
            {
                String parts[] = Item.split("\\-");
                setIn_Point2.add("-");
                setIn_Point2.add(parts[1]);
                //System.out.print(parts[1]);
            }
            else if(Item.contains("/"))
            {
                String parts[] = Item.split("\\/");
                setIn_Point2.add("/");
                setIn_Point2.add(parts[1]);
            }
            else if(Item.contains("*"))
            {
                String parts[] = Item.split("\\*");
                setIn_Point2.add("*");
                setIn_Point2.add(parts[1]);
            }
            else
            {
                setIn_Point2.add(Item);
            }
        }
        
        return setIn_Point2;
    }
    private static String WordReturn(int startingPoint, List<String> numbers)
    {
        String return_digit = "";

        for (int ab = 0; ab < startingPoint; ab++) {
            return_digit = return_digit.concat(numbers.get(ab));

        }
        return return_digit;
    }
    /*Method doesn't function are Required*/
    private static Map<String,List<Integer>> CheckValue(List<String> numbers)
    {

        
        Map<String,List<Integer>> map1 = new HashMap<String,List<Integer>>();
        
        List<Integer> plusIndex,minusIndex,DivideIndex,MultiIndex; //List for Error Logs
        plusIndex = minusIndex = DivideIndex = MultiIndex = new ArrayList<Integer>(){};
        
        for(int i = 0; i < numbers.size(); i++)
        {
            switch (numbers.get(i)) {
                case "+":
                    plusIndex.add(i);
                    //plusSign.add(numbers.get(i));
                    break;
                case "-":
                    minusIndex.add(i);
                    //minusSign.add(numbers.get(i));
                    break;
                case "/":
                    DivideIndex.add(i);
                    //DivideSign.add(numbers.get(i));
                    break;
                case "*":
                    MultiIndex.add(i);
                    //MultiSign.add(numbers.get(i));
                    break;
                default:
                    break;
            }
        }
        map1.put("Plus_Sign",plusIndex);
        map1.put("Minus_Sign",minusIndex);
        map1.put("Divide_Sign",DivideIndex);
        map1.put("Multi_Sign",MultiIndex);
        
        return map1;
    }
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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPercentage;
    private javax.swing.JButton btnPoistiveNeg;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSubstract;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton23;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
