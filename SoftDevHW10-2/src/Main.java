import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;

public class Main extends Composite {
	private Text txtPleaseSlectPlayer;
	private Text ans;

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setLayout(new GridLayout(1, false));
		Main main = new Main(shell, SWT.NONE);
		shell.pack();
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();

		}
		display.dispose();
	}

	public Main(Composite parent, int style) {
		super(parent, style);
		setLayout(null);

		txtPleaseSlectPlayer = new Text(this, SWT.BORDER);
		txtPleaseSlectPlayer.setText("Please select player body type and fighting style");
		txtPleaseSlectPlayer.setBounds(10, 10, 267, 19);

		Combo Body = new Combo(this, SWT.NONE);
		Body.setBounds(10, 35, 267, 20);
		Body.setText("Body Type");
		Body.add("Small");
		Body.add("Medium");
		Body.add("Large");

		Combo Style = new Combo(this, SWT.NONE);
		Style.setBounds(10, 61, 267, 20);
		Style.setText("Fighting Style");
		Style.add("Wizard");
		Style.add("Archer");
		Style.add("Bare Knuckle");

		Button btnGetStats = new Button(this, SWT.NONE);
		btnGetStats.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				String style = Style.getText();
				String type = Body.getText();
				if (!style.equals("Fighting Style") && !type.equals("Body Type")) {
					System.out.println(type + style);
					ans.setText(Function.Stats(type, style));
				} else
					ans.setText("Please make sure you have both Fighting Style and Body Type fields are filled out.");

			}
		});
		btnGetStats.setBounds(109, 92, 70, 21);
		btnGetStats.setText("Get Stats");

		ans = new Text(this, SWT.BORDER | SWT.WRAP | SWT.H_SCROLL | SWT.CANCEL);
		ans.setBounds(10, 119, 267, 93);

	}
}
