/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.util;

import com.certification_exam.bll.IDiaDiemBLL;
import com.certification_exam.bll.ITinhBLL;
import com.certification_exam.bll.impl.DiaDiemBLL;
import com.certification_exam.bll.impl.TinhBLL;
import com.certification_exam.dto.DiaDiemDTO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kossp
 */
public class DiaDiemTableLoaderUtil implements ITableLoaderUtil<DiaDiemDTO>{
    private IDiaDiemBLL vaiTroBLL = new DiaDiemBLL();
    private ITinhBLL tinhBLL = new TinhBLL();
    
    @Override
    public DefaultTableModel setTable(List<DiaDiemDTO> listItems, String[] listColumns) {
        Vector header = new Vector();
        for(Object colName : listColumns){
            header.add(colName);
        }
        
        DefaultTableModel model = new DefaultTableModel(header, 0);
        
        Vector row = null;
        for(DiaDiemDTO diaDiem : listItems) {
            row = new Vector();
            row.add(diaDiem.getId());
            row.add(diaDiem.getTenDiaDiem());
            row.add(tinhBLL.findById(diaDiem.getIdTinh()).getTenTinh());
            row.add(diaDiem.getDiaChi());
            row.add(diaDiem.getGioiThieu());
            model.addRow(row);
        }
        
        return model;
    }    
}
