/**
 * @author admin Govinda A. Paliwal
 */
package com.govinda.adhaarcardscan;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity {

	EditText et_anv_first_name,et_anv_middle_name,et_anv_last_name,et_anv_age,et_mar_first_name,et_mar_middle_name,
	et_mar_last_name,et_anv_religion,et_anv_cast,
	et_anv_houseno,et_anv_society,et_anv_lane,et_anv_colony,et_anv_city,et_anv_taluka,et_anv_district,et_anv_pinno,
	et_mar_houseno,et_mar_society,et_mar_lane,et_mar_colony,et_mar_city,et_mar_taluka,et_mar_district,et_mar_pinno;
	CheckBox cb_anv_voted_status;
	RadioButton rb_anv_m,rb_anv_f;
	
	Button et_anv_submit,et_anv_reset,btn_start;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_user);
		// Show the Up button in the action bar.
		init();

		setupActionBar();
	}

	private void init() {
		// TODO Auto-generated method stub
		
		et_anv_first_name = (EditText) findViewById(R.id.et_anv_first_name);
		et_anv_middle_name = (EditText) findViewById(R.id.et_anv_middle_name);
		et_anv_last_name = (EditText) findViewById(R.id.et_anv_last_name);
		et_anv_age = (EditText) findViewById(R.id.et_anv_age);
		et_mar_first_name = (EditText) findViewById(R.id.et_mar_first_name);
		et_mar_middle_name = (EditText) findViewById(R.id.et_mar_middle_name);
		et_mar_last_name = (EditText) findViewById(R.id.et_mar_last_name);
		et_anv_religion = (EditText) findViewById(R.id.et_anv_religion);
		et_anv_cast = (EditText) findViewById(R.id.et_anv_cast);
		
		et_anv_houseno = (EditText) findViewById(R.id.et_anv_houseno);
		et_anv_society = (EditText) findViewById(R.id.et_anv_society);
		et_anv_lane = (EditText) findViewById(R.id.et_anv_lane);
		et_anv_colony = (EditText) findViewById(R.id.et_anv_colony);
		et_anv_city = (EditText) findViewById(R.id.et_anv_city);
		et_anv_taluka = (EditText) findViewById(R.id.et_anv_taluka);
		et_anv_district = (EditText) findViewById(R.id.et_anv_district);
		et_anv_pinno = (EditText) findViewById(R.id.et_anv_pinno);
		
		
		et_mar_houseno = (EditText) findViewById(R.id.et_mar_houseno);
		et_mar_society = (EditText) findViewById(R.id.et_mar_society);
		et_mar_lane = (EditText) findViewById(R.id.et_mar_lane);
		et_mar_colony = (EditText) findViewById(R.id.et_mar_colony);
		et_mar_city = (EditText) findViewById(R.id.et_mar_city);
		et_mar_taluka = (EditText) findViewById(R.id.et_mar_taluka);
		et_mar_district = (EditText) findViewById(R.id.et_mar_district);
		et_mar_pinno = (EditText) findViewById(R.id.et_mar_pinno);
		
		rb_anv_m = (RadioButton) findViewById(R.id.rb_anv_m);
		rb_anv_f = (RadioButton) findViewById(R.id.rb_anv_f);
		
		Button btn_anv_submit = (Button) findViewById(R.id.et_anv_submit);
		Button btn_anv_reset = (Button) findViewById(R.id.et_anv_reset);
		btn_start = (Button) findViewById(R.id.button1);
		
		btn_start.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {

				    Intent intent = new Intent("com.google.zxing.client.android.SCAN");
				    intent.putExtra("SCAN_MODE", "QR_CODE_MODE"); // "PRODUCT_MODE for bar codes

				    startActivityForResult(intent, 0);

				} catch (Exception e) {

				    Uri marketUri = Uri.parse("market://details?id=com.google.zxing.client.android");
				    Intent marketIntent = new Intent(Intent.ACTION_VIEW,marketUri);
				    startActivity(marketIntent);

				}

			}
		});
		
		btn_anv_submit.setOnClickListener(new OnClickListener() 
		{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		btn_anv_reset.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				resetButton();
			}

			private void resetButton() {
				// TODO Auto-generated method stub
				et_anv_first_name.setText("");
				et_anv_middle_name.setText("");
				et_anv_last_name.setText("");
				et_anv_age.setText("");
				et_mar_first_name.setText("");
				et_mar_middle_name.setText("");
				et_mar_last_name.setText("");
				
				et_anv_religion.setText("");
				et_anv_cast.setText("");
				
				et_anv_houseno.setText("");
				et_anv_society.setText("");
				et_anv_lane.setText("");
				et_anv_colony.setText("");
				et_anv_city.setText("");
				et_anv_taluka.setText("");
				et_anv_district.setText("");
				et_anv_pinno.setText("");
				
				et_mar_houseno.setText("");
				et_mar_society.setText("");
				et_mar_lane.setText("");
				et_mar_colony.setText("");
				et_mar_city.setText("");
				et_mar_taluka.setText("");
				et_mar_district.setText("");
				et_mar_pinno.setText("");
				
				cb_anv_voted_status.setChecked(false);
				rb_anv_m.setChecked(true);
				rb_anv_f.setChecked(false);
			}
		});
	}
	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		
		return true;
	}

	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		try {
		if (requestCode == 0) {

	        if (resultCode == RESULT_OK) {
	            String contents = data.getStringExtra("SCAN_RESULT");
	            Log.e("scan result"," "+contents);
	            try {
	            	
	            	
					AadhaarCard newCard = new AadhaarXMLParser().parse(contents);
					
					//et_anv_city.setText(""+newCard.co);
					et_anv_pinno.setText(""+newCard.pincode);
					//et_anv_age.setText(""+newCard.dob);
					if (newCard.po.equals("") || newCard.po==null) 
					{
						et_anv_city.setText(""+newCard.dist);
					}else
					{
						et_anv_city.setText(""+newCard.po);
					}
					if (newCard.gender.equals("M") || newCard.gender.toLowerCase().equals("male"))
					{
						rb_anv_m.setChecked(true);
					}
					else
					{
						rb_anv_f.setChecked(true);
					}
					if (newCard.house=="null" || newCard.house=="" || newCard.house==null) 
					{}else
					{
						et_anv_society.setText(""+newCard.house);
					}
					if (newCard.dist=="null" || newCard.dist=="" || newCard.dist==null) 
					{}else{
						et_anv_district.setText(""+newCard.dist);
					}
					
					try {
					
					String[] name=newCard.name.split(" ");
					
					et_anv_first_name.setText(""+name[0]);
					if (name.length>1) 
					{
					et_anv_middle_name.setText(""+name[1]);
					et_anv_last_name.setText(""+name[2]);
					}
					else
					{
						et_anv_last_name.setText(""+name[1]);
					}
					
					} catch (Exception e) {
						// TODO: handle exception
					}
	            } catch (XmlPullParserException e) {
					// TODO Auto-generated catch block
	            	Toast.makeText(getApplicationContext(), " Card Not Supported",2000).show();
	            	
	            	AlertDialog.Builder alertDialog2 = new AlertDialog.Builder(
	            	        MainActivity.this);

	            	// Setting Dialog Title
	            	alertDialog2.setTitle("Card Not Supported With full information.");

	            	// Setting Dialog Message
	            	alertDialog2.setMessage("Your Scan Detail:"+contents);


	            	// Setting Positive "Yes" Btn
	            	alertDialog2.setPositiveButton("YES",
	            	        new DialogInterface.OnClickListener() {
	            	            public void onClick(DialogInterface dialog, int which) {
	            	                // Write your code here to execute after dialog

	            	                dialog.cancel();
	            	            }
	            	        });
	            	// Setting Negative "NO" Btn
	            	alertDialog2.setNegativeButton("NO",
	            	        new DialogInterface.OnClickListener() {
	            	            public void onClick(DialogInterface dialog, int which) {
	            	                // Write your code here to execute after dialog
	            	                
	            	                dialog.cancel();
	            	            }
	            	        });

	            	// Showing Alert Dialog
	            	alertDialog2.show();
	            	
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
               // Persistence.storeAadhaarCard(this, newCard);
	        }
	        if(resultCode == RESULT_CANCELED){
	            //handle cancel
	        	Log.e("scan result"," cancle");
	        }
	    }		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	

}
