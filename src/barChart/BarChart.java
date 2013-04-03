package barChart;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class BarChart 
{
	public static void main(String[] args) 
	{
		DefaultCategoryDataset dcd = new DefaultCategoryDataset();
		
		dcd.setValue(30, "Yogyakarta","2009");//Value,RowKey/ColumnKey
        dcd.setValue(40, "Bali","2009");
        dcd.setValue(15, "Lombok","2009");
        dcd.setValue(15, "Bandung","2009");
         
        dcd.setValue(35, "Yogyakarta","2010");//Value,RowKey/ColumnKey
        dcd.setValue(35, "Bali","2010");
        dcd.setValue(20, "Lombok","2010");
        dcd.setValue(10, "Bandung","2010");
         
        dcd.setValue(40, "Yogyakarta","2011");//Value,RowKey/ColumnKey
        dcd.setValue(45, "Bali","2011");
        dcd.setValue(10, "Lombok","2011");
        dcd.setValue(5, "Bandung","2011");
        
        JFreeChart freeChart = ChartFactory.createBarChart("Pariwisata Indonesia 2012","Tahun","Kunjungan Wisatawan(Dalam Persen / %)", dcd, PlotOrientation.VERTICAL,true, true,true); 
        //String arg0,String arg1,String arg2,Category Datasheet,Plot Orientation,boolean arg4,boolean arg5,boolean arg6
        ChartFrame cf = new ChartFrame("Data Kota Pariwisata Indonesia",freeChart);
        
        cf.setSize(1000,800);
        cf.setVisible(true);
        cf.setLocationRelativeTo(null);
	}
}
