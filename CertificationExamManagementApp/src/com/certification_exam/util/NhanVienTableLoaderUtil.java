/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.certification_exam.util;

import com.certification_exam.bll.IVaiTroBLL;
import com.certification_exam.bll.impl.VaiTroBLL;
import com.certification_exam.dto.NhanVienDTO;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hi
 */
public class NhanVienTableLoaderUtil implements ITableLoaderUtil<NhanVienDTO>{
    private IVaiTroBLL vaiTroBLL = new VaiTroBLL();
    @Override
    public DefaultTableModel setTable(List<NhanVienDTO> listItems, String[] listColumns) {
        Vector header = new Vector();
        for(Object colName : listColumns){
            header.add(colName);
        }
        
        DefaultTableModel model = new DefaultTableModel(header, 0);
        
        Vector row = null;
        for(NhanVienDTO nhanVien : listItems) {
            row = new Vector();
            row.add(nhanVien.getId());
            row.add(nhanVien.getHo());
            row.add(nhanVien.getTen());
            row.add(nhanVien.getGioiTinh() ? "Nam" : "Nữ");
            row.add(nhanVien.getNgaySinh());
            row.add(nhanVien.getDiaChi());
            row.add(nhanVien.getSdt());
            row.add(vaiTroBLL.findById(nhanVien.getIdVaiTro()).getTenVaiTro());
            model.addRow(row);
        }
        
        return model;
    }
    
}
