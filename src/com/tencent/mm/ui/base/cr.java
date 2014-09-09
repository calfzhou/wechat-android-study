package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.z;

public final class cr extends dd
{
  private int fyM;
  private View gIm;
  private TextView jaR;
  private ProgressBar jaS;
  private Context mContext;

  private cr(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, paramInt1);
    this.mContext = paramContext;
    this.fyM = paramInt2;
    int i;
    switch (this.fyM)
    {
    default:
      i = k.bjE;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      this.gIm = View.inflate(this.mContext, i, null);
      this.jaR = ((TextView)this.gIm.findViewById(i.aEu));
      this.jaS = ((ProgressBar)this.gIm.findViewById(i.aEt));
      setCanceledOnTouchOutside(true);
      return;
      i = k.bjE;
      continue;
      i = k.bjF;
      continue;
      i = k.bjE;
    }
  }

  public static cr a(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    int i;
    switch (paramInt)
    {
    default:
      i = o.cuP;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      cr localcr = new cr(paramContext, i, paramInt);
      localcr.setMessage(paramCharSequence);
      localcr.setCancelable(paramBoolean);
      localcr.setOnCancelListener(paramOnCancelListener);
      localcr.setCanceledOnTouchOutside(false);
      return localcr;
      i = o.cuM;
      continue;
      i = o.cuM;
      continue;
      i = o.cuM;
    }
  }

  public static cr b(Context paramContext, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    cr localcr = a(paramContext, paramCharSequence, paramBoolean, paramInt, paramOnCancelListener);
    localcr.show();
    return localcr;
  }

  public final void aSm()
  {
    if (this.jaS != null)
      this.jaS.setVisibility(8);
  }

  public final void dismiss()
  {
    try
    {
      super.dismiss();
      return;
    }
    catch (Exception localException)
    {
      z.e("!44@/B4Tb64lLpJDo00GMnWoAcVr9A609/EODCMtTr6hXKs=", "dismiss exception, e = " + localException.getMessage());
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.gIm, new LinearLayout.LayoutParams(-1, -1));
    WindowManager.LayoutParams localLayoutParams = getWindow().getAttributes();
    localLayoutParams.width = -1;
    localLayoutParams.height = -2;
    if (this.fyM == 2)
    {
      getWindow().addFlags(2);
      localLayoutParams.dimAmount = 0.65F;
    }
    onWindowAttributesChanged(localLayoutParams);
  }

  public final void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    setCanceledOnTouchOutside(paramBoolean);
  }

  public final void setMessage(CharSequence paramCharSequence)
  {
    this.jaR.setText(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.cr
 * JD-Core Version:    0.6.2
 */