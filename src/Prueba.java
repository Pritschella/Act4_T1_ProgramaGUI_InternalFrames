
import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.Date;

class VentanaInicio extends JFrame{
	
	JMenu masters, booking, testPerform, printing, transaction, labReports, Settings, Utilities, Window, Help;
	
	
	public VentanaInicio() {
		
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		setTitle("Lab Master - Test Booking");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JMenuBar menuBar =  new JMenuBar();
		masters =  new JMenu("Masters");
		menuBar.add(masters);
		
		booking =  new JMenu("Booking");
		menuBar.add(booking);
		
		testPerform = new JMenu("Test Perfom");
		menuBar.add(testPerform);
		
		printing = new JMenu("Printing");
		menuBar.add(printing);
		
		transaction = new JMenu("Transaction");
		menuBar.add(transaction);
		
		labReports = new JMenu("Lab Reports");
		menuBar.add(labReports);
		
		Settings = new JMenu("Settings");
		menuBar.add(Settings);
		
		Utilities = new JMenu("Utilities");
		menuBar.add(Utilities);
		
		Window =  new JMenu("Window");
		menuBar.add(Window);
		
		Help = new JMenu("Help");
		menuBar.add(Help);
		
		
		setJMenuBar(menuBar);
		
		
		
		JToolBar toolBar = new JToolBar();
			ImageIcon imagenAdd = new ImageIcon("add.jpg");
			ImageIcon imagenAddFinal = new ImageIcon(imagenAdd.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenAddFinal));
			ImageIcon imagenEdit = new ImageIcon("Edit.jpg");
			ImageIcon imagenEditFinal = new ImageIcon(imagenEdit.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenEditFinal));
			ImageIcon imagenBack = new ImageIcon("Back.jpg");
			ImageIcon imagenBackFinal = new ImageIcon(imagenBack.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenBackFinal));
			ImageIcon imagenNext = new ImageIcon("Next.jpg");	
			ImageIcon imagenNextFinal = new ImageIcon(imagenNext.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenNextFinal));
			ImageIcon imagenList = new ImageIcon("List.jpg");	
			ImageIcon imagenListFinal = new ImageIcon(imagenList.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenListFinal));
			ImageIcon imagenSave = new ImageIcon("Save.jpg");	
			ImageIcon imagenSaveFinal = new ImageIcon(imagenSave.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));		
				toolBar.add(new JButton(imagenSaveFinal));
			ImageIcon imagenPrint = new ImageIcon("Print.jpg");	
			ImageIcon imagenPrintFinal = new ImageIcon(imagenPrint.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenPrintFinal));
			ImageIcon imagenTest = new ImageIcon("Test.jpg");	
			ImageIcon imagenTestFinal = new ImageIcon(imagenTest.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenTestFinal));
			ImageIcon imagenCancel = new ImageIcon("Cancel.jpg");	
			ImageIcon imagenCancelFinal = new ImageIcon(imagenCancel.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenCancelFinal));
			ImageIcon imagenSettings = new ImageIcon("Settings.jpg");	
			ImageIcon imagenSettingsFinal = new ImageIcon(imagenSettings.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenSettingsFinal));
			ImageIcon imagenDelete = new ImageIcon("Delet.jpg");	
			ImageIcon imagenDeleteFinal = new ImageIcon(imagenDelete.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenDeleteFinal));
			ImageIcon imagenSlip = new ImageIcon("Slip.jpg");	
			ImageIcon imagenSlipFinal = new ImageIcon(imagenSlip.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));
				toolBar.add(new JButton(imagenSlipFinal));
			ImageIcon imagenExit = new ImageIcon("Exit.jpg");	
			ImageIcon imagenExitFinal = new ImageIcon(imagenExit.getImage().getScaledInstance(45, 45, Image.SCALE_REPLICATE));	
				toolBar.add(new JButton(imagenExitFinal));
		
		add(toolBar, BorderLayout.PAGE_START);
		
		JPanel panel1 =  new JPanel(new FlowLayout());
		
		panel1.setBackground(Color.PINK);
		panel1.setBorder(BorderFactory.createTitledBorder(""));
		panel1.setPreferredSize(new Dimension(150, 120));
		
				JLabel lblID = new JLabel("Patient ID ");
				lblID.setBounds(5, 5, 5, 5);
				panel1.add(lblID);
				JTextField cajaID = new JTextField(10);
				panel1.add(cajaID);
		
				JLabel lblDato = new JLabel("Dato");
				lblDato.setBounds(10, 200, 150, 30);
				panel1.add(lblDato);
				
				Calendar calendar = Calendar.getInstance();
				Date initDate = calendar.getTime();
					calendar.add(calendar.YEAR, -100);
					Date earliestDate = calendar.getTime();
					calendar.add(calendar.YEAR, 200);
					Date latestDate = calendar.getTime();
					SpinnerModel dateModel = new SpinnerDateModel(initDate, earliestDate, latestDate, calendar.YEAR);
					
					JSpinner spinnerFechaNac = new JSpinner(dateModel);
					spinnerFechaNac.setEditor(new JSpinner.DateEditor(spinnerFechaNac));
					
					 spinnerFechaNac.setBounds(200, 200, 120, 30);
		   			panel1.add(spinnerFechaNac); 
				
			
				add(panel1);
		
		pack();
		
	}//Constructor
	
}//ClaseVentanaInicio


public class Prueba {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaInicio();
				
			}
		});

	}//main

}//Class
