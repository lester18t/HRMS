
package hrms;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;



public class HRMS {

    public static class TimeClass {
        public String currentTime() {
            SimpleDateFormat formatter = new SimpleDateFormat("MMM dd, yyyy - h:mm:ss a");
            Date date = new Date(System.currentTimeMillis());
            String curTime = formatter.format(date);
            return curTime;
        }
        
        public boolean isFirstDayofMonth(Date dateToday) {
            Calendar c = new GregorianCalendar();
            c.setTime(dateToday);
            
            if (c.get(Calendar.DAY_OF_MONTH) == 1){
                return true;
            }
                
            return false;
        }
    }
    
    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hrms", "root", "");
            return conn;
            
        }   catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    
    public static class ShadowPane extends JPanel {
        public ShadowPane() {
            setLayout(new BorderLayout());
            setOpaque(false);
            setBackground(Color.BLACK);
            setBorder(new EmptyBorder(0,0,10,10));
        }
        @Override
        public Dimension getPreferredSize(){
            return new Dimension(200,200);
        }
        
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setComposite(AlphaComposite.SrcOver.derive(0.5f));
            g2d.fillRect(10, 10, getWidth(), getHeight());
            g2d.dispose();
        }
        
    }
    
    
    public static class fileRW {
        public void fWrite(String ps, String path) {
            
            try {   
                BufferedWriter wr = new BufferedWriter(new FileWriter(path));
                wr.write(ps);
                wr.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        
        public String fRead(String path) {
            String pass = null;
            try {  
                BufferedReader br = new BufferedReader(new FileReader(path));
                pass = br.readLine();
                br.close();
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            
           return pass;
        }
    }
    
    public static class passC {
        fileRW a = new fileRW();
        
        public static String pass;
        
        public void setPass(String ps) {
            a.fWrite(ps, "src/hrms/src/pass.txt");
        }
        
        public String getPass() {
            pass = a.fRead("src/hrms/src/pass.txt");
            return pass;
        }       
    }
    
    public static class FirstOpen {
        fileRW a = new fileRW();
        
        public static String open;
        
        public void setOpen(String ps) {
            a.fWrite(ps, "src/hrms/src/open.txt");
        }
        
        public String getOpen() {
            open = a.fRead("src/hrms/src/open.txt");
            return open;
        }
        
        public boolean isFirstOpen() {
            if (getOpen().equals("0")) {
                return true;
            }
            
            return false;
        }
    }
    
    public ImageIcon resizer(String path, JLabel lbl) {
        ImageIcon myimg = new ImageIcon (path);
        Image img = myimg.getImage();
        Image newimg = img.getScaledInstance(lbl.getWidth(), lbl.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newimg);
        return image;
    }
    
    public static class search {
        public void searcher (JTable tbl, TableModel dm, JTextField tf) {
            RowFilter rf;
            TableRowSorter<TableModel> tr = new TableRowSorter<TableModel>(dm);
            List <RowFilter<Object,Object>> filters = new ArrayList<RowFilter<Object,Object>>(2);
            filters.add(RowFilter.regexFilter("(?i)"+tf.getText(), 0));
            filters.add(RowFilter.regexFilter("(?i)"+tf.getText(), 1));

            rf = RowFilter.orFilter(filters);
            tbl.setRowSorter(tr);
            tr.setRowFilter(rf);
        }
    }
    public static void main(String[] args) {
        
        LoginPage a = new LoginPage();
        a.setVisible(true);
       
    }
    
}
