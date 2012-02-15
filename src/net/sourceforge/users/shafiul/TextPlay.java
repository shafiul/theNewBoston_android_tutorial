package net.sourceforge.users.shafiul;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// our code
		setContentView(R.layout.text);
		
		Button chkCmd = (Button) findViewById(R.id.bResults);
		final ToggleButton passTog = (ToggleButton) findViewById(R.id.tbPassword);
		final EditText input = (EditText) findViewById(R.id.etCommands);
		TextView display = (TextView) findViewById(R.id.tvResults);
		
		passTog.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				if(passTog.isChecked()){
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		
		
		chkCmd.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				String check = input.getText().toString();
				if(check.contentEquals("left")){
					
				}else if(check.contentEquals("center")){
					
				}else if(check.contentEquals("right")){
					
				}
				
			}
		});
	}

	
	
	
}
