package com.tencent.mm.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.k;
import com.tencent.mm.n;
import com.tencent.mm.platformtools.ap;
import com.tencent.mm.pluginsdk.ui.c;
import com.tencent.mm.ui.base.preference.Preference;

public class PersonalPreference extends Preference
{
  private String cGZ;
  private Bitmap dnb = null;
  private ImageView eTI = null;
  private TextView egA = null;
  private int jLE = -1;
  private String jLF = null;
  private View.OnClickListener jLG;
  private TextView joA = null;
  private String username;
  private String wP;

  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public PersonalPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(k.biA);
    setWidgetLayoutResource(k.bjA);
  }

  public final void Dg(String paramString)
  {
    this.dnb = null;
    this.jLE = -1;
    this.jLF = paramString;
    if (this.eTI != null)
      c.a(this.eTI, this.jLF);
  }

  public final void onBindView(View paramView)
  {
    if (this.eTI == null)
      this.eTI = ((ImageView)paramView.findViewById(com.tencent.mm.i.ayb));
    if (this.dnb != null)
    {
      this.eTI.setImageBitmap(this.dnb);
      this.eTI.setOnClickListener(this.jLG);
      if ((this.egA != null) && (this.cGZ != null))
      {
        TextView localTextView = this.egA;
        localTextView.setText(b.e(getContext(), this.cGZ, (int)this.egA.getTextSize()));
      }
      if (this.joA != null)
        if (!ap.jb(this.wP))
          break label230;
    }
    label230: for (String str = this.username; ; str = this.wP)
    {
      if ((ap.jb(this.wP)) && (com.tencent.mm.storage.i.yd(this.username)))
        this.joA.setVisibility(8);
      this.joA.setText(getContext().getString(n.btu) + str);
      super.onBindView(paramView);
      return;
      if (this.jLE > 0)
      {
        this.eTI.setImageResource(this.jLE);
        break;
      }
      if (this.jLF == null)
        break;
      c.a(this.eTI, this.jLF);
      break;
    }
  }

  public final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(com.tencent.mm.i.content);
    localViewGroup.removeAllViews();
    View.inflate(getContext(), k.biZ, localViewGroup);
    return localView;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.PersonalPreference
 * JD-Core Version:    0.6.2
 */