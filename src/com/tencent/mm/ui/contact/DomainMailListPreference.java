package com.tencent.mm.ui.contact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;

public class DomainMailListPreference extends Preference
{
  private TextView ejS;
  private boolean hHI;
  private String jzF;
  private TextView jzG;
  private TextView jzH;
  private TextView jzI;
  private String title;

  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    init();
  }

  public DomainMailListPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    init();
  }

  private void init()
  {
    this.hHI = false;
    this.title = "";
    this.jzF = "";
  }

  public final void onBindView(View paramView)
  {
    this.ejS = ((TextView)paramView.findViewById(i.title));
    this.jzG = ((TextView)paramView.findViewById(i.atK));
    this.jzH = ((TextView)paramView.findViewById(i.aNH));
    this.jzI = ((TextView)paramView.findViewById(i.aSJ));
    this.hHI = true;
    if (!this.hHI)
    {
      z.e("!44@/B4Tb64lLpI/Hb+9SS4dDy2P6MJ4r/GGzM67i80geIo=", "initView : unbind view");
      super.onBindView(paramView);
      return;
    }
    this.ejS.setText(ap.ja(this.title));
    String[] arrayOfString = this.jzF.split(";");
    if (ap.ja(this.jzF).length() <= 0)
    {
      this.jzG.setVisibility(8);
      this.jzH.setVisibility(8);
    }
    label174: label243: label253: 
    while (true)
    {
      this.jzI.setVisibility(8);
      break;
      if (arrayOfString.length > 0)
      {
        this.jzG.setVisibility(0);
        this.jzG.setText(ap.ja(arrayOfString[0]));
        if (arrayOfString.length <= 1)
          break label243;
        this.jzH.setVisibility(0);
        this.jzH.setText(ap.ja(arrayOfString[1]));
      }
      while (true)
      {
        if (arrayOfString.length <= 2)
          break label253;
        this.jzI.setVisibility(0);
        this.jzI.setText(ap.ja(arrayOfString[2]));
        break;
        this.jzG.setVisibility(8);
        break label174;
        this.jzH.setVisibility(8);
      }
    }
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(k.biP, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.contact.DomainMailListPreference
 * JD-Core Version:    0.6.2
 */