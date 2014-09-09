package com.tencent.mm.ui.tools.a;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

final class m
  implements ViewTreeObserver.OnPreDrawListener
{
  final ad jWK;
  final Boolean jWL;
  g jWM;
  final WeakReference jWr;

  m(ad paramad, ImageView paramImageView, Boolean paramBoolean, g paramg)
  {
    this.jWK = paramad;
    this.jWr = new WeakReference(paramImageView);
    this.jWM = paramg;
    this.jWL = paramBoolean;
    paramImageView.getViewTreeObserver().addOnPreDrawListener(this);
  }

  final void cancel()
  {
    this.jWM = null;
    ImageView localImageView = (ImageView)this.jWr.get();
    if (localImageView == null);
    ViewTreeObserver localViewTreeObserver;
    do
    {
      return;
      localViewTreeObserver = localImageView.getViewTreeObserver();
    }
    while (!localViewTreeObserver.isAlive());
    localViewTreeObserver.removeOnPreDrawListener(this);
  }

  public final boolean onPreDraw()
  {
    ImageView localImageView = (ImageView)this.jWr.get();
    if (localImageView == null);
    ViewTreeObserver localViewTreeObserver;
    int i;
    int j;
    do
    {
      do
      {
        return true;
        localViewTreeObserver = localImageView.getViewTreeObserver();
      }
      while (!localViewTreeObserver.isAlive());
      i = localImageView.getMeasuredWidth();
      j = localImageView.getMeasuredHeight();
    }
    while ((i <= 0) || (j <= 0));
    localViewTreeObserver.removeOnPreDrawListener(this);
    if (this.jWL.booleanValue())
    {
      this.jWK.bbE().bn(i, j).bbG().a(localImageView, this.jWM);
      return true;
    }
    this.jWK.bbE().bn(i, j).a(localImageView, this.jWM);
    return true;
  }
}

/* Location:           /Users/zhouji/projects/wechat-android-study/classes_dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.a.m
 * JD-Core Version:    0.6.2
 */