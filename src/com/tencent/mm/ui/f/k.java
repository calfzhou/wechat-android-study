package com.tencent.mm.ui.f;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.jg.JgClassChecked;
import com.tencent.mm.h;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.smtt.sdk.ac;

@SuppressLint({"SetJavaScriptEnabled"})
@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class k extends Dialog
{
  static final float[] jHI = { 20.0F, 60.0F };
  static final float[] jHJ = { 40.0F, 60.0F };
  static final FrameLayout.LayoutParams jHK = new FrameLayout.LayoutParams(-1, -1);
  private ProgressDialog jHM;
  private ImageView jHN;
  private MMWebView jHO;
  private FrameLayout jHP;
  private m jZi;
  private String mUrl;

  public k(Context paramContext, String paramString, m paramm)
  {
    super(paramContext, 16973840);
    this.mUrl = paramString;
    this.jZi = paramm;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jHM = new ProgressDialog(getContext());
    this.jHM.requestWindowFeature(1);
    this.jHM.setMessage(getContext().getString(com.tencent.mm.n.cmG));
    requestWindowFeature(1);
    this.jHP = new FrameLayout(getContext());
    this.jHN = new ImageView(getContext());
    this.jHN.setOnClickListener(new l(this));
    Drawable localDrawable = getContext().getResources().getDrawable(h.Uh);
    this.jHN.setImageDrawable(localDrawable);
    this.jHN.setVisibility(4);
    int i = this.jHN.getDrawable().getIntrinsicWidth() / 2;
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.jHO = com.tencent.mm.ui.widget.l.cL(getContext());
    this.jHO.setVerticalScrollBarEnabled(false);
    this.jHO.setHorizontalScrollBarEnabled(false);
    this.jHO.setWebViewClient(new n(this, (byte)0));
    this.jHO.getSettings().setJavaScriptEnabled(true);
    this.jHO.loadUrl(this.mUrl);
    this.jHO.setLayoutParams(jHK);
    this.jHO.setVisibility(4);
    localLinearLayout.setPadding(i, i, i, i);
    localLinearLayout.addView(this.jHO);
    this.jHP.addView(localLinearLayout);
    this.jHP.addView(this.jHN, new ViewGroup.LayoutParams(-2, -2));
    addContentView(this.jHP, new ViewGroup.LayoutParams(-1, -1));
  }

  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      this.jZi.onCancel();
      dismiss();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.k
 * JD-Core Version:    0.6.2
 */