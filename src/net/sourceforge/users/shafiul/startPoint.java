package net.sourceforge.users.shafiul;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class startPoint extends Activity {
	
	
	int counter;
	
	Button add, sub;
	TextView display;
	
	public void updateDisplay(){
		this.display.setText("Your total is: " + this.counter);
	}
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // Custom
        this.counter = 0;
        this.add = (Button) this.findViewById(R.id.bAdd);
        this.sub = (Button) this.findViewById(R.id.bSub);
        this.display = (TextView) this.findViewById(R.id.tvDisplay);
        
        this.add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				counter++;
				updateDisplay();
			}
		});
        
        this.sub.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				counter--;
				updateDisplay();
			}
		});
        
    }
}