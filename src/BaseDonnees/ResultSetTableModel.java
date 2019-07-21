/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDonnees;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author seydou
 */
public class ResultSetTableModel extends AbstractTableModel{
     //declaration 
    private  ResultSet rs;
    
    public ResultSetTableModel(ResultSet rs){
        this.rs = rs;
        fireTableDataChanged();
    } 
    
    //fonction getRowcount
    @Override
    public int getRowCount() {
        try {
            
            if (rs == null) {
                return 0;
            }
            else{
                rs.last();
                return rs.getRow();
            }
            
        } catch (SQLException e) {
               System.out.println("getRowcount  resultset generating error  while getting row count");
             System.out.println(e.getMessage());
             return 0;
        }
        
      
    }

    
    //fonction getcolumncount
    @Override
    public int getColumnCount() { 
         try{
              if (rs == null) {
                 return 0;
             }
              else{
                  return rs.getMetaData().getColumnCount();//informations sur les colonnes
              }
 
         }catch(SQLException e){
             System.out.println("getColumncount  resultset generating error  while getting column count");
             System.out.println(e.getMessage());
             return 0;
         }
    }

    
    //fonction getValueAt
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { 
        
        if (rowIndex < 0 || rowIndex > getRowCount() || columnIndex <0 || columnIndex > getColumnCount()) {
            return null;
        } 
        try {
            if (rs == null) {
                return null;
            }
            else{
                rs.absolute(rowIndex + 1);//positionne le curseur  en absolu dans le tableau
                return rs.getObject(columnIndex +1);
            }
        } catch (SQLException e) { 
             System.out.println("getValueAt   resultset generating error  while fetching rows");
             System.out.println(e.getMessage());
             return null;
        }
    }
    
    //fonction getColumnName
    
    @Override
    public String getColumnName(int columnIndex){
        try {
            
            return rs.getMetaData().getColumnName(columnIndex +1);
            
        } catch (SQLException e) { 
             System.out.println("getColumnName  resultset generating error  while getting column name");
             System.out.println(e.getMessage());
       } 
        return super.getColumnName(columnIndex);
    }
    
}
