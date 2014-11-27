package org.apmem.tools.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import org.apmem.tools.layouts.FlowLayout;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        final FlowLayout layout = (FlowLayout) this.findViewById(R.id.flowLayout);

        layout.setOrientation(FlowLayout.HORIZONTAL);

        TextView textView;
        textView = new TextView(this);
        textView.setLayoutParams(new FlowLayout.LayoutParams(100, 100));
        textView.setTextAppearance(this, android.R.style.TextAppearance_Medium);
        textView.setText("Switch Orientation");
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setOrientation(1 - layout.getOrientation());
            }
        });
        layout.addView(textView, 0);

        textView = new TextView(this);
        textView.setLayoutParams(new FlowLayout.LayoutParams(100, 100));
        textView.setText("appearance");
        layout.addView(textView, 0);

        layout.setGravity(Gravity.CENTER);
        layout.setFillLines(FlowLayout.FILL_LINES_EXCEPT_LAST);
    }
}
