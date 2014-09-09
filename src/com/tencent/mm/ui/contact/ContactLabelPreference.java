package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.ui.base.MMSingelLinePanel;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.ArrayList;

public class ContactLabelPreference extends Preference
{
  private TextView ejS;
  private MMSingelLinePanel jyx;
  private ArrayList jyy = new ArrayList();
  private String title;

  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, -1);
  }

  public ContactLabelPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
  }

  protected final void onBindView(View paramView)
  {
    this.ejS = ((TextView)paramView.findViewById(i.title));
    this.jyx = ((MMSingelLinePanel)paramView.findViewById(i.aos));
    this.jyx.aSt();
    this.jyx.aSI();
    this.jyx.eV(false);
    if (this.ejS != null)
      this.ejS.setText(this.title);
    if ((this.jyx != null) && (this.jyy != null) && (this.jyy.size() > 0))
      this.jyx.a(this.jyy, this.jyy);
    super.onBindView(paramView);
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biW, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.ContactLabelPreference
 * JD-Core Version:    0.6.2
 */