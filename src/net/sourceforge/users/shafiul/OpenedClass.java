package net.sourceforge.users.shafiul;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener {
	
	TextView question, test;
	Button returnData;
	RadioGroup selectionList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// custom
		setContentView(R.layout.send);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvText);
		returnData = (Button) findViewById(R.id.bReturn);
		returnData.setOnClickListener(this);
		selectionList.setOnCheckedChangeListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	public void onCheckedChanged(RadioGroup group, int checkedId) {
		switch(checkedId){
		case R.id.rCrazy:
			break;
		case R.id.rSexy:
			break;
		case R.id.rBoth:
			break;
		}
		
	}

}
