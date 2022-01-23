package com.example.abassihindag7;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	RadioButton rbsgbd, rbse, rblangage, rbpapk, rbpjar, rbpwar, rbhtml,
			rbjavascript, rbxml, rbdiag, rbmodel, rborga;
	TextView tvp;
	Button bscore, brejouer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		rbsgbd = (RadioButton) findViewById(R.id.rbsgbd);
		rbse = (RadioButton) findViewById(R.id.rbse);
		rblangage = (RadioButton) findViewById(R.id.rblangage);
		rbpapk = (RadioButton) findViewById(R.id.rbpapk);
		rbpjar = (RadioButton) findViewById(R.id.rbpjar);
		rbpwar = (RadioButton) findViewById(R.id.rbpwar);
		rbhtml = (RadioButton) findViewById(R.id.rbhtml);
		rbjavascript = (RadioButton) findViewById(R.id.rbjavascript);
		rbxml = (RadioButton) findViewById(R.id.rbxml);
		rbdiag = (RadioButton) findViewById(R.id.rbdiag);
		rbmodel = (RadioButton) findViewById(R.id.rbmod);
		rborga = (RadioButton) findViewById(R.id.rborgan);
		bscore = (Button) findViewById(R.id.bscore);
		brejouer = (Button) findViewById(R.id.brejouer);
		tvp = (TextView) findViewById(R.id.tvp);

		// ***************************************************************************

		bscore.setOnClickListener(this);
		brejouer.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View v) {
		int scoreandroid, scoreinstallable, scorelayout, scoremvc, score;
		if (v == brejouer) {
			tvp.setText("...........................");
			rbsgbd.setChecked(false);
			rbse.setChecked(false);
			rblangage.setChecked(false);
			rbpapk.setChecked(false);
			rbpjar.setChecked(false);
			rbpwar.setChecked(false);
			rbhtml.setChecked(false);
			rbjavascript.setChecked(false);
			rbxml.setChecked(false);
			rbdiag.setChecked(false);
			rbmodel.setChecked(false);
			rborga.setChecked(false);

		}
		if (v == bscore) {
			if (rbse.isChecked() == true && rbsgbd.isChecked() == false
					&& rblangage.isChecked() == false) {
				scoreandroid = 1;
			} else {
				scoreandroid = 0;
			}
			// //////////////////////////////
			if (rbpapk.isChecked() == true && rbpjar.isChecked() == false
					&& rbpwar.isChecked() == false) {
				scoreinstallable = 1;
			} else {
				scoreinstallable = 0;
			}
			// //////////////////////////////
			if (rbxml.isChecked() == true && rbhtml.isChecked() == false
					&& rbjavascript.isChecked() == false) {
				scorelayout = 1;
			} else {
				scorelayout = 0;
			}
			// //////////////////////////////
			if (rbmodel.isChecked() == true && rbdiag.isChecked() == false
					&& rborga.isChecked() == false) {
				scoremvc = 1;
			} else {
				scoremvc = 0;
			}
			score=scoreandroid+scoreinstallable+scorelayout+scoremvc;
			tvp.setText(score+"");
			if (score<=2) {
				Toast.makeText(this, "Score insuffisant, Rejouer !", Toast.LENGTH_LONG).show();
				
			}else {
				Toast.makeText(this, "Trés bien jouer!", Toast.LENGTH_LONG).show();
			}
			
			
			
			
			
//au depare jai tester et ca a marcher mais apres le timeout l'emulteur n'as pas fonctionné pour que je reteste
		}
	}

}
