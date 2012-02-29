package net.sourceforge.users.shafiul;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity implements View.OnClickListener {

	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// our code
		setContentView(R.layout.text);

		backonAndEgg();

		passTog.setOnClickListener(this);

		chkCmd.setOnClickListener(this);
	}

	private void backonAndEgg() {
		chkCmd = (Button) findViewById(R.id.bResults);
		passTog = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tvResults);

	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bResults:

			String check = input.getText().toString();
			display.setText(check);

			if (check.contentEquals("left")) {
				display.setGravity(Gravity.LEFT);

			} else if (check.contentEquals("center")) {
				display.setGravity(Gravity.CENTER);

			} else if (check.contentEquals("right")) {
				display.setGravity(Gravity.RIGHT);

			} else if (check.contentEquals("blue")) {
				display.setTextColor(Color.BLUE);

			} else if (check.contains("WTF")) {
				Random crazy = new Random();
				display.setText("WTF!!!");
				display.setTextSize(crazy.nextInt(72));
				display.setTextColor(Color.rgb(crazy.nextInt(255),
						crazy.nextInt(255), crazy.nextInt(255)));

			} else {
				display.setText("invalid");
				display.setGravity(Gravity.CENTER);
			}

			break;

		case R.id.tbPassword:

			if (passTog.isChecked()) {
				input.setInputType(InputType.TYPE_CLASS_TEXT
						| InputType.TYPE_TEXT_VARIATION_PASSWORD);
			} else {
				input.setInputType(InputType.TYPE_CLASS_TEXT);
			}

			break;
		}
	}

}
