package com.tencent.mm.ui.setting;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.model.b;
import com.tencent.mm.model.bg;
import com.tencent.mm.n.af;
import com.tencent.mm.n.c;
import com.tencent.mm.n.m;
import com.tencent.mm.n.p;
import com.tencent.mm.sdk.platformtools.cm;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.storage.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;

public final class PluginPreference extends Preference
  implements p
{
  private MMActivity cHh;
  private ImageView dtI = null;
  private String eCj = "";
  private int eCk = -1;
  private int eCl = 8;
  private int hIb = 255;
  private String htW;
  private String jLH;

  public PluginPreference(Context paramContext)
  {
    this(paramContext, null);
  }

  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public PluginPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.cHh = ((MMActivity)paramContext);
    setLayoutResource(com.tencent.mm.k.biA);
    af.sh().a(this);
  }

  private void aDf()
  {
    Bitmap localBitmap;
    if (this.dtI != null)
    {
      localBitmap = c.a(this.jLH, false, -1);
      if (localBitmap == null)
        this.dtI.setImageResource(h.WL);
    }
    else
    {
      return;
    }
    this.dtI.setImageBitmap(localBitmap);
    this.dtI.setBackgroundColor(0);
  }

  public final boolean Dh(String paramString)
  {
    com.tencent.mm.storage.i locali = bg.qW().oT().ys(paramString);
    if ((locali == null) || ((int)locali.dhv == 0))
    {
      z.e("!44@/B4Tb64lLpIAPs38FVmjNIUI+nJN6dY8PnY5jfKlFr0=", "plugin do not exist");
      return false;
    }
    this.jLH = locali.getUsername();
    this.htW = locali.oc();
    setKey("settings_plugins_list_#" + this.jLH);
    return true;
  }

  public final String aYZ()
  {
    return this.htW;
  }

  public final String aZa()
  {
    return this.jLH;
  }

  public final void aq(String paramString, int paramInt)
  {
    this.eCj = paramString;
    this.eCk = paramInt;
  }

  public final void eX(String paramString)
  {
    if ((this.jLH != null) && (this.jLH.equals(paramString)))
      new cm(Looper.getMainLooper()).post(new k(this));
  }

  protected final void onBindView(View paramView)
  {
    super.onBindView(paramView);
    this.dtI = ((ImageView)paramView.findViewById(com.tencent.mm.i.ayb));
    this.dtI.setAlpha(this.hIb);
    TextView localTextView = (TextView)paramView.findViewById(com.tencent.mm.i.aSG);
    if (localTextView != null)
    {
      localTextView.setVisibility(this.eCl);
      localTextView.setText(this.eCj);
      if (this.eCk != -1)
        localTextView.setBackgroundDrawable(com.tencent.mm.aq.a.n(this.cHh, this.eCk));
    }
    aDf();
  }

  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    View localView = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)getContext().getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)localView.findViewById(com.tencent.mm.i.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(com.tencent.mm.k.bja, localViewGroup);
    return localView;
  }

  public final void pT(int paramInt)
  {
    this.eCl = paramInt;
  }

  public final void qJ(int paramInt)
  {
    this.hIb = paramInt;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.setting.PluginPreference
 * JD-Core Version:    0.6.2
 */