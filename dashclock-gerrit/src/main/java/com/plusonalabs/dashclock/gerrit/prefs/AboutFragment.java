package com.plusonalabs.dashclock.gerrit.prefs;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.plusonalabs.dashclock.gerrit.R;

public class AboutFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.about_settings);
	}
}