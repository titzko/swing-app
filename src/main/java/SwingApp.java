
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import tools.TFiles;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author titzko
 */
public class SwingApp extends javax.swing.JFrame {

    /**
     * Creates new form NetBeansSwingCounter
     */
    public SwingApp() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SearchInputField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        taText = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        taMeldungen = new javax.swing.JTextArea();
        buSuchen = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DisplayRowCount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        DisplayColumnCount = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DisplayCharCount = new javax.swing.JTextField();
        ersetzenBtn = new javax.swing.JButton();
        ReplaceInputField = new javax.swing.JTextField();
        SonderzeichenBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        FontSizeSpinner = new javax.swing.JSpinner();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SearchInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchInputFieldActionPerformed(evt);
            }
        });
        SearchInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SearchInputFieldKeyPressed(evt);
            }
        });

        taText.setColumns(20);
        taText.setRows(5);
        taText.setText("Das ist eine Textarea Lorem ipsum do.\nasdsadasd\nasdasdasda\nda\nsd\nasdas\nddasdasdasd  hello world   blaDas ");
        taText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                taTextCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(taText);

        taMeldungen.setBackground(new java.awt.Color(211, 211, 211));
        taMeldungen.setColumns(20);
        taMeldungen.setRows(5);
        taMeldungen.setText("ssdfds");
        taMeldungen.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        taMeldungen.setEnabled(false);
        jScrollPane2.setViewportView(taMeldungen);

        buSuchen.setText("Suchen");
        buSuchen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buSuchenActionPerformed(evt);
            }
        });

        jLabel1.setText("Zeile:");

        DisplayRowCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DisplayRowCountFocusLost(evt);
            }
        });
        DisplayRowCount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayRowCountActionPerformed(evt);
            }
        });
        DisplayRowCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DisplayRowCountKeyPressed(evt);
            }
        });

        jLabel2.setText("Spalte");

        DisplayColumnCount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                DisplayColumnCountFocusLost(evt);
            }
        });
        DisplayColumnCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DisplayColumnCountKeyPressed(evt);
            }
        });

        jLabel3.setText("Zeichen");

        DisplayCharCount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DisplayCharCountKeyPressed(evt);
            }
        });

        ersetzenBtn.setText("Ersetzen");
        ersetzenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ersetzenBtnActionPerformed(evt);
            }
        });

        ReplaceInputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ReplaceInputFieldKeyPressed(evt);
            }
        });

        SonderzeichenBtn.setText("Sonderzeichen");
        SonderzeichenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SonderzeichenBtnActionPerformed(evt);
            }
        });

        jLabel4.setText("Fontsize");

        FontSizeSpinner.setValue(13);
        FontSizeSpinner.setVerifyInputWhenFocusTarget(false);
        FontSizeSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FontSizeSpinnerStateChanged(evt);
            }
        });
        FontSizeSpinner.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FontSizeSpinnerMousePressed(evt);
            }
        });

        jMenu1.setText("Datei");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Öffnen");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Speichern");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator2);

        jMenuItem3.setText("Speichern Unter");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator3);

        jMenuItem4.setText("Beenden");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Hilfe");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane2))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DisplayColumnCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(DisplayCharCount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchInputField)
                    .addComponent(buSuchen, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                    .addComponent(ReplaceInputField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ersetzenBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SonderzeichenBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(FontSizeSpinner))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SearchInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buSuchen)
                        .addGap(18, 18, 18)
                        .addComponent(ReplaceInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(ersetzenBtn)
                        .addGap(81, 81, 81)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FontSizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                        .addComponent(SonderzeichenBtn))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DisplayRowCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(DisplayColumnCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DisplayCharCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchInputFieldActionPerformed

    }//GEN-LAST:event_SearchInputFieldActionPerformed

    private void buSuchenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buSuchenActionPerformed
        int x = suchen();
        taText.requestFocusInWindow();
    }//GEN-LAST:event_buSuchenActionPerformed

    private void taTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_taTextCaretUpdate
        // Die Zeichenposition entspricht der CaretPosition 
        // für die Zeilennummer müssen Sie die Zeilenwechsel bis zur Cursorposition zählen
        // Zeichenposition müssen Sie die Anzahl der Zeichen rückwärts von der Cursorposition bis zum ersten Zeilenwechsel zählen
        int caretPosition = evt.getDot();
        String textTillcursor = taText.getText().substring(0, caretPosition);

        String[] lines = textTillcursor.split("\r\n|\r|\n");
        Integer rows = lines.length;

        int columnCounter = 0;
        char[] chars = textTillcursor.toCharArray();
        for (int i = caretPosition - 1; i > 0; i--) {
            if (chars[i] == '\n') {
                break;
            } else {
                columnCounter++;
            }
        }

        if (caretPosition < taText.getText().length() && columnCounter == 0 && taText.getText().charAt(caretPosition) == '\n') {
            rows += 1;
        }

        int rowNumber = this.getZeilenNummer(taText.getText(), caretPosition);

        DisplayColumnCount.setText(String.valueOf(columnCounter));
        DisplayRowCount.setText(String.valueOf(rowNumber));
        DisplayCharCount.setText(String.valueOf(caretPosition));

    }//GEN-LAST:event_taTextCaretUpdate

    int getZeilenNummer(String s, int p) {

        String newline = System.getProperty("line.separator");

        if (s == null || p < 0) {
            return 0;
        }

        if (p > s.length()) {
            p = s.length();
        }

        int zeilenNummer = 1;
        for (int i = 0; i < p; i++) {
            if (s.charAt(i) == newline.toCharArray()[0]) {
                zeilenNummer++;
            }
        }
        return zeilenNummer;
    }

    private void ersetzenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ersetzenBtnActionPerformed
        replace();
    }//GEN-LAST:event_ersetzenBtnActionPerformed

    void replace() {
        String replacementString = ReplaceInputField.getText();
        String text = taText.getText();
        String su = SearchInputField.getText();
        if (replacementString == null || replacementString.equals("")) {
            return;
        } else {
            int pos = suchen();
            StringBuilder sb = new StringBuilder(text);
            sb.replace(pos, pos + su.length(), replacementString);
            taText.setText(sb.toString());
            taText.select(pos, pos + replacementString.length());
            taText.requestFocusInWindow();
        }
    }

    private void DisplayRowCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DisplayRowCountFocusLost
        setCursorInRow();
    }//GEN-LAST:event_DisplayRowCountFocusLost

    void setCursorInRow() {
        String rowNum = DisplayRowCount.getText();
        String colNum = DisplayColumnCount.getText();
        String text = taText.getText();

        try {
            Integer convertedRowNum = Integer.valueOf(rowNum);
            if (convertedRowNum < 2) {
                taText.setCaretPosition(0);
                taText.requestFocusInWindow();
                return;
            }

            List<Integer> indices = findWordUpgrade(text, "\n");
            int index = Integer.valueOf(DisplayRowCount.getText());
            int cursorPos = indices.get(convertedRowNum - 2);

            taText.setCaretPosition(cursorPos + 1);
            taText.requestFocusInWindow();

        } catch (Exception e) {
            taMeldungen.setText(e.toString());
        }
    }


    private void DisplayColumnCountFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_DisplayColumnCountFocusLost
        setCursorInColumn();
    }//GEN-LAST:event_DisplayColumnCountFocusLost

    void setCursorInColumn() {
        try {
            String rowNum = DisplayRowCount.getText();
            String colNum = DisplayColumnCount.getText();
            String text = taText.getText();
            String[] rows = taText.getText().split("\n");

            if (rows[Integer.valueOf(rowNum) - 1].length() < Integer.valueOf(colNum)) {
                taMeldungen.setText("Column Index to large");
                return;

            }

            int index = 0;
            if (Integer.valueOf(rowNum) < 2) {
                index = 0;
            } else {
                List<Integer> rowIndices = findWordUpgrade(text, "\n");
                index = rowIndices.get(Integer.valueOf(rowNum) - 2);
            }
            taText.setCaretPosition(index + 1 + Integer.valueOf(colNum));
            taText.requestFocusInWindow();
        } catch (Exception e) {
            taMeldungen.setText(e.toString());
        }
    }
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            System.out.println("Speichern unter");
            String text = taText.getText();

            JFileChooser chooser = new JFileChooser("/Users/titzko/Desktop");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showSaveDialog(this);
            if (chooser.getSelectedFile().canRead()) {
                String newFile = chooser.getSelectedFile().getPath();
                boolean didWriteToFIle = TFiles.writeTextFile(newFile, text);
                this.setTitle(chooser.getSelectedFile().getPath());
            }
        } catch (Exception e) {
            taMeldungen.setText(e.getMessage());
        }

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            System.out.println("öffnen");
            JFileChooser chooser = new JFileChooser("/Users/titzko/Desktop");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
            chooser.setFileFilter(filter);
            //chooser.setCurrentDirectory("/home/Desktop");
            int returnVal = chooser.showOpenDialog(this);
            if (chooser.getSelectedFile().canRead()) {
                String[] fileContent = TFiles.readTextFile(chooser.getSelectedFile().getPath());
                taText.setText(String.join("\n", fileContent));
                this.setTitle(chooser.getSelectedFile().getPath());
            }
        } catch (Exception e) {
            taMeldungen.setText(e.getMessage());
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.out.println("Speichern");
        String text = taText.getText();
        String path = this.getTitle();

        if (path != null && !"".equals(path)) {
            boolean didWriteToFIle = TFiles.writeTextFile(this.getTitle(), text);
        } else {
            JFileChooser chooser = new JFileChooser("/Users/titzko/Desktop");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("txt", "txt");
            chooser.setFileFilter(filter);
            int returnVal = chooser.showSaveDialog(this);
            if (chooser.getSelectedFile().canRead()) {
                String newFile = chooser.getSelectedFile().getPath();
                boolean didWriteToFIle = TFiles.writeTextFile(newFile, text);
                this.setTitle(chooser.getSelectedFile().getPath());
            }
        }


    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.out.println("Beenden");
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void SearchInputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchInputFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            suchen();
            taText.requestFocusInWindow();
        }
    }//GEN-LAST:event_SearchInputFieldKeyPressed

    private void ReplaceInputFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ReplaceInputFieldKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            replace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ReplaceInputFieldKeyPressed

    private void DisplayRowCountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayRowCountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisplayRowCountActionPerformed

    private void DisplayRowCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DisplayRowCountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setCursorInRow();
        }
    }//GEN-LAST:event_DisplayRowCountKeyPressed

    private void DisplayColumnCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DisplayColumnCountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            setCursorInColumn();
        }
    }//GEN-LAST:event_DisplayColumnCountKeyPressed

    private void DisplayCharCountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DisplayCharCountKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                taText.setCaretPosition(Integer.valueOf(DisplayCharCount.getText()));
                taText.requestFocusInWindow();
            } catch (Exception e) {
                taMeldungen.setText(e.getMessage());
            }
        }
    }//GEN-LAST:event_DisplayCharCountKeyPressed

    private void SonderzeichenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SonderzeichenBtnActionPerformed
        // TODO add your handling code here:
        JDialog dialog = new JDialog(this, "Sonderzeichen");
        JLabel label = new JLabel("Wähle Sonderzeichen:");
        dialog.setSize(400, 200);

        String strings[] = {"\u00A0", "\u00A1", "\u00A2", "\u00A3", "\u00A4", "\u00A5", "\u00A9", "\u00B1", "\u00B7",
            "\u00D7", "\u00AA", "\u00BA", "\u00AB", "\u00BB", "\u00BC", "\u00BD", "\u00BE"
        };
        JComboBox comboBox = new JComboBox(strings);
        comboBox.setPrototypeDisplayValue("text here");

        JButton btn = new JButton();
        btn.setText("Hinzufügen");

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) comboBox.getSelectedItem();
                String text = taText.getText();
                StringBuilder sb = new StringBuilder(text);
                int cursorPos = taText.getCaretPosition();
                sb.insert(cursorPos, selectedItem);
                taText.setText(sb.toString());
                dialog.setVisible(false);
            }
        });
        
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(comboBox);
        panel.add(btn);
        dialog.add(panel);
        dialog.setVisible(true);
    }//GEN-LAST:event_SonderzeichenBtnActionPerformed

    private void FontSizeSpinnerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FontSizeSpinnerMousePressed
changeFontSize();changeFontSize();    }//GEN-LAST:event_FontSizeSpinnerMousePressed

    private void FontSizeSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FontSizeSpinnerStateChanged
        changeFontSize();
    }//GEN-LAST:event_FontSizeSpinnerStateChanged

    void changeFontSize() {
        System.out.println("Spinner clicked");
        Integer fontSize = (Integer) (FontSizeSpinner.getValue());
        taText.setFont(new Font(taText.getFont().getFamily(),Font.PLAIN,fontSize));
        
    }
    
    public List<Integer> findWordUpgrade(String textString, String word) {
        List<Integer> indexes = new ArrayList<Integer>();
        StringBuilder output = new StringBuilder();
        String lowerCaseTextString = textString.toLowerCase();
        String lowerCaseWord = word.toLowerCase();
        int wordLength = 0;

        int index = 0;
        while (index != -1) {
            index = lowerCaseTextString.indexOf(lowerCaseWord, index + wordLength);  // Slight improvement
            if (index != -1) {
                indexes.add(index);
            }
            wordLength = word.length();
        }
        return indexes;
    }

    private int suchen() {
        String text = taText.getText().toLowerCase();
        String su = SearchInputField.getText().toLowerCase();
        int caretPos = taText.getCaretPosition();

        int pos = text.indexOf(su, caretPos);
        if (pos < 0) {

            pos = text.indexOf(su);
            if (pos < 0) {
                taMeldungen.setText("'" + su + "' nicht gefunden.");
                return -1;
            } else {
                taMeldungen.setText("'" + su + "' an Position" + pos + " gefunden");
                taText.select(pos, pos + su.length());

            }
        } else {
            taMeldungen.setText("'" + su + "' an Position" + pos + " gefunden");
            taText.select(pos, pos + su.length());

        }
        return pos;
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
            java.util.logging.Logger.getLogger(SwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DisplayCharCount;
    private javax.swing.JTextField DisplayColumnCount;
    private javax.swing.JTextField DisplayRowCount;
    private javax.swing.JSpinner FontSizeSpinner;
    private javax.swing.JTextField ReplaceInputField;
    private javax.swing.JTextField SearchInputField;
    private javax.swing.JButton SonderzeichenBtn;
    private javax.swing.JButton buSuchen;
    private javax.swing.JButton ersetzenBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JTextArea taMeldungen;
    private javax.swing.JTextArea taText;
    // End of variables declaration//GEN-END:variables
}
