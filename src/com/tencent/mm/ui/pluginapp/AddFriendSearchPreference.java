package com.tencent.mm.ui.pluginapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.s;

public class AddFriendSearchPreference extends Preference
{
  private Context context;
  private TextView iRc = null;
  private String jKw = "";
  private View.OnClickListener jKx = null;
  private View.OnClickListener jKy = null;
  private TextView jKz = null;
  private String jgQ = "";
  private s jgT = null;
  private View.OnClickListener jgU = new a(this);

  public AddFriendSearchPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public AddFriendSearchPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.context = paramContext;
    setLayoutResource(k.biA);
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    paramView.setOnTouchListener(new b(this));
    this.jKz = ((TextView)paramView.findViewById(i.aqy));
    this.iRc = ((TextView)paramView.findViewById(i.aOw));
    this.iRc.setText(this.jgQ);
    if (this.jKy != null)
      this.iRc.setOnTouchListener(new c(this));
    if (this.jgT != null)
    {
      Button localButton = (Button)paramView.findViewById(i.button);
      localButton.setOnClickListener(this.jgU);
      localButton.setVisibility(0);
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biL, localViewGroup);
    localViewGroup.setPadding(0, localViewGroup.getPaddingTop(), 0, localViewGroup.getPaddingBottom());
    return localView;
  }

  public final void p(View.OnClickListener paramOnClickListener)
  {
    this.jKy = paramOnClickListener;
  }

  public final void sK(String paramString)
  {
    this.jgQ = paramString;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.pluginapp.AddFriendSearchPreference
 * JD-Core Version:    0.6.2
 */