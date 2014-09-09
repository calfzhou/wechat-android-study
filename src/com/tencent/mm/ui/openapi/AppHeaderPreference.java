package com.tencent.mm.ui.openapi;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.h;
import com.tencent.mm.i;
import com.tencent.mm.sdk.platformtools.z;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.tools.gx;
import junit.framework.Assert;

public class AppHeaderPreference extends Preference
{
  private boolean cPf = false;
  private ImageView dXf;
  private TextView fFM;
  private TextView gGk;
  private TextView jAg;
  private f jJT;
  private boolean jiT = false;

  public AppHeaderPreference(Context paramContext)
  {
    super(paramContext);
  }

  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public AppHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final void a(f paramf, boolean paramBoolean)
  {
    if (paramf != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.jJT = paramf;
      this.cPf = paramBoolean;
      return;
    }
  }

  public final void onBindView(View paramView)
  {
    this.dXf = ((ImageView)paramView.findViewById(i.anA));
    this.fFM = ((TextView)paramView.findViewById(i.aoj));
    this.gGk = ((TextView)paramView.findViewById(i.anT));
    this.jAg = ((TextView)paramView.findViewById(i.anH));
    this.jiT = true;
    if ((!this.jiT) || (this.jJT == null))
      z.w("!44@/B4Tb64lLpIUftlnEWQSPgPihVSF2s4yaiphwPNRsuQ=", "initView : bindView = " + this.jiT);
    while (true)
    {
      super.onBindView(paramView);
      return;
      Bitmap localBitmap = this.jJT.aXd();
      if ((this.dXf != null) && (localBitmap != null) && (!localBitmap.isRecycled()))
        this.dXf.setImageBitmap(localBitmap);
      String str1 = this.jJT.aXc();
      if ((this.gGk != null) && (str1 != null) && (str1.length() > 0))
        this.gGk.setText(str1);
      String str2 = this.jJT.aXf();
      if (str2 != null)
      {
        this.jAg.setText(str2);
        this.jAg.setVisibility(0);
      }
      String str3;
      while (true)
      {
        boolean bool = this.cPf;
        if (this.fFM == null)
          break;
        str3 = this.jJT.fR(bool);
        if (!bool)
          break label317;
        if ((str3 == null) || (str3.length() <= 0))
          break label305;
        this.fFM.setTextColor(gx.cE(getContext()));
        this.fFM.setText(str3);
        this.fFM.setCompoundDrawablesWithIntrinsicBounds(h.abr, 0, 0, 0);
        break;
        this.jAg.setVisibility(8);
      }
      label305: this.fFM.setVisibility(8);
      continue;
      label317: if ((str3 != null) && (str3.length() > 0))
      {
        this.fFM.setTextColor(gx.cF(getContext()));
        this.fFM.setText(str3);
        this.fFM.setCompoundDrawablesWithIntrinsicBounds(h.abq, 0, 0, 0);
      }
      else
      {
        this.fFM.setVisibility(8);
      }
    }
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.openapi.AppHeaderPreference
 * JD-Core Version:    0.6.2
 */