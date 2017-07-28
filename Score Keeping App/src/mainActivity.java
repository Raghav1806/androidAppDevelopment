package com.example.android.courtcounter

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

	int scoreTeamA = 0;
	int scoreTeamB = 0;

	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getNebuInflator().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		int id = item.getItemId();

		if(id == R.id.action_settings){
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	// increase the score for Team A by 1 point
	public void addOneForTeamA(View v){
		scoreTeamA = scoreTeamA + 1;
		displayForTeamA(scoreTeamA);
	}

	// increase the score for Team A by 2 points
	public void addTwoForTeamA(View v){
		scoreTeamA = scoreTeamA + 2;
		displayForTeamA(scoreTeamA);
	} 

	// increase the given score for Team A by 3 points
	public void addThreeForTeamA(View v){
		scoreTeamA = scoreTeamA + 3;
		displayForTeamA(scoreTeamA);
	}

	// increase the score for Team B by 1 point
	public void addOneForTeamB(View v){
		scoreTeamB = scoreTeamB + 1;
		displayForTeamB(scoreTeamB);
	}

	// increase the score for Team B by 2 points
	public void addTwoForTeamB(View v){
		scoreTeamB = scoreTeamB + 2;
		displayForTeamB(scoreTeamB);
	} 

	// increase the given score for Team B by 3 points
	public void addThreeForTeamB(View v){
		scoreTeamB = scoreTeamB + 3;
		displayForTeamB(scoreTeamB);
	}

	// displays the given score for Team A
	public void displayForTeamA(int score){
		TextView scoreView = (TextView) findViewById(R.id.team_a_score);
		scoreView.setText(String.valueOf(score));
	}

	// displays the given score for Team B
	public void displayForTeamB(int score){
		TextView scoreView = (TextView) findViewById(R.id.team_b_score);
		scoreView.setText(String.valueOf(score));
	}

	// resets the score for both teams
	public void resetBothScores(View v){
		scoreTeamA = 0;
		scoreTeamB = 0;
		displayForTeamA(scoreTeamA);
		displayForTeamB(scoreTeamB);
	}
}

