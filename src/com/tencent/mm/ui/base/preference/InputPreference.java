package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.mm.i;

public class InputPreference extends Preference
{
  private EditText jcv;
  private String jgQ;
  private String jgR;
  private Button jgS;
  private s jgT;
  private View.OnClickListener jgU = new q(this);
  private TextView.OnEditorActionListener jgV = new r(this);

  public InputPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public InputPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.jcv = ((EditText)paramView.findViewById(i.aqy));
    this.jcv.setHint(this.jgQ);
    this.jcv.setOnEditorActionListener(this.jgV);
    this.jgS = ((Button)paramView.findViewById(i.button));
    this.jgS.setText(this.jgR);
    this.jgS.setOnClickListener(this.jgU);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.InputPreference
 * JD-Core Version:    0.6.2
 */