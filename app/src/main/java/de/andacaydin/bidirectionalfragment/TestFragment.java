package de.andacaydin.bidirectionalfragment;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.andacaydin.bidirectionalviewpagerlibrary.BiDirectionalFragment;

public final class TestFragment extends BiDirectionalFragment {
    private static final String KEY_CONTENT = "TestFragment:Content";

	public static TestFragment newInstance(String content) {
		TestFragment fragment = new TestFragment();

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 30; i++) {
			builder.append(content).append(" ");
		}
		builder.deleteCharAt(builder.length() - 1);
		fragment.mContent = builder.toString();

		return fragment;
	}

	private String mContent = "FIRST";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		if ((savedInstanceState != null) && savedInstanceState.containsKey(KEY_CONTENT)) {
			mContent = savedInstanceState.getString(KEY_CONTENT);
		}

		TextView text = new TextView(getActivity());
		text.setText(mContent);
		text.setTextSize(20 * getResources().getDisplayMetrics().density);
		text.setPadding(20, 20, 20, 20);
		text.setGravity(Gravity.CENTER);
        text.setBackgroundColor(getResources().getColor(android.R.color.white));

		LinearLayout layout = new LinearLayout(getActivity());
		layout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.FILL_PARENT, ViewGroup.LayoutParams.FILL_PARENT));
		layout.setGravity(Gravity.CENTER);
        layout.setBackgroundColor(getResources().getColor(R.color.Aquamarine));
		layout.addView(text);

		return layout;
	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putString(KEY_CONTENT, mContent);
	}

    @Override
    public Class getLeftFragment() {
        return TestFragment2.class;
    }

    @Override
    public Class getRightFragment() {
        return TestFragment4.class;
    }

    @Override
    public Class getTopFragment() {
        return TestFragment3.class;
    }

    @Override
    public Class getBottomFragment() {
        return null;
    }
}