package com.tencent.mm.ui.c.a;

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
import com.tencent.mm.n;
import com.tencent.mm.ui.base.au;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.l;
import com.tencent.smtt.sdk.ac;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class i extends au
{
  static final float[] jHI = { 20.0F, 60.0F };
  static final float[] jHJ = { 40.0F, 60.0F };
  static final FrameLayout.LayoutParams jHK = new FrameLayout.LayoutParams(-1, -1);
  private g jHL;
  private ProgressDialog jHM;
  private ImageView jHN;
  private MMWebView jHO;
  private FrameLayout jHP;
  private String mUrl;

  public i(Context paramContext, String paramString, g paramg)
  {
    super(paramContext, 16973840);
    this.mUrl = paramString;
    this.jHL = paramg;
  }

  protected final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jHM = new ProgressDialog(getContext());
    this.jHM.requestWindowFeature(1);
    this.jHM.setMessage(getContext().getString(n.bGW));
    requestWindowFeature(1);
    this.jHP = new FrameLayout(getContext());
    this.jHN = new ImageView(getContext());
    this.jHN.setOnClickListener(new j(this));
    Drawable localDrawable = getContext().getResources().getDrawable(h.Uh);
    this.jHN.setImageDrawable(localDrawable);
    this.jHN.setVisibility(4);
    int i = this.jHN.getDrawable().getIntrinsicWidth() / 2;
    LinearLayout localLinearLayout = new LinearLayout(getContext());
    this.jHO = l.cL(getContext());
    this.jHO.setVerticalScrollBarEnabled(false);
    this.jHO.setHorizontalScrollBarEnabled(false);
    this.jHO.setWebViewClient(new k(this, (byte)0));
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
      this.jHL.onCancel();
      dismiss();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.c.a.i
 * JD-Core Version:    0.6.2
 */