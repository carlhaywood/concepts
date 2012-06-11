/**
 * Copyright 2012 Carl Haywood
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.carlhaywood.example;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/**
 *
 */
public class Example extends Activity {

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		Application app = getApplication();
		Log.d(TAG, "onCreate() app class is " + app.getClass().getName());
		if (app instanceof ExampleApp) {
			Log.d(TAG, "onCreate() app is ExampleApp");
		}
    }

    //@SuppressWarnings("unused")
    private static final String TAG = Example.class.getSimpleName();
}