package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.graphics.drawable.Drawable;
import android.view.View;

public final class ad
{
  private a iYg;
  private Context mContext;

  public ad(Context paramContext)
  {
    this.mContext = paramContext;
    this.iYg = new a();
    this.iYg.iXp = -1;
  }

  public final ad BK(String paramString)
  {
    this.iYg.title = paramString;
    return this;
  }

  public final ad BL(String paramString)
  {
    this.iYg.iXh = paramString;
    return this;
  }

  public final ad BM(String paramString)
  {
    this.iYg.iXi = paramString;
    return this;
  }

  public final ad a(DialogInterface.OnDismissListener paramOnDismissListener)
  {
    this.iYg.hKs = paramOnDismissListener;
    return this;
  }

  public final ad a(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.iYg.iXj = paramString;
    this.iYg.iXm = paramOnClickListener;
    return this;
  }

  public final ad aRA()
  {
    this.iYg.iXl = true;
    return this;
  }

  public final aa aRB()
  {
    Context localContext = this.mContext;
    aa localaa = new aa(localContext);
    localaa.a(this.iYg);
    return localaa;
  }

  public final ad ao(View paramView)
  {
    this.iYg.hov = paramView;
    return this;
  }

  public final ad b(DialogInterface.OnCancelListener paramOnCancelListener)
  {
    this.iYg.hkO = paramOnCancelListener;
    return this;
  }

  public final ad b(String paramString, DialogInterface.OnClickListener paramOnClickListener)
  {
    this.iYg.iXk = paramString;
    this.iYg.iXn = paramOnClickListener;
    return this;
  }

  public final ad c(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    String str = this.mContext.getString(paramInt);
    this.iYg.iXj = str;
    this.iYg.iXm = paramOnClickListener;
    this.iYg.iXr = false;
    return this;
  }

  public final ad d(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(this.mContext.getString(paramInt), paramOnClickListener);
  }

  public final ad e(int paramInt, DialogInterface.OnClickListener paramOnClickListener)
  {
    return b(this.mContext.getString(paramInt), paramOnClickListener);
  }

  public final ad e(Drawable paramDrawable)
  {
    this.iYg.iXg = paramDrawable;
    return this;
  }

  public final ad eN(boolean paramBoolean)
  {
    this.iYg.hkF = paramBoolean;
    return this;
  }

  public final ad pn(int paramInt)
  {
    this.iYg.title = this.mContext.getString(paramInt);
    return this;
  }

  public final ad po(int paramInt)
  {
    this.iYg.iXh = this.mContext.getString(paramInt);
    return this;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.ad
 * JD-Core Version:    0.6.2
 */