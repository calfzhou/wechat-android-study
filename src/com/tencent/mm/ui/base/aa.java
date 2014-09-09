package com.tencent.mm.ui.base;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.ar.b;
import com.tencent.mm.i;
import com.tencent.mm.k;
import com.tencent.mm.o;
import com.tencent.mm.sdk.platformtools.z;

public final class aa extends Dialog
  implements DialogInterface
{
  private Button hhs;
  private boolean hkF;
  private LinearLayout iXP;
  private Button iXQ;
  private TextView iXR;
  private TextView iXS;
  private TextView iXT;
  private ImageView iXU;
  private ImageView iXV;
  private View iXW;
  private LinearLayout iXX;
  private ViewGroup iXY;
  private ViewGroup iXZ;
  private View iYa;
  private View iYb;
  private View iz;
  private Context mContext;

  public aa(Context paramContext)
  {
    super(paramContext, o.cuM);
    this.mContext = paramContext;
    this.iXP = ((LinearLayout)View.inflate(this.mContext, k.bik, null));
    this.hhs = ((Button)this.iXP.findViewById(i.aEj));
    this.iXQ = ((Button)this.iXP.findViewById(i.aEb));
    this.iYb = this.iXP.findViewById(i.aDZ);
    this.iXR = ((TextView)this.iXP.findViewById(i.aEk));
    this.iXS = ((TextView)this.iXP.findViewById(i.aEi));
    this.iXT = ((TextView)this.iXP.findViewById(i.aEg));
    this.iXU = ((ImageView)this.iXP.findViewById(i.aEm));
    this.iXV = ((ImageView)this.iXP.findViewById(i.aEh));
    this.iXW = this.iXP.findViewById(i.aEl);
    this.iXX = ((LinearLayout)this.iXP.findViewById(i.aEf));
    this.iXY = ((ViewGroup)this.iXP.findViewById(i.aDY));
    this.iYa = this.iXP.findViewById(i.aEa);
    this.iXZ = ((ViewGroup)this.iXP.findViewById(i.aEc));
    setCanceledOnTouchOutside(true);
  }

  private void a(CharSequence paramCharSequence, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (this.iXQ == null)
      return;
    this.iXQ.setVisibility(0);
    this.iXQ.setText(paramCharSequence);
    this.iXQ.setOnClickListener(new ac(this, paramOnClickListener));
  }

  private void a(CharSequence paramCharSequence, boolean paramBoolean, DialogInterface.OnClickListener paramOnClickListener)
  {
    if (this.hhs == null)
      return;
    this.hhs.setVisibility(0);
    this.hhs.setText(paramCharSequence);
    this.hhs.setOnClickListener(new ab(this, paramOnClickListener, paramBoolean));
  }

  public final void a(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    a(this.mContext.getString(paramInt), true, paramOnClickListener);
  }

  public final void a(a parama)
  {
    if ((parama.title != null) && (parama.title.length() > 0))
      setTitle(parama.title);
    if (parama.iXf != null)
    {
      Drawable localDrawable2 = parama.iXf;
      this.iXW.setVisibility(0);
      this.iXU.setVisibility(0);
      this.iXU.setBackgroundDrawable(localDrawable2);
    }
    if (parama.hov != null)
    {
      this.iz = parama.hov;
      if (this.iz != null)
      {
        this.iXX.setVisibility(8);
        this.iXZ.setVisibility(0);
        this.iXZ.removeAllViews();
        this.iXZ.addView(this.iz, new LinearLayout.LayoutParams(-1, -1));
      }
      if (parama.iXo != null)
      {
        if (parama.iXq != null)
          break label522;
        View localView2 = parama.iXo;
        this.iYa.setVisibility(8);
        this.iXY.addView(localView2);
      }
      label169: if ((parama.iXj != null) && (parama.iXj.length() > 0))
        a(parama.iXj, parama.iXr, parama.iXm);
      if ((parama.iXk != null) && (parama.iXk.length() > 0))
        a(parama.iXk, parama.iXn);
      if ((parama.iXj != null) && (parama.iXj.length() != 0) && (parama.iXk != null) && (parama.iXk.length() != 0))
        break label555;
      this.iYb.setVisibility(8);
    }
    while (true)
    {
      if (parama.hkO != null)
        setOnCancelListener(parama.hkO);
      if (parama.hKs != null)
        setOnDismissListener(parama.hKs);
      if (parama.iXp > 0)
        pm(parama.iXp);
      setCancelable(parama.hkF);
      this.hkF = parama.hkF;
      if (!this.hkF)
        super.setCancelable(parama.iXl);
      return;
      if (parama.iXg != null)
      {
        Drawable localDrawable1 = parama.iXg;
        if (this.iz == null)
        {
          this.iXX.setGravity(19);
          this.iXT.setGravity(3);
          this.iXS.setGravity(3);
          this.iXR.setGravity(3);
          this.iXX.setVisibility(0);
          this.iXV.setVisibility(0);
          this.iXV.setBackgroundDrawable(localDrawable1);
        }
      }
      if ((parama.iXh != null) && (parama.iXh.length() > 0))
        setMessage(parama.iXh);
      if ((parama.iXi == null) || (parama.iXi.length() <= 0))
        break;
      CharSequence localCharSequence = parama.iXi;
      if (this.iz != null)
        break;
      this.iXX.setVisibility(0);
      this.iXT.setVisibility(0);
      this.iXT.setText(localCharSequence);
      break;
      label522: View localView1 = parama.iXo;
      ViewGroup.LayoutParams localLayoutParams = parama.iXq;
      this.iYa.setVisibility(8);
      this.iXY.addView(localView1, localLayoutParams);
      break label169;
      label555: this.iYb.setVisibility(0);
    }
  }

  public final void aRx()
  {
    if (this.iXT != null)
    {
      TextView localTextView2 = this.iXT;
      localTextView2.setText(b.c(this.iXT.getContext(), this.iXT.getText().toString(), (int)this.iXT.getTextSize()));
    }
    if (this.iXS != null)
    {
      TextView localTextView1 = this.iXS;
      localTextView1.setText(b.c(this.iXS.getContext(), this.iXS.getText().toString(), (int)this.iXS.getTextSize()));
    }
  }

  public final void aRy()
  {
    if (this.iz != null);
    while (this.iXT == null)
      return;
    this.iXT.setTextColor(-16777216);
  }

  public final void aRz()
  {
    this.hhs.setVisibility(0);
    if (this.iXQ.getVisibility() == 0)
    {
      this.iYb.setVisibility(0);
      return;
    }
    this.iYb.setVisibility(8);
  }

  public final void b(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    a(this.mContext.getString(paramInt), paramOnClickListener);
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
      z.e("!32@/B4Tb64lLpK6ZJSQRdrgGPCb19zAlM5/", "dismiss exception, e = " + localException.getMessage());
    }
  }

  public final Button getButton(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case -1:
      return this.hhs;
    case -2:
    }
    return this.iXQ;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(this.iXP);
  }

  public final void pm(int paramInt)
  {
    if (this.iz != null);
    while (this.iXT == null)
      return;
    this.iXT.setTextSize(paramInt);
  }

  public final void setCancelable(boolean paramBoolean)
  {
    super.setCancelable(paramBoolean);
    this.hkF = paramBoolean;
    setCanceledOnTouchOutside(this.hkF);
  }

  public final void setMessage(CharSequence paramCharSequence)
  {
    if (this.iz != null)
      return;
    this.iXX.setVisibility(0);
    this.iXS.setVisibility(0);
    this.iXS.setText(paramCharSequence);
  }

  public final void setTitle(int paramInt)
  {
    this.iXW.setVisibility(0);
    this.iXR.setVisibility(0);
    this.iXR.setText(paramInt);
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.iXW.setVisibility(0);
    this.iXR.setVisibility(0);
    this.iXR.setText(paramCharSequence);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.aa
 * JD-Core Version:    0.6.2
 */