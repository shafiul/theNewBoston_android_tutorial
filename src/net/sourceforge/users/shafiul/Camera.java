package net.sourceforge.users.shafiul;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Camera extends Activity implements View.OnClickListener{

	Button b;
	ImageButton ib;
	ImageView iv;
	
	Intent i;
	final static int cameraData = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// custom
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		b = (Button) findViewById(R.id.bSetWall);
		ib = (ImageButton) findViewById(R.id.ibTakePic);
		iv = (ImageView) findViewById(R.id.ivReturnedPic);
		
		b.setOnClickListener(this);
		ib.setOnClickListener(this);
	}

	public void onClick(View v) {
		switch(v.getId()){
		case R.id.ibTakePic:
			i = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(i, cameraData);
			
			break;
		case R.id.bSetWall:
			break;
		}
	}
	
	

}
